package casestudy.services;

import java.io.IOException;

public interface FacilityService extends Services{
    public void display() throws IOException;
    public void displayMaintain();
    public void addNewVilla() throws IOException;
    public void addNewHouse() throws IOException;
    public void addNewRoom() throws IOException;
}
