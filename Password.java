/* 
 * Made by: Ekagra Luthra
 * Date: November 13th, 2017
 */

import java.util.Scanner;

public class Password {
     public static void main(String[] args) { 
          String username = "EkagraLuthra";
          String password = "Feb2001";
          int tries = 0;
          Scanner scan = new Scanner(System.in);
          System.out.print("Enter your username: ");
          String usernameInput = scan.nextLine();
          System.out.print("Enter your password: ");
          String passwordInput = scan.nextLine();
          if((password.equals(passwordInput)) && (username.equals(usernameInput))){
               System.out.println("Welcome to your account, " + username);
          }
          else{
               while((!password.equals(passwordInput)) || (!username.equals(usernameInput)) && (tries != 3)){
                    System.out.println("Sorry, try again.");
                    System.out.print("Enter your username: ");
                    usernameInput = scan.nextLine();
                    System.out.print("Enter your password: ");
                    passwordInput = scan.nextLine();
                    tries++;
                    if (tries == 2){
                         System.out.println("Sorry, you're locked out.");
                         break;
                    }
                    else if((password.equals(passwordInput)) && (username.equals(usernameInput))){
                         System.out.println("Welcome to your account, " + username);
                    }
               }
          }
          scan.close();
     }
}

