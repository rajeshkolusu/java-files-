package OOPS;

import java.util.Scanner;

public class StudentProfile_v2 {
    int RegisterNumber;
    String name;
    String Branch;
    String Semester;
    String grade;

    public StudentProfile_v2(int RegisterNumber, String name, String Branch, String Semester, String grade) {
        this.RegisterNumber = RegisterNumber;
        this.name = name;
        this.Branch = Branch;
        this.Semester = Semester;
        this.grade = grade;

    }

    public void displayprofile() {
        System.out.println("\n");
        System.out.println("*********** Welcome To Student Profile Section ***********");
        System.out.println("Student name : " + name);
        System.out.println("Student RegisterNumber: " + RegisterNumber);
        System.out.println("Student Branch: " + Branch);
        System.out.println("Student Semester: " + Semester);
        System.out.println("Student grade: " + grade);
    }

    public String calculategrade(int marks) {
        if (marks >= 90 && marks <= 100) {
            return "A+";
        } else if (marks >= 75 && marks <= 89) {
            return "A";
        } else if (marks > 60 && marks <= 74) {
            return "B";
        } else if (marks >= 50 && marks <= 59) {
            return "C";
        } else {
            return "Fail";
        }

    }

    public void isEligibleForExam(double attendence) {
        if (attendence >= 75.0) {
            System.out.println("you are elgible for writing examination");
        } else {
            System.out.println("You are detained from this semester due lack of your attendence!");
        }
    }

    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("*********** Welcome To Student Registration  Section ***********");
        Scanner details = new Scanner(System.in);
        System.out.print("enter your name:");
        String Name = details.nextLine();
        System.out.print("enter your registernumber:");
        int reg = details.nextInt();
        System.out.print("enter your attendence % :");
        double attnd = details.nextDouble();
        details.nextLine();
        System.out.print("enter your branch:");
        String branch = details.nextLine();

        System.out.print("enter your Semester:");
        String sem = details.nextLine();
        System.err.print("enter your marks:");
        int m = details.nextInt();
        StudentProfile_v2 Details = new StudentProfile_v2(reg, Name, branch, sem, "");
        String Grd = Details.calculategrade(m);
        Details.grade = Grd;
        Details.displayprofile();
        Details.isEligibleForExam(attnd);
        details.close();
    }
}
