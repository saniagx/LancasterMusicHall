import java.sql.Date;
import java.sql.Time;

public interface IMeetings {
    /** BOX OFFICE REQUIREMENTS:
     *      eventType : String
     *      roomType : String
     *      eventDate : Date
     *      eventStartTime : time
     *      eventEndTime : time
     */

    // This shares methods with Event so perhaps something can be done with inheritance
    String getEventType();

    String getRoomType();

    Date getEventDate();

    Time getEventStartTime();

    Time getEventEndTime();
}
