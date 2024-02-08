package emailApp;
import  java.io.*;
import java.util.Scanner;

public class EmailApp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String fristname=sc.next();
        String lastname=sc.next();
        Email email=new Email(fristname,lastname);
        char fn=fristname.charAt(0);
        char ln=lastname.charAt(0);
        email.showinfo();
        System.out.println("Alternate email "+ email.setAlternate_email(fn+""+ln+"@KaveriTech.com"));
    }
}
