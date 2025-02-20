import java.sql.Date;
import java.sql.Time;

public interface IEvent {
    /** Attributes accessible through this interface:
     *      eventID : int
     *      eventName : String
     *      eventType : String
     *      eventDate : Date
     *      eventStartTime : time
     *      eventEndTime : time
     *      eventPrice : float
     *      venueID : int
     *      venueName : String
     *
     *      I've omitted 'roomType' as eventType = 'meeting' does the same job
     */

    // No need for a meeting interface, meeting events can be implemented through this event interface

    int getEventID();

    void setEventID(int eventID);

    String getEventName();

    void setEventName(String eventName);

    String getEventType();

    void setEventType(String eventType);

    Date getEventDate();

    void setEventDate(Date eventDate);

    Time getEventStartTime();

    void setEventStartTime(Time eventStartTime);

    Time getEventEndTime();

    void setEventEndTime(Time eventEndTime);

    float getEventPrice();

    void setEventPrice(float eventPrice);

    int getVenueID();

    void setVenueID(int venueID);

    String getVenueName();

    void setVenueName(String venueName);
}
