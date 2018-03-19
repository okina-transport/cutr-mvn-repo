package org.opentripplanner.v092snapshot.api.ws;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.HashMap;
import org.opentripplanner.api.model.error.PlannerError;
import org.opentripplanner.v092snapshot.api.model.TripPlan;

@JsonIgnoreProperties(
        ignoreUnknown = true
)
public class Response {
    private HashMap<String, String> requestParameters;
    private TripPlan plan;
    private PlannerError error = null;

    public Response() {
    }

    public HashMap<String, String> getRequestParameters() {
        return this.requestParameters;
    }

    public void setRequestParameters(HashMap<String, String> requestParameters) {
        this.requestParameters = requestParameters;
    }

    public TripPlan getPlan() {
        return this.plan;
    }

    public void setPlan(TripPlan plan) {
        this.plan = plan;
    }

    public PlannerError getError() {
        return this.error;
    }

    public void setError(PlannerError error) {
        this.error = error;
    }
}
