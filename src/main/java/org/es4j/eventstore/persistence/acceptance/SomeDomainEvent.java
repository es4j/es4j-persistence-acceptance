package org.es4j.eventstore.persistence.acceptance;

//[Serializable]

import java.io.Serializable;

public class SomeDomainEvent implements Serializable {

    public String someProperty; // { get; set; }

    public SomeDomainEvent(String someProperty) {
        this.someProperty = someProperty;
    }

    @Override
    public String toString() {
        return this.someProperty;
    }

    public String getSomeProperty() {
        return someProperty;
    }

    public void setSomeProperty(String someProperty) {
        this.someProperty = someProperty;
    }

}
