/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo06group;

/**
 *
 * @author Nikhil Krishnan Venkatesh
 */
public class RollerCoaster extends AdventureRides{
    private int wheels;
    private int players;
    private String ticketType;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
    
    
<<<<<<< HEAD
=======
   @Override
>>>>>>> 85fa132ac23d884721190e7c9558d77d49c9b505
    public String resultOfGame(){
        System.out.println("You won the game");
        return "You never Loose";
    }
    
    @Override
    public  String onlineBooking(){
         System.out.println("Welcome to adventure rides");
    return "Your ticket is booked";
    }
    
<<<<<<< HEAD
    public String rotations(){
    return "Gives the count of the rotations";
    }

    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
=======
    public static int rotations(){
        System.out.println("You successfully stayed alive");
    return 0;
    }

   
>>>>>>> 85fa132ac23d884721190e7c9558d77d49c9b505
    
}
