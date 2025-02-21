//these are section objects (named after Main Hall, Meeting Room etc.) 
//which can contain it's own array of seats

public class Section {

  //declare section name
  private String sectionName;
  private ArrayList<Seat> seats = new ArrayList<Seat>();;

  //constructor
  public Section(String sectionName){
    this.seats = seats;
  }

  //getters and setters for the name and array of Seats
  String getSectionName();

  void setSectionName(String sectionName);

  ArrayList<Seat> getSeats();
}
