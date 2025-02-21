import java.sql.Date;
import java.util.ArrayList;

public class Calendar implements ICalendar {
    private ArrayList<IEvent> events = new ArrayList<>();;

    public Calendar() {};

    // TO BE COMPLETED
    @Override
    public void addEvent(IEvent event) {

    }

    @Override
    public void removeEvent(int eventID) {

    }

    @Override
    public IEvent getEvent(int eventID) {
        return null;
    }

    @Override
    public ArrayList<IEvent> getAllEvents() {
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
