package casestudy.models;

public abstract class Facility {
    private String serviceName ;
    private int useArea;
    private double rentPrice;
    private int maximumPeople;
    private String rentType;

    public Facility() {
    }

    public Facility(String serviceName, int useArea, double rentPrice, int maximumPeople, String rentType) {
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.rentPrice = rentPrice;
        this.maximumPeople = maximumPeople;
        this.rentType = rentType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUseArea() {
        return useArea;
    }

    public void setUseArea(int useArea) {
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
}
