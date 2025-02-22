import java.util.ArrayList;

//this will contain section objects
public interface ISeatingConfig{

  // Get seating sections for a given seating configuration
  ArrayList<Section> getSections(int seatingConfigID);

  // Get the full SeatingConfig object
  SeatingConfig getSeatingConfiguration(int seatingConfigID);

  // Allow Box Office to request seating layout
  ArrayList<Section> getBaseSeatingConfiguration(int seatingConfigID);


  //implemented inside Section
  String getSectionName(Section section);
  void setSectionName(Section section, String sectionName);

  ArrayList<Seat> getSeats(Section section);
  ArrayList<Seat> getRestrictedSeats(Section section);

  //getters and setters for each seat
  int getSeatNumber(Seat seat);
  void setSeatNumber(Seat seat, int seatNumber);

  int getRowNumber(Seat seat);
  void setRowNumber(Seat seat, int rowNumber);

  Section getSeatSection(Seat seat);
  void setSeatSection(Seat seat, String section);

  float getPrice(Seat seat);
  void setPrice(Seat seat, float price);

  int getBookingID(Seat seat);
  void setBookingID(Seat seat, int bookingID);

  boolean isBooked(Seat seat);
  void setBooked(Seat seat, boolean booked);

  boolean isRestrictedView(Seat seat);
  void setRestrictedView(Seat seat, boolean restrictedView);

  boolean isVip(Seat seat);
  void setVip(Seat seat, boolean vip);
}
