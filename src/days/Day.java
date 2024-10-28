/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package days;

/**
 *
 * @author Dell
 */
public enum Day {
    
    MON(1),
    TUE(2),
    WED(3),
    THU(4),
    FRI(5),
    SAT(6),
    SUN(7);
    
    private final int number;
    
    Day(int number){
        this.number = number;
    }
    
    public static Day fromNumber(int number){
        for (Day day : values()){
            if (day.number == number){
                return day;
            }
        }
        return MON; 
    }
    
    
}
