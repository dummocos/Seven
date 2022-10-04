import java.util.Random;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args){
        Scanner scanit=new Scanner(System.in);
        String player_input;
        Random rand=new Random();
        int first_dice = rand.nextInt(1,7);
        int second_dice = rand.nextInt(1,7);
        boolean first=true, second=true, third=true;
        System.out.print("Your call sir >>> ");
        player_input = scanit.nextLine();

        System.out.println("DICE says : "+(first_dice+second_dice));
        if(player_input.equals("Seven up") && first_dice+second_dice>7){
            System.out.println("You got the bucks...");
            first=false;
        }   
        if(player_input.equals("Seven") && first_dice+second_dice==7){
            System.out.println("You TRIPLED your money...");
            second=false;
        }
        if(player_input.equals("Seven down") && first_dice+second_dice<7){
            System.out.println("You got the bucks...");
            third=false;
        }
        if(first && third && second){
            System.out.println("You lost the bucks");
        }    
        scanit.close();

        
    }
}
