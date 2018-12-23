/**
 * Made by: Ekagra Luthra
 */
import java.util.Scanner;
     
     public class PasswordDoWhileLoop1 {
     public static void main(String[] args) { 
          Scanner scan = new Scanner(System.in);
          String username = "EkagraLuthra";
          String password = "Feb2001";
          String usernameGuess;
          String passwordGuess;
          int tries = 0;
          do{
               System.out.print("Enter your username: ");
               usernameGuess = scan.nextLine();
               System.out.print("Enter your password: ");
               passwordGuess = scan.nextLine();
               if(tries == 3){
                    System.out.println("Sorry, you are locked out.");
                    break;
               }
               else if(((usernameGuess.equals(username))  && (passwordGuess.equals(password))) && (tries !=3)){
                    System.out.println("Welcome to your account," +username);
                    break;
               }
               else if (((!usernameGuess.equals(username))  && (!passwordGuess.equals(password))) && (tries !=3)){
                    System.out.println("Try again");
                    tries++;
               }        
               
          }while(((!usernameGuess.equals(username))  || (!passwordGuess.equals(password))) && (tries != 3));
     }
}
