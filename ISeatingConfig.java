//this will contain section objects
public interface ISeatingConfig{


  
  //this is to get the sections from the array of section objects
  section getMainHall();

  section getSmallHall();

  section getRehearsalSpace();

  //methods to get the 5 meeting rooms
  section getMeetingA();

  section getMeetingB();
  
  section getMeetingC();

  section getMeetingD();

  section getMeetingE();
}
