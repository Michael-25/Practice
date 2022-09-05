package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email{

    private final String[] employeeEmailsList = {
            "mike@gmail.com",
            "matthew@gmail.com",
            "ronaldo@gmail.com",
            "chris@outlook.com",
            "lone007@yahoo.com",
            "asus12@yahoo.com"
    };

    boolean validateEmail(String emailID) {
    
        String emailPattern = "[a-zA-Z0-9!#$&'*+-/=?^_`{|}~]*@[a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9][.][a-zA-Z]*";

    
        Pattern ptr = Pattern.compile(emailPattern);

       
        Matcher mat = ptr.matcher(emailID);

      
        if (mat.matches()) {   
             for (String s : employeeEmailsList) {

            
                if (s.equalsIgnoreCase(emailID)) {
                    System.out.println("Employee Email ID Found");
                    return true;
                }
            }
            System.out.println("Email not recognized"); 
        } else {
            System.out.println("Invalid Email ID format"); 
        }
        return false;
    }

    public static void main(String[] args) {


        Email employee = new Email();
        Scanner sc = new Scanner(System.in);

        String employeeEmail;
        do {
            System.out.println("Enter your email:"); 
            employeeEmail = sc.next();
        }while (!employee.validateEmail(employeeEmail)); 
        System.out.println("Email Validation Process Finished !");
        sc.close();
    }
}

