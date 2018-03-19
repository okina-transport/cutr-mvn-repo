package org.opentripplanner.routing.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.opentripplanner.routing.core.TraverseModeSet.1;

public class TraverseModeSet implements Cloneable, Serializable {
    private static final long serialVersionUID = 4761234567827129527L;
    private static final int MODE_BICYCLE = 1;
    private static final int MODE_WALK = 2;
    private static final int MODE_CAR = 4;
    private static final int MODE_BUS = 16;
    private static final int MODE_TRAM = 32;
    private static final int MODE_SUBWAY = 64;
    private static final int MODE_RAIL = 128;
    private static final int MODE_FERRY = 256;
    private static final int MODE_CABLE_CAR = 512;
    private static final int MODE_GONDOLA = 1024;
    private static final int MODE_FUNICULAR = 2048;
    private static final int MODE_TRAINISH = 3296;
    private static final int MODE_BUSISH = 528;
    private static final int MODE_TRANSIT = 4080;
    private int modes;

    public TraverseModeSet(String modelist) {
        this.modes = 0;
        this.modes = 0;
        String[] var2 = modelist.split(",");
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String modeStr = var2[var4];
            this.setMode(TraverseMode.valueOf(modeStr), true);
        }

    }

    public TraverseModeSet(TraverseMode... modes) {
        this.modes = 0;
        TraverseMode[] var2 = modes;
        int var3 = modes.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            TraverseMode mode = var2[var4];
            this.modes |= this.getMaskForMode(mode);
        }

    }

    private final int getMaskForMode(TraverseMode mode) {
        switch(1.$SwitchMap$org$opentripplanner$routing$core$TraverseMode[mode.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 512;
            case 7:
                return 1024;
            case 8:
                return 256;
            case 9:
                return 2048;
            case 10:
                return 64;
            case 11:
                return 128;
            case 12:
                return 3296;
            case 13:
                return 528;
            case 14:
                return 4080;
            default:
                return 0;
        }
    }

    public TraverseModeSet(List<TraverseMode> modeList) {
        this((TraverseMode[])modeList.toArray(new TraverseMode[0]));
    }

    public int getMask() {
        return this.modes;
    }

    public void setMode(TraverseMode mode, boolean value) {
        int mask = this.getMaskForMode(mode);
        if (value) {
            this.modes |= mask;
        } else {
            this.modes &= ~mask;
        }

    }

    public boolean getBicycle() {
        return (this.modes & 1) != 0;
    }

    public boolean getWalk() {
        return (this.modes & 2) != 0;
    }

    public boolean getCar() {
        return (this.modes & 4) != 0;
    }

    public boolean getTram() {
        return (this.modes & 32) != 0;
    }

    public boolean getTrainish() {
        return (this.modes & 3296) != 0;
    }

    public boolean getBusish() {
        return (this.modes & 528) != 0;
    }

    public boolean getBus() {
        return (this.modes & 16) != 0;
    }

    public boolean getGondola() {
        return (this.modes & 1024) != 0;
    }

    public boolean getFerry() {
        return (this.modes & 256) != 0;
    }

    public boolean getCableCar() {
        return (this.modes & 512) != 0;
    }

    public boolean getFunicular() {
        return (this.modes & 2048) != 0;
    }

    public boolean getRail() {
        return (this.modes & 128) != 0;
    }

    public boolean getSubway() {
        return (this.modes & 64) != 0;
    }

    public void setBicycle(boolean bicycle) {
        if (bicycle) {
            this.modes |= 1;
        } else {
            this.modes &= -2;
        }

    }

    public void setWalk(boolean walk) {
        if (walk) {
            this.modes |= 2;
        } else {
            this.modes &= -3;
        }

    }

    public void setCar(boolean car) {
        if (car) {
            this.modes |= 4;
        } else {
            this.modes &= -5;
        }

    }

    public void setTram(boolean tram) {
        if (tram) {
            this.modes |= 32;
        } else {
            this.modes &= -33;
        }

    }

    public void setTrainish(boolean trainish) {
        if (trainish) {
            this.modes |= 3296;
        } else {
            this.modes &= -3297;
        }

    }

    public void setBus(boolean bus) {
        if (bus) {
            this.modes |= 16;
        } else {
            this.modes &= -17;
        }

    }

    public void setBusish(boolean busish) {
        if (busish) {
            this.modes |= 528;
        } else {
            this.modes &= -529;
        }

    }

    public void setFerry(boolean ferry) {
        if (ferry) {
            this.modes |= 256;
        } else {
            this.modes &= -257;
        }

    }

    public void setCableCar(boolean cableCar) {
        if (cableCar) {
            this.modes |= 512;
        } else {
            this.modes &= -513;
        }

    }

    public void setGondola(boolean gondola) {
        if (gondola) {
            this.modes |= 1024;
        } else {
            this.modes &= -1025;
        }

    }

    public void setFunicular(boolean funicular) {
        if (funicular) {
            this.modes |= 2048;
        } else {
            this.modes &= -2049;
        }

    }

    public void setSubway(boolean subway) {
        if (subway) {
            this.modes |= 64;
        } else {
            this.modes &= -65;
        }

    }

    public void setRail(boolean rail) {
        if (rail) {
            this.modes |= 128;
        } else {
            this.modes &= -129;
        }

    }

    public boolean getTransit() {
        return (this.modes & 4080) != 0;
    }

    public void setTransit(boolean transit) {
        if (transit) {
            this.modes |= 4080;
        } else {
            this.modes &= -4081;
        }

    }

    public boolean getTraininsh() {
        return (this.modes & 3296) != 0;
    }

    public List<TraverseMode> getModes() {
        ArrayList<TraverseMode> modeList = new ArrayList();
        TraverseMode[] var2 = TraverseMode.values();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            TraverseMode mode = var2[var4];
            int mask = this.getMaskForMode(mode);
            if (mask != 0 && (this.modes & mask) == mask) {
                modeList.add(mode);
            }
        }

        return modeList;
    }

    public boolean isValid() {
        return this.modes != 0;
    }

    public boolean contains(TraverseMode mode) {
        return (this.modes & this.getMaskForMode(mode)) != 0;
    }

    public boolean get(int modeMask) {
        return (this.modes & modeMask) != 0;
    }

    public String toString() {
        StringBuilder out = new StringBuilder();
        TraverseMode[] var2 = TraverseMode.values();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            TraverseMode mode = var2[var4];
            int mask = this.getMaskForMode(mode);
            if (mask != 0 && (this.modes & mask) == mask) {
                if (out.length() != 0) {
                    out.append(",");
                }

                out.append(mode);
            }
        }

        return out.toString();
    }

    public TraverseModeSet clone() {
        try {
            return (TraverseModeSet)super.clone();
        } catch (CloneNotSupportedException var2) {
            throw new RuntimeException(var2);
        }
    }

    public TraverseMode getNonTransitMode() {
        if (this.contains(TraverseMode.CAR)) {
            return TraverseMode.CAR;
        } else if (this.contains(TraverseMode.BICYCLE)) {
            return TraverseMode.BICYCLE;
        } else {
            return this.contains(TraverseMode.WALK) ? TraverseMode.WALK : null;
        }
    }
}
