//these are section objects which can contain it's own 2D array

public class Section {

  //declare section name
  //2D array to store the seats within the section
  private String name;
  private ArrayList<Seat> seats = new ArrayList<Seat>();;

  //getters and setters for the name and array of Seats
  String getName();

  void setName(String section);

  ArrayList<Seat> getSeats();
}
