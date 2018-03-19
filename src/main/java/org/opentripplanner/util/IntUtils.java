package org.opentripplanner.util;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IntUtils {
    private static final Logger LOGGER = Logger.getLogger(IntUtils.class.getCanonicalName());
    public static final String POINT_PREFIX = "POINT(";

    public IntUtils() {
    }

    public static boolean looksLikeCoordinate(String str) {
        return str != null && (str.contains("POINT(") || str.matches("[\\s]*[0-9\\-.]+[,\\s]+[0-9\\-.]+[\\s]*"));
    }

    public static final double roundDouble(double d, int places) {
        return (double)Math.round(d * Math.pow(10.0D, (double)places)) / Math.pow(10.0D, (double)places);
    }

    public static List<Integer> asList(String str) {
        return asList(str, ",");
    }

    public static List<Integer> asList(String str, String sep) {
        ArrayList retVal = new ArrayList();

        try {
            String[] s = str.split(sep);

            for(int i = 0; i < s.length; ++i) {
                Integer k = null;

                try {
                    k = Integer.parseInt(s[i].trim());
                } catch (Exception var7) {
                    ;
                }

                if (k != null) {
                    retVal.add(k);
                }
            }
        } catch (Exception var8) {
            ;
        }

        return retVal;
    }

    public static Integer getZipFromString(String zipStr) {
        Integer retVal = null;

        try {
            retVal = getIntegerFromSubString(zipStr, "-");
            if (retVal == null) {
                retVal = getIntegerFromString(zipStr);
            }
        } catch (Exception var3) {
            retVal = null;
        }

        return retVal;
    }

    public static short getShortFromString(String input) {
        return (short)getIntFromString(input);
    }

    public static int getIntFromString(String input) {
        int retVal = 0;
        Integer n = getIntegerFromString(input);
        if (n != null) {
            retVal = n;
        } else if (input != null) {
            retVal = input.hashCode();
        }

        return retVal;
    }

    public static Integer getIntegerFromString(String input) {
        try {
            return new Integer(input);
        } catch (Exception var4) {
            try {
                String in = input.replaceAll("\\D", "");
                return new Integer(in);
            } catch (Exception var3) {
                return null;
            }
        }
    }

    public static Integer getIntegerFromString(String input, Integer def) {
        Integer retVal = getIntegerFromString(input);
        if (retVal == null) {
            retVal = def;
        }

        return retVal;
    }

    public static Integer getIntegerFromSubString(String input, int len) {
        String tmp = input.substring(len);
        return getIntegerFromString(tmp.trim());
    }

    public static Integer getIntegerFromSubString(String target, String prefix, String suffix) {
        if (target == null) {
            return null;
        } else {
            Integer retVal = null;

            try {
                String tmp = target;
                int suf;
                if (prefix != null && target.contains(prefix)) {
                    suf = prefix.length();
                    int in = target.indexOf(prefix);
                    tmp = target.substring(in + suf);
                }

                if (tmp != null && suffix != null && target.contains(suffix)) {
                    suf = tmp.indexOf(suffix);
                    if (suf <= 0 && suffix.equals(" ")) {
                        suf = tmp.length();
                    }

                    tmp = tmp.substring(0, suf);
                    retVal = getIntegerFromString(tmp.trim());
                }
            } catch (Exception var7) {
                LOGGER.log(Level.INFO, "Not a big deal that we couldn't find an int from substring...going to return null", var7);
                retVal = null;
            }

            return retVal;
        }
    }

    public static Integer getIntegerFromSubString(String target, String suffix) {
        return getIntegerFromSubString(target, (String)null, suffix);
    }

    public static Double getDoubleFromString(String input) {
        try {
            return new Double(input);
        } catch (Exception var2) {
            LOGGER.log(Level.INFO, "Not a big deal...going to return null", var2);
            return null;
        }
    }

    public static long getLongFromString(String input) {
        return getLongFromString(input, -111L);
    }

    public static long getLongFromString(String input, long def) {
        try {
            return new Long(input);
        } catch (Exception var4) {
            LOGGER.log(Level.INFO, "Not a big deal...going to return default value", var4);
            return def;
        }
    }
}
