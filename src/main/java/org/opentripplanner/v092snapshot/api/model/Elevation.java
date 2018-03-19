package org.opentripplanner.v092snapshot.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.opentripplanner.v092snapshot.common.model.P2;

@JsonIgnoreProperties(
        ignoreUnknown = true
)
public class Elevation {
    double first;
    double second;
    List<P2<Double>> elevation = new ArrayList();

    public Elevation(String data) {
        String[] values = data.split(",");

        for(int i = 0; i < values.length; i += 2) {
            P2<Double> value = new P2(Double.parseDouble(values[i]), Double.parseDouble(values[i + 1]));
            this.elevation.add(value);
        }

    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        Iterator var2 = this.elevation.iterator();

        while(var2.hasNext()) {
            P2<Double> pair = (P2)var2.next();
            str.append(Math.round((Double)pair.getFirst()));
            str.append(",");
            str.append((double)Math.round((Double)pair.getSecond() * 10.0D) / 10.0D);
            str.append(",");
        }

        if (str.length() > 0) {
            str.setLength(str.length() - 1);
        }

        return str.toString();
    }

    public double getFirst() {
        return this.first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return this.second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public List<P2<Double>> getElevation() {
        return this.elevation;
    }

    public void setElevation(List<P2<Double>> elevation) {
        this.elevation = elevation;
    }
}
