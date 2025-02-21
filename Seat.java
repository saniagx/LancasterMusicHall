//these are seat objects which can contain data attributes

public class Seat {

  //attributes for each seat
  private int seatNum;
  private int rowNum; 
  private Section seatSection;
  private float price;
  private boolean booked; 
  
  //getters and setters for each seat
  int getSeatNumber();

  void setSeatNumber(int seatNumber);

  int getRowNumber();

  void setRowNumber(int rowNumber);

  string getSection();

  void setSection(string section);

  float getPrice();

  void setPrice(float price);

  boolean getBooked();

  void setBooked(boolean booked);

}

