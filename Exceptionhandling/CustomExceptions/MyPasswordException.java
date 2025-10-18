package Exceptionhandling.CustomExceptions;

import java.util.Scanner;

// Invalid Password Exception
// Create your own exception class InvalidPasswordException.
// Write a method validatePassword(String password) that throws this exception if password length < 8.
// Catch it and print a custom message.

class InvalidPasswordException extends Exception{


@Override
    public String getMessage() {
        
        return "Password must be greater than 8 characters !";
    }
}

public class MyPasswordException {
    static void validatePassword(String password) throws InvalidPasswordException{
        if(password.length()<8){
            throw new InvalidPasswordException();
        }
        else{
            System.out.println("you Entered : "+password);
        }
    }
    public static void main(String[] args){
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your Password !");
        String password = obj.nextLine();
        obj.close();
        try{
            validatePassword(password);
        }catch(InvalidPasswordException e){
            System.out.println(e.getMessage());
        }
    }
}
