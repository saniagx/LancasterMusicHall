//these are seat objects which can contain data attributes

public class Seat {

  //attributes for each seat
  private int seatNum;
  private int rowNum; 
  private Section seatSection;
  private float price;
  private boolean booked; 

  //constructor
  public Seat(int seatNum, int rowNum, Section seatSection, float price, boolean booked){
    this.seatNum = seatNum;
    this.rowNum = rowNum;
    this.seatSection = seatSection;
    this.price = price;
    this.booked = booked;
  }
  
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

