package org.opentripplanner.v092snapshot.api.model;

import java.io.Serializable;

public class Note implements Serializable {
    private static final long serialVersionUID = 5583945110855320172L;
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
}
