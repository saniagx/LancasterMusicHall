import java.sql.Date;
import java.util.ArrayList;

public interface ICalendar {
    /** MARKETING REQUIREMENTS:
     *      eventID
     *      eventName
     *      data (this is so vague, I'm assuming they meant date and that 'data' was a typo)
     *      time (I'm assuming this means start time and end time)
     *      availability (again, this is vague, need further clarification on this)
     */
    void addEvent(IEvent event);

    void removeEvent(int eventID);

    // All event attributes can be accessed via the event class' public methods
    IEvent getEvent(int eventID);

    ArrayList<IEvent> getAllEvents();

    // I've assumed the data type is a boolean
    boolean getAvailability(Date date);

    void setAvailability(boolean availability);
}
