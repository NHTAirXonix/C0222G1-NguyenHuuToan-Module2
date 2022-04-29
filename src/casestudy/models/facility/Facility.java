package casestudy.models.facility;

public abstract class Facility {
    private String facilityId;
    private String serviceName;
    private double useArea;
    private double rentPrice;
    private int maximumPeople;
    private String rentType;
    public Facility() {

    }


    public Facility(String facilityId, String serviceName, double useArea, double rentPrice, int maximumPeople, String rentType) {
        this.facilityId = facilityId;
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.rentPrice = rentPrice;
        this.maximumPeople = maximumPeople;
        this.rentType = rentType;
    }


    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "facilityId=" + facilityId +
                "| serviceName='" + serviceName +
                "| useArea=" + useArea +
                "| rentPrice=" + rentPrice +
                "| maximumPeople=" + maximumPeople +
                "| rentType='" + rentType + '\'' +
                '}';
    }
}
