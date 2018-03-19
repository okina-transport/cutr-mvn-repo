package org.opentripplanner.util;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Properties {
    public static final Logger LOGGER = Logger.getLogger(Properties.class.getCanonicalName());
    private final String _bundle;

    public Properties() {
        this(Properties.class);
    }

    public Properties(Class c) {
        this._bundle = c.getSimpleName();
    }

    public Properties(String bun) {
        this._bundle = bun;
    }

    public static ResourceBundle getBundle(String name, Locale l) {
        try {
            return ResourceBundle.getBundle(name, l);
        } catch (Exception var3) {
            LOGGER.log(Level.ALL, "Uh oh...no .properties file could be found, so things are most definately not going to turn out well!!!", var3);
            return null;
        }
    }

    public synchronized String get(String name, Locale l) throws Exception {
        ResourceBundle rb = getBundle(this._bundle, l);
        return rb.getString(name);
    }

    public synchronized String get(String name) throws Exception {
        ResourceBundle rb = getBundle(this._bundle, Locale.getDefault());
        return rb.getString(name);
    }

    public String get(String name, String def, Locale l) {
        String retVal = null;

        try {
            retVal = this.get(name, l);
        } catch (Exception var6) {
            ;
        }

        if (retVal == null || retVal.length() < 1) {
            retVal = def;
        }

        return retVal;
    }

    public String get(String name, String def) {
        return this.get(name, def, Locale.getDefault());
    }

    public boolean get(String name, boolean def, Locale l) {
        boolean retVal = def;

        try {
            String s = this.get(name, l);
            if (s.toLowerCase().equals("true")) {
                retVal = true;
            }
        } catch (Exception var6) {
            retVal = def;
        }

        return retVal;
    }

    public boolean get(String name, boolean def) {
        return this.get(name, def, Locale.getDefault());
    }

    public int get(String name, int def, Locale l) {
        String tmp = this.get(name, Integer.toString(def), l);
        return IntUtils.getIntFromString(tmp);
    }

    public int get(String name, int def) {
        return this.get(name, def, Locale.getDefault());
    }

    public long get(String name, long def, Locale l) {
        String tmp = this.get(name, Long.toString(def), l);
        return IntUtils.getLongFromString(tmp);
    }

    public long get(String name, long def) {
        return this.get(name, def, Locale.getDefault());
    }

    public boolean is(String name, Locale l) {
        boolean retVal = false;

        try {
            String r = this.get(name, l);
            if (r != null && r.equalsIgnoreCase("true")) {
                retVal = true;
            }
        } catch (Exception var5) {
            ;
        }

        return retVal;
    }

    public boolean is(String name) {
        return this.is(name, Locale.getDefault());
    }

    public synchronized String format(String name, Locale l, Object... args) {
        try {
            ResourceBundle rb = getBundle(this._bundle, l);
            return MessageFormat.format(rb.getString(name), args);
        } catch (Exception var5) {
            LOGGER.log(Level.CONFIG, "couldn't find / format property " + name + "; returning null", var5);
            return null;
        }
    }

    public synchronized String format(String name, Object... args) {
        return this.format(name, Locale.getDefault(), args);
    }
}
