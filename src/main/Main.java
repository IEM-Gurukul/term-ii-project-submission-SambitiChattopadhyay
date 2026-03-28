package main;

import service.StudentManager;
import service.StudentService;
import model.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService manager = new StudentManager();

        while(true){

            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Dept: ");
                    String dept = sc.nextLine();

                    manager.addStudent(new Student(id,name,age,dept));
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    manager.searchStudent(sc.nextInt());
                    break;

                case 4:
                    manager.deleteStudent(sc.nextInt());
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
