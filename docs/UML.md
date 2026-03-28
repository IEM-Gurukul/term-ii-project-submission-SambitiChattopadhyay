```mermaid
classDiagram

class Student {
    -int id
    -String name
    -int age
    -String department
    +Student(int id, String name, int age, String department)
    +int getId()
    +void display()
}

class StudentService {
    <<interface>>
    +addStudent(Student s)
    +viewStudents()
    +searchStudent(int id)
    +deleteStudent(int id)
}

class StudentManager {
    -ArrayList~Student~ students
    +addStudent(Student s)
    +viewStudents()
    +searchStudent(int id)
    +deleteStudent(int id)
}

class Main {
    +main(String[] args)
}

class ExceptionHandling {
    +handleInputMismatch()
}

StudentService <|.. StudentManager
StudentManager --> Student
Main --> StudentService
Main --> Student
Main --> ExceptionHandling