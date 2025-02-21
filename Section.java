//these are section objects which can contain it's own 2D array

public class Section {

  //declare section name
  //2D array to store the seats within the section
  private string name;
  Seat[][] seats = new Seats[row][col];


  //getters and setters for the name and array of Seats
  string getName();

  void setName(string section);

  seat[][] getSeats();

  void addSeat(Seat seat); 
}
