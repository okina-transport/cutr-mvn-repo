package org.opentripplanner.api.model;

import java.io.Serializable;

public class Note implements Serializable {
    private static final long serialVersionUID = 7749510083758752385L;
    public String text;

    public Note() {
    }

    public Note(String note) {
        this.text = note;
    }

    public boolean equals(Object o) {
        return o instanceof Note && ((Note)o).text.equals(this.text);
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    public String toString() {
        return this.text;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
