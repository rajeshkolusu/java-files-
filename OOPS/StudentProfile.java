package OOPS;

import java.util.Scanner;

public class StudentProfile {
    public void studentprofile(String name, String branch, int registerNumber) {
        System.out.println("=========== Welcome to student profile section! enter your details ===========");
        System.out.println("name:" + name);
        System.out.println("branch :" + branch);
        System.out.println("RegisterNumber:" + registerNumber);

    }

    public static void main(String[] args) {
        System.out.println("=========== Welcome to student profile section! enter your details ===========");
        Scanner inp = new Scanner(System.in);
        System.out.print("enter your name");
        String Name = inp.nextLine();
        System.out.println("enter your branch");
        String Branch = inp.nextLine();
        System.out.println("enter your registernumber");
        int roll = inp.nextInt();
        StudentProfile profile = new StudentProfile();
        profile.studentprofile(Name, Branch, roll);
        inp.close();
    }
}
