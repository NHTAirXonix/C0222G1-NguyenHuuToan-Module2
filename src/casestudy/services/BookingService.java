package casestudy.services;

import java.io.IOException;

public interface BookingService extends Services {
    public void addBooking() throws IOException;

    public void displayListBooking() throws IOException;
}
