package studentManagementSys;

/* This is a simple Java project where you will:
✅ Use classes, objects, constructors, and methods
✅ Practice static and final variables
✅ Store and manage student data

📌 Project Features:
 1.	Add a new student (name, ID, grade)
 2.	Display all students
 3.	Count total students using static
 4.	Use final for student ID

 Expected Output:
📚 Student Management System 📚
1️⃣ Add Student
2️⃣ Display Students
3️⃣ Show Total Students
4️⃣ Exit
Choose an option: 1
Enter Student Name: Alice
Enter Grade: 90.5
✅ Student Added Successfully!

📚 Student Management System 📚
Choose an option: 1
Enter Student Name: Bob
Enter Grade: 85.0
✅ Student Added Successfully!

📚 Student Management System 📚
Choose an option: 2

📋 Student List:
ID: 1 | Name: Alice | Grade: 90.5
ID: 2 | Name: Bob | Grade: 85.0

📚 Student Management System 📚
Choose an option: 3
👨‍🎓 Total Students: 2

 After successfully completing the above, do this!
🔹 Add an option to delete a student by ID
🔹 Sort students by grade before displaying
🔹 Store student data in a file for saving and loading */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;

        while (true) {
            System.out.println("\n📚 Student Management System 📚");
            System.out.println("1️⃣ Add Student");
            System.out.println("2️⃣ Display Students");
            System.out.println("3️⃣ Show Total Students");
            System.out.println("4️⃣ Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:

                    System.out.println("Enter student name");
                    String name = scanner.nextLine();
                    System.out.println("Enter student grade: ");
                    double grade = scanner.nextDouble();

                    students.add(new Student(name, grade));
                    System.out.println("✅ Student Added Successfully!");
                    break;

                case 2:
                    if(students.isEmpty()){
                        System.out.println("No students available");

                    }else{
                        System.out.println(("\n student list: "));
                        for (Student student : students) {
                            student.displayStudentInfo();
                        }
                    }
                    break;
            }

        }

    }
}
