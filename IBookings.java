public interface IBookings {
    /** MARKETING REQUIREMENTS:
     *      seatNumber
     *      rowNumber
     *      groupSize
     */

    //idea: Have an array in bookings which stores the number of seats, which must be greater than 1
    // --> then, we can calculate booking size by storing the size of the array or doing array length
    // --> we can generate a unique bookingID for this array of bookings
    // --> the seats would be objects within the array and would contain their data, such as Number, Row and Section (which hall or room).

    /* if the only functionality of this interface is to get access to seat information and group sizes, this can be moved to IEvent
    *  the other team can access seat information through the event's unique SeatingConfig -> Section -> Seat
    *  groupSize can be found by looking for consecutive seats with the same bookingID
    */

    ISeatingConfig getSeatingConfig();

    Seat getSeat();

    int getGroupSize();
}
