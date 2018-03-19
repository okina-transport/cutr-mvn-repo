package org.opentripplanner.api.model;

import java.io.Serializable;

public class AgencyAndId implements Serializable, Comparable<AgencyAndId> {
    private static final long serialVersionUID = 1L;
    private String agencyId;
    private String id;

    public AgencyAndId() {
    }

    public AgencyAndId(String agencyIdandStopId) {
        String[] agencyIdandStopIdSeparated = agencyIdandStopId.split(":", 2);
        this.agencyId = agencyIdandStopIdSeparated[0];
        this.id = agencyIdandStopIdSeparated[1];
    }

    public AgencyAndId(String agencyId, String id) {
        this.agencyId = agencyId;
        this.id = id;
    }

    public String getAgencyId() {
        return this.agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean hasValues() {
        return this.agencyId != null && this.id != null;
    }

    public int compareTo(AgencyAndId o) {
        int c = this.agencyId.compareTo(o.agencyId);
        if (c == 0) {
            c = this.id.compareTo(o.id);
        }

        return c;
    }

    public static AgencyAndId convertFromString(String value, char separator) {
        int index = value.indexOf(separator);
        if (index == -1) {
            throw new IllegalStateException("invalid agency-and-id: " + value);
        } else {
            return new AgencyAndId(value.substring(0, index), value.substring(index + 1));
        }
    }

    public int hashCode() {
        return this.agencyId.hashCode() ^ this.id.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (!(obj instanceof AgencyAndId)) {
            return false;
        } else {
            AgencyAndId other = (AgencyAndId)obj;
            if (!this.agencyId.equals(other.agencyId)) {
                return false;
            } else {
                return this.id.equals(other.id);
            }
        }
    }

    public String toString() {
        return this.agencyId + "_" + this.id;
    }
}
