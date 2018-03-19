package org.opentripplanner.v092snapshot.common.model;

import java.io.Serializable;

public class T2<E1, E2> implements Serializable {
    private static final long serialVersionUID = 1L;
    private final E1 _first;
    private final E2 _second;

    public T2(E1 first, E2 second) {
        this._first = first;
        this._second = second;
    }

    public E1 getFirst() {
        return this._first;
    }

    public E2 getSecond() {
        return this._second;
    }

    public int hashCode() {
        int prime = true;
        int result = 1;
        int result = 31 * result + (this._first == null ? 0 : this._first.hashCode());
        result = 31 * result + (this._second == null ? 0 : this._second.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            T2<?, ?> other = (T2)obj;
            if (this._first == null) {
                if (other._first != null) {
                    return false;
                }
            } else if (!this._first.equals(other._first)) {
                return false;
            }

            if (this._second == null) {
                if (other._second != null) {
                    return false;
                }
            } else if (!this._second.equals(other._second)) {
                return false;
            }

            return true;
        }
    }

    public String toString() {
        return "T2(" + this._first + ", " + this._second + ")";
    }
}
