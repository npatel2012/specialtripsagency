package org.specialtripsagency.dataobject;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(6f632695a0a4c4112dbe26947b462831)
 */
@org.kie.api.definition.type.Label(value = "Hotel")
public class Hotel  implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Is Breakfast Included")
    @org.kie.api.definition.type.Position(value = 6)
    private java.lang.Boolean breakfastIncluded;
    
    @org.kie.api.definition.type.Label(value = "Duration Of Stay")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.Integer duration;
    
    @org.kie.api.definition.type.Label(value = "Hotel Identifier")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.Integer hotelId;
    
    @org.kie.api.definition.type.Label(value = "Hotel Name")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String hotelName;
    
    @org.kie.api.definition.type.Label(value = "Location of Stay")
    @org.kie.api.definition.type.Position(value = 5)
    private java.lang.String location;
    
    @org.kie.api.definition.type.Label(value = "Discount Provided Per Room")
    @org.kie.api.definition.type.Position(value = 7)
    private java.lang.Integer priceDiscount;
    
    @org.kie.api.definition.type.Label(value = "Room Price Per Day")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.Integer roomPrice;
    
    @org.kie.api.definition.type.Label(value = "Room Type")
    @org.kie.api.definition.type.Position(value = 4)
    private java.lang.String roomType;

    public Hotel() {
    }

    public Hotel(java.lang.String hotelName, java.lang.Integer hotelId, java.lang.Integer roomPrice, java.lang.Integer duration, java.lang.String roomType, java.lang.String location, java.lang.Boolean breakfastIncluded, java.lang.Integer priceDiscount) {
        this.hotelName = hotelName;
        this.hotelId = hotelId;
        this.roomPrice = roomPrice;
        this.duration = duration;
        this.roomType = roomType;
        this.location = location;
        this.breakfastIncluded = breakfastIncluded;
        this.priceDiscount = priceDiscount;
    }


    
    public java.lang.Boolean getBreakfastIncluded() {
        return this.breakfastIncluded;
    }

    public void setBreakfastIncluded(java.lang.Boolean breakfastIncluded) {
        this.breakfastIncluded = breakfastIncluded;
    }
    
    public java.lang.Integer getDuration() {
        return this.duration;
    }

    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }
    
    public java.lang.Integer getHotelId() {
        return this.hotelId;
    }

    public void setHotelId(java.lang.Integer hotelId) {
        this.hotelId = hotelId;
    }
    
    public java.lang.String getHotelName() {
        return this.hotelName;
    }

    public void setHotelName(java.lang.String hotelName) {
        this.hotelName = hotelName;
    }
    
    public java.lang.String getLocation() {
        return this.location;
    }

    public void setLocation(java.lang.String location) {
        this.location = location;
    }
    
    public java.lang.Integer getPriceDiscount() {
        return this.priceDiscount;
    }

    public void setPriceDiscount(java.lang.Integer priceDiscount) {
        this.priceDiscount = priceDiscount;
    }
    
    public java.lang.Integer getRoomPrice() {
        return this.roomPrice;
    }

    public void setRoomPrice(java.lang.Integer roomPrice) {
        this.roomPrice = roomPrice;
    }
    
    public java.lang.String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(java.lang.String roomType) {
        this.roomType = roomType;
    }
}