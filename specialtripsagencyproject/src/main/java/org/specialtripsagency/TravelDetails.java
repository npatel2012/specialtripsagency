package org.specialtripsagency;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(5a7eed80a3115c436ec37f6dc0303a3a)
 */
@org.kie.api.definition.type.Label(value = "TravelDetails")
public class TravelDetails extends java.lang.Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "From Destination")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String fromDestination;
    
    @org.kie.api.definition.type.Label(value = "Preferred Date Of Arrival")
    @org.kie.api.definition.type.Position(value = 3)
    private java.util.Date preferredDateOfArrival;
    
    @org.kie.api.definition.type.Label(value = "Preferred Date Of Departure")
    @org.kie.api.definition.type.Position(value = 2)
    private java.util.Date preferredDateOfDeparture;
    
    @org.kie.api.definition.type.Label(value = "To Destination")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String toDestination;

    public TravelDetails() {
    }

    public TravelDetails(java.lang.String fromDestination, java.lang.String toDestination, java.util.Date preferredDateOfDeparture, java.util.Date preferredDateOfArrival) {
        this.fromDestination = fromDestination;
        this.toDestination = toDestination;
        this.preferredDateOfDeparture = preferredDateOfDeparture;
        this.preferredDateOfArrival = preferredDateOfArrival;
    }


    
    public java.lang.String getFromDestination() {
        return this.fromDestination;
    }

    public void setFromDestination(java.lang.String fromDestination) {
        this.fromDestination = fromDestination;
    }
    
    public java.util.Date getPreferredDateOfArrival() {
        return this.preferredDateOfArrival;
    }

    public void setPreferredDateOfArrival(java.util.Date preferredDateOfArrival) {
        this.preferredDateOfArrival = preferredDateOfArrival;
    }
    
    public java.util.Date getPreferredDateOfDeparture() {
        return this.preferredDateOfDeparture;
    }

    public void setPreferredDateOfDeparture(java.util.Date preferredDateOfDeparture) {
        this.preferredDateOfDeparture = preferredDateOfDeparture;
    }
    
    public java.lang.String getToDestination() {
        return this.toDestination;
    }

    public void setToDestination(java.lang.String toDestination) {
        this.toDestination = toDestination;
    }
}