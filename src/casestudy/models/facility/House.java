package casestudy.models.facility;

public class  House extends Facility {
    private String roomStandard;
    private int floor;

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

}
