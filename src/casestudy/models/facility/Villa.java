package casestudy.models.facility;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int floor;
    public String type = "Villa";

    public Villa() {
    }

    public Villa(String facilityId,
                 String serviceName,
                 double useArea,
                 double rentPrice,
                 int maximumPeople,
                 String rentType,
                 String roomStandard,
                 double poolArea,
                 int floor) {
        super(facilityId, serviceName, useArea, rentPrice, maximumPeople, rentType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getType() {
        return type;
    }

    public String getRoomStandard() {
        return this.roomStandard;
    }

    public void setRoomStandard(String roomStandardVilla) {
        this.roomStandard = roomStandardVilla;
    }

    public double getPoolArea() {
        return this.poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return this.floor;
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
                "| poolArea=" + poolArea +
                "| floor=" + floor +
                '}';
    }
}
