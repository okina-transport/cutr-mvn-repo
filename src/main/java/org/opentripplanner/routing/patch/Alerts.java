package org.opentripplanner.routing.patch;

import java.io.Serializable;

public class Alerts implements Serializable {
    private static final long serialVersionUID = 8305126586053909836L;
    public static final String defaultLanguage = "en";
    private AlertHeaderText alertHeaderText;
    public AlertHeaderText alertDescriptionText;
    public AlertHeaderText alertUrl;
    public String effectiveStartDate;

    public Alerts() {
    }

    public AlertHeaderText getAlertHeaderText() {
        return this.alertHeaderText;
    }

    public void setAlertHeaderText(AlertHeaderText alertHeaderText) {
        this.alertHeaderText = alertHeaderText;
    }

    public AlertHeaderText getAlertDescriptionText() {
        return this.alertDescriptionText;
    }

    public void setAlertDescriptionText(AlertHeaderText alertDescriptionText) {
        this.alertDescriptionText = alertDescriptionText;
    }

    public AlertHeaderText getAlertUrl() {
        return this.alertUrl;
    }

    public void setAlertUrl(AlertHeaderText alertUrl) {
        this.alertUrl = alertUrl;
    }

    public String getEffectiveStartDate() {
        return this.effectiveStartDate;
    }

    public void setEffectiveStartDate(String effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }
}
