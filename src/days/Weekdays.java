/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public class Weekdays 
{
  public void nameOfDay(Day day)
     {
    System.out.println(day.name());
     
  
}
  
  public void printAllDays(){
      for (Day day : Day.values()){
          System.out.println(day.name());
      }
  }
}


