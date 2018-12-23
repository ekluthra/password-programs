/*
 * Made by: Ekagra Luthra
 * Date: November 14th
 */

import java.util.Scanner;

public class PasswordForLoop {
     public static void main(String[] args) { 
          Scanner scan = new Scanner(System.in);
          String username = "EkagraLuthra";
          String password = "Feb2001";
          System.out.print("Enter your username: ");
          String usernameInput = scan.nextLine();
          System.out.print("Enter your password: ");
          String passwordInput= scan.nextLine();
          if ((username.equals(usernameInput)) && (password.equals(passwordInput))){
               System.out.println("Welcome to your account, " + username);
          }
          else{
               for(int tries = 0; ((tries < 2) && ((!username.equals(usernameInput)) || (!password.equals(passwordInput)))); tries++){
                    System.out.println("Try again.");
                    System.out.print("Enter your username: ");
                    usernameInput = scan.nextLine();
                    System.out.print("Enter your password: ");
                    passwordInput = scan.nextLine();
               }
               if((username.equals(usernameInput)) && (password.equals(passwordInput))){
                    System.out.println("Welcome to your account, " + username);
               }
               else{
                    System.out.println("Sorry, you have been locked out.");
               }
          }
          scan.close();
     }
}
