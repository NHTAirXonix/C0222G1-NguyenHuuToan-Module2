package casestudy.models.facility;

public class Villa extends Facility {
    private String roomStandardVilla;
    private double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String facilityId,
                 String serviceName,
                 int useArea,
                 double rentPrice,
                 int maximumPeople,
                 String rentType,
                 String roomStandard,
                 double poolArea,
                 int floor) {
        super(facilityId, serviceName, useArea, rentPrice, maximumPeople, rentType);
        this.roomStandardVilla = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }


    public String getRoomStandard() {
        return roomStandardVilla;
    }

    public void setRoomStandard(String roomStandardVilla) {
        this.roomStandardVilla = roomStandardVilla;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
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
                ", serviceName='" + super.getServiceName() + '\'' +
                ", useArea=" + super.getUseArea() +
                ", rentPrice=" + super.getRentPrice() +
                ", maximumPeople=" + super.getMaximumPeople() +
                ", rentType='" + super.getRentType() + '\'' +
                ", roomStandardVilla='" + roomStandardVilla + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                '}';
    }
}
