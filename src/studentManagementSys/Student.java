package studentManagementSys;

/* 📌 Project Features:
 1.	Add a new student (name, ID, grade)
 2.	Display all students
 3.	Count total students using static
 4.	Use final for student ID*/


public class Student {

   private static int counter = 100000;
   private final int studentId;

   private String studentName;
   private double studentGrade;



    Student(String studentName, double studentGrade){

        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.studentId =  ++counter;
    }


    public void displayStudentInfo(){

        System.out.println("Student Name: "+ studentName);
        System.out.println("Student Grade "+ studentGrade);
        System.out.println("Student Id: "+ studentId);
    }

    public static int getTotalStudents(){
        return counter;
    }


    }

