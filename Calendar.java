import java.sql.Date;
import java.util.ArrayList;

public class Calendar implements ICalendar {
    private ArrayList<Event> events = new ArrayList<>();;

    public Calendar() {};

    // TO BE COMPLETED
    @Override
    public void addEvent(Event event) {

    }

    @Override
    public void removeEvent(int eventID) {

    }

    @Override
    public Event getEvent(int eventID) {
        return null;
    }

    @Override
    public ArrayList<Event> getAllEvents() {
        return events;
    }

    @Override
    public boolean getAvailability(Date date) {
        return false;
    }

    @Override
    public void setAvailability(boolean availability) {

    }
}
