package org.opentripplanner.routing.patch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.ArrayList;

@JsonIgnoreProperties(
        ignoreUnknown = true
)
public class Translations implements Serializable {
    private ArrayList<Entry> entry;
    protected String value;

    public Translations() {
    }

    public Translations(String value) {
        this.value = value;
    }

    public String getEn() {
        return this.value;
    }

    public void setEn(String en) {
        this.value = en;
    }

    public ArrayList<Entry> getEntry() {
        return this.entry;
    }

    public void setEntry(ArrayList<Entry> entry) {
        this.entry = entry;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
