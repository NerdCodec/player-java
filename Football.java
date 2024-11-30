import java.util.*;
public class Football {
    public String PlayerName;
    public String TeamName;
    public int TeamPosition;

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in) ;

        //Creating an object of a class football
        Football Team1 = new Football();
        Team1.PlayerName="Jude";
        Team1.TeamName="Redstars";
        Team1.TeamPosition=4;

        //for display here
        System.out.print("PlayerName: " + Team1.PlayerName);
        System.out.print("\nTeamName: " + Team1.TeamName);
        System.out.print("\nTeamPosition: " + Team1.TeamPosition);


    }

}