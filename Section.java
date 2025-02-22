import java.util.ArrayList;

// These are section objects (named after Main Hall, Meeting Room etc.)
// Which can contain their own array of seats

public class Section {

  // Declare Section Name
  private String sectionName;
  private ArrayList<Seat> seats = new ArrayList<Seat>();;

  // Constructor
  public Section(String sectionName){
    this.sectionName = sectionName;
  }

  // Getter and Setter for sectionName
  public String getSectionName() {
    return sectionName;
  }

  public void setSectionName(String sectionName) {
    this.sectionName = sectionName;
  }

  // Getter for seats
  public ArrayList<Seat> getSeats() {
    return seats;
  }

  // Add a seat to the section
  public void addSeat(Seat seat) {
    this.seats.add(seat);
  }

  // Remove a seat from the section
  public void removeSeat(Seat seat) {
    this.seats.remove(seat);
  }


}
