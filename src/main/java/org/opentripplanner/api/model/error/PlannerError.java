package org.opentripplanner.api.model.error;

import java.util.ArrayList;
import java.util.List;

public class PlannerError {
    private int id;
    private String msg;
    private List<String> missing = new ArrayList();
    private boolean noPath = false;

    public PlannerError() {
        this.noPath = true;
    }

    public PlannerError(boolean np) {
        this.noPath = np;
    }

    public PlannerError(String msg) {
        this.setMsg(msg);
    }

    public PlannerError(List<String> missing) {
        this.setMissing(missing);
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMissing(List<String> missing) {
        this.missing = missing;
    }

    public List<String> getMissing() {
        return this.missing;
    }

    public void setNoPath(boolean noPath) {
        this.noPath = noPath;
    }

    public boolean getNoPath() {
        return this.noPath;
    }
}
