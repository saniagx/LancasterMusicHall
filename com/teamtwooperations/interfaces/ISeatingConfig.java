package com.teamtwooperations.interfaces;

import java.util.ArrayList;

public interface ISeatingConfig{

  // Get sections for a given seating configuration ID
  ArrayList<Section> getSections(int seatingConfigID);

  // Get the full SeatingConfig object (if needed)
  SeatingConfig getSeatingConfiguration(int seatingConfigID);

  // Get and set section names
  String getSectionName(Section section);
  void setSectionName(Section section, String sectionName);

  // Retrieve seats from a section
  ArrayList<Seat> getSeats(Section section);
  ArrayList<Seat> getRestrictedSeats(Section section);

  // Modify seat status
  void setSeatBooked(Seat seat, boolean booked);
  void setSeatVip(Seat seat, boolean vip);
  void setSeatRestrictedView(Seat seat, boolean restricted);

  // Commented out for now - need additional information
//    int getSeatNumber(Seat seat);
//    void setSeatNumber(Seat seat, int seatNumber);
//
//    int getRowNumber(Seat seat);
//    void setRowNumber(Seat seat, int rowNumber);
//
//    Section getSeatSection(Seat seat);
//    void setSeatSection(Seat seat, String section);
//
//    float getPrice(Seat seat);
//    void setPrice(Seat seat, float price);
//
//    int getBookingID(Seat seat);
//    void setBookingID(Seat seat, int bookingID);
//
//    boolean isBooked(Seat seat);
//    void setBooked(Seat seat, boolean booked);
}
