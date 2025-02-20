public interface IGroupBookings {
    /** MARKETING REQUIREMENTS:
     *      seatNumber
     *      rowNumber
     *      groupSize
     */

    //idea: Have an array in bookings which stores the number of seats, which must be greater than 1
    // --> then, we can calculate booking size by storing the size of the array or doing array length
    // --> we can generate a unique bookingID for this array of bookings
    // --> the seats would be objects within the array and would contain their data, such as Number, Row and Section (which hall or room).
    
    int getSeatNumber();

    void setSeatNumber(int seatNumber);

    int getRowNumber();

    void setRowNumber(int rowNumber);

    int getGroupSize();

    void setGroupSize(int groupSize);
}
