package org.opentripplanner.v092snapshot.util.model;

import java.io.Serializable;

public class EncodedPolylineBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String points;
    private String levels;
    private int length;

    public EncodedPolylineBean() {
    }

    public EncodedPolylineBean(String points, String levels, int length) {
        this.points = points;
        this.levels = levels;
        this.length = length;
    }

    public String getPoints() {
        return this.points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getLevels() {
        return this.levels;
    }

    public String getLevels(int defaultLevel) {
        if (this.levels != null) {
            return this.levels;
        } else {
            StringBuilder b = new StringBuilder();
            String l = encodeNumber(defaultLevel);

            for(int i = 0; i < this.length; ++i) {
                b.append(l);
            }

            return b.toString();
        }
    }

    public void setLevels(String levels) {
        this.levels = levels;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private static String encodeNumber(int num) {
        StringBuffer encodeString;
        for(encodeString = new StringBuffer(); num >= 32; num >>= 5) {
            int nextValue = (32 | num & 31) + 63;
            encodeString.append((char)nextValue);
        }

        num += 63;
        encodeString.append((char)num);
        return encodeString.toString();
    }
}
