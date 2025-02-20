public interface IGroupBookings {
    /** MARKETING REQUIREMENTS:
     *      seatNumber
     *      rowNumber
     *      groupSize
     */

    int getSeatNumber();

    void setSeatNumber(int seatNumber);

    int getRowNumber();

    void setRowNumber(int rowNumber);

    int getGroupSize();

    void setGroupSize(int groupSize);
}
