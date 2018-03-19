package org.opentripplanner.api.ws;

import java.util.Locale;
import java.util.logging.Level;
import org.opentripplanner.util.Properties;

public enum Message {
    PLAN_OK(200),
    SYSTEM_ERROR(500),
    OUTSIDE_BOUNDS(400),
    PATH_NOT_FOUND(404),
    NO_TRANSIT_TIMES(406),
    REQUEST_TIMEOUT(408),
    BOGUS_PARAMETER(413),
    GEOCODE_FROM_NOT_FOUND(440),
    GEOCODE_TO_NOT_FOUND(450),
    GEOCODE_FROM_TO_NOT_FOUND(460),
    TOO_CLOSE(409),
    LOCATION_NOT_ACCESSIBLE(470),
    GEOCODE_FROM_AMBIGUOUS(340),
    GEOCODE_TO_AMBIGUOUS(350),
    GEOCODE_FROM_TO_AMBIGUOUS(360),
    UNDERSPECIFIED_TRIANGLE(370),
    TRIANGLE_NOT_AFFINE(371),
    TRIANGLE_OPTIMIZE_TYPE_NOT_SET(372),
    TRIANGLE_VALUES_NOT_SET(373);

    private Properties _c = this.getConfig();
    private final int m_id;

    private Message(int id) {
        this.m_id = id;
    }

    public int getId() {
        return this.m_id;
    }

    public Properties getConfig() {
        if (this._c == null) {
            this._c = new Properties(Message.class);
        }

        return this._c;
    }

    public String get(String def, Locale l) {
        try {
            this.getConfig();
            return this._c.get(this.name(), l);
        } catch (Exception var4) {
            Properties.LOGGER.log(Level.ALL, "No entry in Message.properties file could be found for string " + this.name());
            return def;
        }
    }

    public String get(Locale l) {
        return this.get("", l);
    }

    public String get() {
        return this.get("", Locale.getDefault());
    }

    public static Message findEnumByProperty(String value, Locale l) {
        Message retVal = null;

        try {
            value = value.trim();
            if (value.length() > 0) {
                Message[] var3 = values();
                int var4 = var3.length;

                for(int var5 = 0; var5 < var4; ++var5) {
                    Message k = var3[var5];
                    if (value.equals(k.get(l))) {
                        retVal = k;
                        break;
                    }
                }
            }
        } catch (Exception var7) {
            ;
        }

        return retVal;
    }

    public static Message findEnumByProperty(String value) {
        return findEnumByProperty(value, Locale.getDefault());
    }
}
