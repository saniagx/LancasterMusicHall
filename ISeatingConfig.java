import java.util.ArrayList;

//this will contain section objects
public interface ISeatingConfig{

  ArrayList<Section> getSections();
  
  //implemented inside Section
  String getSectionName(Section section);
  void setSectionName(Section section, String sectionName);

  ArrayList<Seat> getSeats(Section section);

   //getters and setters for each seat
  int getSeatNumber(Seat seat);
  void setSeatNumber(Seat seat, int seatNumber);

  int getRowNumber(Seat seat);
  void setRowNumber(Seat seat, int rowNumber);

  Section getSeatSection(Seat seat);
  void setSeatSection(Seat seat, String section);

  float getPrice(Seat seat);
  void setPrice(Seat seat, float price);

  boolean getBooked(Seat seat);
  void setBooked(Seat seat, boolean booked);

  int getBookingID(Seat seat);
  void setBookingID(Seat seat, int bookingID);
}
