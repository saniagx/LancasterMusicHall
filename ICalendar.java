import java.sql.Date;
import java.util.ArrayList;

public interface ICalendar {
    void addEvent(IEvent event);

    void removeEvent(int eventID);

    // All event attributes can be accessed via the event interfaces' methods
    IEvent getEvent(int eventID);

    ArrayList<IEvent> getAllEvents();

    boolean getAvailability(Date date);
    void setAvailability(boolean availability);
}
