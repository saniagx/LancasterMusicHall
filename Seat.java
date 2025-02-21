//these are seat objects which can contain data attributes

public class Seat {

  //attributes for each seat
  private int seatNum;
  private int rowNum; 
  private Section seatSection;
  private float price;
  private boolean booked;
  private int bookingID;

  //constructor
  public Seat(int seatNum, int rowNum, Section seatSection, float price, boolean booked){
    this.seatNum = seatNum;
    this.rowNum = rowNum;
    this.seatSection = seatSection;
    this.price = price;
    this.booked = booked;
  }
  
  //getters and setters for each seat
  // TO BE COMPLETED
  int getSeatNum();

  void setSeatNum(int seatNumber);

  int getRowNumber();

  void setRowNumber(int rowNumber);

  Section getSection();

  void setSection(String section);

  float getPrice();

  void setPrice(float price);

  boolean getBooked();

  void setBooked(boolean booked);

  int getBookingID();

  void setBookingID(int bookingID);
}

