import java.sql.Date;
import java.sql.Time;

public interface IEvent {
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

    ISeatingConfig getSeatingConfig();
    void setSeatingConfig(ISeatingConfig seatingConfig);
}
