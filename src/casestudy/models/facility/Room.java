package casestudy.models.facility;

public class Room extends Facility {
    //dich vu mien phi di kem
    public String type = "Room";

    public Room() {
    }

    public Room(String facilityId,
                String serviceName,
                double useArea,
                double rentPrice,
                int maximumPeople,
                String rentType) {
        super(facilityId, serviceName, useArea, rentPrice, maximumPeople, rentType);
    }

    public String getType() {
        return type;
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
                '}';
    }
}
