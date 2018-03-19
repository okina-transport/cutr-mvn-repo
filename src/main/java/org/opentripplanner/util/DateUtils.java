package org.opentripplanner.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DateUtils implements DateConstants {
    private static final Logger LOGGER = Logger.getLogger(DateUtils.class.getCanonicalName());

    public DateUtils() {
    }

    public static Date toDate(String date, String time) {
        Date retVal = new Date();
        if (date != null) {
            Date d = parseDate(date);
            Integer s = null;
            if (time != null) {
                s = secPastMid(time);
            }

            if (s == null || s < 0) {
                s = secPastMid();
            }

            if (d != null && s != null) {
                retVal = new Date(d.getTime() + (long)(s * 1000));
            }
        } else if (time != null) {
            Integer s = secPastMid(time);
            if (s != null && s > 0) {
                String p = formatDate("MM-dd-yyyy", retVal);
                Date d = parseDate(p);
                retVal = new Date(d.getTime() + (long)(s * 1000));
            }
        }

        return retVal;
    }

    public static String todayAsString() {
        return formatDate("MM-dd-yyyy", new Date());
    }

    public static String nowAsString() {
        return formatDate("hh:mm:ss a", new Date());
    }

    public static Date parseDate(String input) {
        Date retVal = null;

        try {
            String newString = input.replace('_', '.').replace('-', '.').replace(':', '.').replace('/', '.');
            if (newString != null) {
                String[] dl = DF_LIST;
                if (newString.length() <= 8 && !newString.matches(".*20\\d\\d.*")) {
                    dl = SMALL_DF_LIST;
                }

                String[] var4 = dl;
                int var5 = dl.length;

                for(int var6 = 0; var6 < var5; ++var6) {
                    String df = var4[var6];
                    retVal = parseDate(new SimpleDateFormat(df), newString);
                    if (retVal != null) {
                        break;
                    }
                }
            }

            return retVal;
        } catch (Exception var8) {
            throw new RuntimeException("Could not parse " + input);
        }
    }

    public static Integer getDurationInMinutes(String timeA, String timeB) {
        return getDuration(timeA, timeB) / 60;
    }

    public static Integer getDuration(String timeA, String timeB) {
        int a = secPastMid(timeA);
        int b = secPastMid(timeB);
        if (b < a) {
            b += ONE_DAY_SECONDS;
        }

        return b - a;
    }

    public static int secPastMid() {
        return secPastMid(new Date());
    }

    public static synchronized int secPastMid(Date dateTime) {
        String t = simpTimeSDF.format(dateTime);
        return secPastMid(t);
    }

    public static int secPastMid(String time) {
        int retVal = 0;
        Integer tmp = secondsPastMidnight(time);
        if (tmp != null) {
            retVal = tmp;
        }

        return retVal;
    }

    public static Integer secondsPastMidnight(String time) {
        Integer retVal = null;
        boolean amPm = false;
        int addHours = 0;
        int hour = false;
        int min = false;
        int sec = 0;

        try {
            String[] hms = time.toUpperCase().split(":");
            if (hms.length < 2) {
                return getIntegerFromString(time);
            }

            int suffex;
            if (hms[1].endsWith("PM") || hms[1].endsWith("AM")) {
                amPm = true;
                if (hms[1].contains("PM")) {
                    addHours = 12;
                }

                suffex = hms[1].lastIndexOf(32);
                if (suffex < 1) {
                    suffex = hms[1].lastIndexOf("AM");
                    if (suffex < 1) {
                        suffex = hms[1].lastIndexOf("PM");
                    }
                }

                hms[1] = hms[1].substring(0, suffex);
            }

            suffex = Integer.parseInt(trim(hms[0]));
            if (amPm && suffex == 12) {
                suffex = 0;
            }

            int hour = suffex + addHours;
            int min = Integer.parseInt(trim(hms[1]));
            if (hms.length > 2) {
                sec = Integer.parseInt(trim(hms[2]));
            }

            retVal = hour * 60 * 60 + min * 60 + sec;
        } catch (Exception var9) {
            LOGGER.log(Level.INFO, time + " didn't parse", var9);
            retVal = null;
        }

        return retVal;
    }

    public static int getIntegerFromString(String input) {
        try {
            return new Integer(input);
        } catch (Exception var2) {
            return 0;
        }
    }

    public static long getTimeInMillis(String time) {
        Integer secs = secondsPastMidnight(time);
        if (secs == null) {
            secs = 0;

            try {
                int isPM = 0;
                String[] t = time.split("[\\W]+");
                if (t.length >= 3 && t[2].trim().equalsIgnoreCase("PM")) {
                    isPM = 12;
                }

                secs = (Integer.valueOf(t[0]) + isPM) * 60 * 60;
                secs = secs + Integer.valueOf(t[1]) * 60;
            } catch (Exception var4) {
                ;
            }
        }

        return (long)(secs * 1000);
    }

    public static String getTime(int time) {
        String retVal = secondsToString(time) + " " + getAmPm(time);
        return retVal;
    }

    public static String secondsToString(int time) {
        return secondsToString(time, false);
    }

    public static String secondsToString(int time, boolean withAmPm) {
        if (time < 0) {
            return null;
        } else {
            String minutesStr = secondsToMinutes(time);
            String hoursStr = secondsToHour(time);
            String amPmStr = withAmPm ? getAmPm(time) : "";
            return new String(hoursStr + ":" + minutesStr + amPmStr);
        }
    }

    public static String secondsToHour(int time) {
        if (time < 0) {
            return null;
        } else {
            int hours = time / 3600 % 12;
            String hoursStr = hours == 0 ? "12" : hours + "";
            return new String(hoursStr);
        }
    }

    public static String secondsToMinutes(int time) {
        if (time < 0) {
            return null;
        } else {
            int minutes = time / 60 % 60;
            String minutesStr = (minutes < 10 ? "0" : "") + minutes;
            return new String(minutesStr);
        }
    }

    public static String getAmPm(int time) {
        return getAmPm(time, "am", "pm");
    }

    public static String getAmPm(int time, String am, String pm) {
        return time % 86400 >= 43200 ? pm : am;
    }

    public static String trim(String str) {
        String retVal = str;

        try {
            retVal = str.trim();
            retVal = retVal.replaceAll("%20;", "");
            retVal = retVal.replaceAll("%20", "");
        } catch (Exception var3) {
            ;
        }

        return retVal;
    }

    public static String formatDate(String sdfFormat, Date date) {
        return formatDate(sdfFormat, date, (String)null);
    }

    public static String formatDate(String sdfFormat, Date date, String defValue) {
        String retVal;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(sdfFormat);
            retVal = sdf.format(date);
        } catch (Exception var5) {
            retVal = defValue;
        }

        return retVal;
    }

    public static Date parseDate(String sdf, String string) {
        return parseDate(new SimpleDateFormat(sdf), string);
    }

    public static synchronized Date parseDate(SimpleDateFormat sdf, String string) {
        sdf.setLenient(true);

        try {
            return sdf.parse(string);
        } catch (Exception var3) {
            return null;
        }
    }
}
