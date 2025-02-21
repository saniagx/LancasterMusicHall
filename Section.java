//these are section objects which can contain it's own 2D array

public class Section {

  //declare section name
  //2D array to store the seats within the section
  private String sectionName;
  private ArrayList<Seat> seats = new ArrayList<Seat>();;

  //getters and setters for the name and array of Seats
  String getSectionName();

  void setSectionName(String sectionName);

  ArrayList<Seat> getSeats();
}
