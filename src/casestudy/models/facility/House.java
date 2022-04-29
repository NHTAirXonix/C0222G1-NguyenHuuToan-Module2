package casestudy.models.facility;

public class House extends Facility {
    private String roomStandard;
    private int floor;
    public String type = "House";

    public House() {
    }

    public House(String facilityId,
                 String serviceName,
                 double useArea,
                 double rentPrice,
                 int maximumPeople,
                 String rentType,
                 String roomStandard,
                 int floor) {
        super(facilityId, serviceName, useArea, rentPrice, maximumPeople, rentType);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getType() {
        return type;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "facilityId=" + super.getFacilityId() +
                "| serviceName='" + super.getServiceName() + '\'' +
                "| useArea=" + super.getUseArea() +
                "| rentPrice=" + super.getRentPrice() +
                "| maximumPeople=" + super.getMaximumPeople() +
                "| rentType='" + super.getRentType() + '\'' +
                "| roomStandardVilla='" + roomStandard + '\'' +
                "| floor=" + floor +
                '}';
    }
}
