package casestudy.services;

import java.io.IOException;

public interface FacilityService{
    public void display() throws IOException;
    public void displayMaintain();
    public void addFacility(String input) throws IOException;
}
