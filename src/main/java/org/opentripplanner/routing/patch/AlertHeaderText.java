
package org.opentripplanner.routing.patch;

import java.io.Serializable;

public class AlertHeaderText implements Serializable {
    private static final long serialVersionUID = -2726255462265642201L;
    private Translations translations;
    private String someTranslation;

    public AlertHeaderText() {
    }

    public Translations getTranslations() {
        return this.translations;
    }

    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    public String getSomeTranslation() {
        return this.someTranslation;
    }

    public void setSomeTranslation(String someTranslation) {
        this.someTranslation = someTranslation;
    }
}
