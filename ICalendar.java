public interface ICalendar {
    /** MARKETING REQUIREMENTS:
     *      eventID
     *      eventName
     *      data (this is so vague, I have no idea what they mean by this)
     *      time (I'm assuming this means start time and end time)
     *      availability (again, this is vague, need further clarification on this)
     */

    int getEventID();

    String getEventName();
}
