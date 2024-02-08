package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String passWord;
    private String department;
    private int default_password=10;
    private String email;
    private int mailbox_capacity=500;
    private String alternate_email;
    private String company="KaveriTech.com";

    public  Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    //    System.out.println("Email created for "+ this.firstName+" "+this.lastName+".");

        this.department=setDepartment();
    //    System.out.println("department is "+this.department);

        this.setPassWord(setRandompassword(default_password));
  //      System.out.println("Your default password "+ this.getPassWord());

        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+company;
     //   System.out.println("Your email Id is "+email);
    }
    public String setDepartment() {

        System.out.println("Departments codes");

        System.out.println("1 for sales\n2 for development\n3 for accounts\n0 for none");

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the  department code");

        int dep=sc.nextInt();
        if(dep==1) return "sales";
        else if(dep==2) return "development";
        else if(dep==3) return "accounts";
        else return "";
    }
    private String setRandompassword(int length){

        String passwordcode="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@#*$!";

        char password[]=new char[length];

        for(int i=0;i<length;i++){
            int ran=(int)(Math.random()*passwordcode.length());
            password[i]=passwordcode.charAt(ran);
        }
        return new String(password);
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this. passWord=passWord;
    }

    public int getMailbox_capacity() {
        return mailbox_capacity;
    }

    public int setMailbox_capacity(int mailbox_capacity) {
        return mailbox_capacity;
    }

    public String getAlternate_email() {
        return alternate_email;
    }

    public String setAlternate_email(String alternate_email) {
        return alternate_email;
    }
    public void showinfo(){
        System.out.println("Your name "+firstName+""+lastName+".");
        System.out.println("your email Id "+email);
        System.out.println("your deparment id "+ this.department);
        System.out.println("your password "+this.getPassWord());
        System.out.println("Thank you");
    }
}
