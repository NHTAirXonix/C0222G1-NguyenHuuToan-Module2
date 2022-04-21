package casestudy.models.facility;

public class Room extends Facility {
    //dich vu mien phi di kem

    public Room() {
    }

    public Room(String facilityId,
                String serviceName,
                int useArea,
                double rentPrice,
                int maximumPeople,
                String rentType) {
        super(facilityId, serviceName, useArea, rentPrice, maximumPeople, rentType);
    }
}
