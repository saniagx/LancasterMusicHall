import java.util.ArrayList;

//this will contain section objects
public interface ISeatingConfig{

  
  //implemented inside Section
  String getSectionName();
  void setSectionName();

  ArrayList<Seat> getSeats();

   //getters and setters for each seat
  int getSeatNumber();
  void setSeatNumber(int seatNumber);

  int getRowNumber();
  void setRowNumber(int rowNumber);

  String getSection();
  void setSection(String section);

  float getPrice();
  void setPrice(float price);

  boolean getBooked();
  void setBooked(boolean booked);
  
}
