package co.edu.cesde.ga.app;

import co.edu.cesde.ga.model.Person;
import co.edu.cesde.ga.model.Teacher;
import co.edu.cesde.ga.model.Student;
import co.edu.cesde.ga.model.Enrollments;
import co.edu.cesde.ga.model.Programs;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.setUserId(1L);
        person.setCode("360");
        person.setDocumentNumber("0987654321");
        person.setFirstName("Bonifacio");
        person.setLastName("Culeandro");
        person.setStatus("ACTIVE");

        System.out.println("User ID: " + person.getUserId());
        System.out.println("Code: " + person.getCode());
        System.out.println("Document number: " + person.getDocumentNumber());
        System.out.println("First name: " + person.getFirstName());
        System.out.println("Last name: " + person.getLastName());
        System.out.print("Status: " + person.getStatus());

        Teacher teacher = new Teacher();

        teacher.setUserId(2L);
        teacher.setCode("063");
        teacher.setDocumentNumber("1234567890");
        teacher.setFirstName("Pacheco");
        teacher.setLastName("Carafloja");
        teacher.setStatus("ACTIVE");

        System.out.println("User ID: " + teacher.getUserId());
        System.out.println("Code: " + teacher.getCode());
        System.out.println("Document number: " + teacher.getDocumentNumber());
        System.out.println("First name: " + teacher.getFirstName());
        System.out.println("Last name: " + teacher.getLastName());
        System.out.print("Status: " + teacher.getStatus());

        Student student = new Student();

        student.setUserId(3L);
        student.setCode("603");
        student.setDocumentNumber("15263074859");
        student.setFirstName("Carpirihno");
        student.setLastName("Suanfasun");
        student.setStatus("ACTIVE");
        student.setBirthDate("2001/02/30");

        System.out.println("User ID: " + student.getUserId());
        System.out.println("Code: " + student.getCode());
        System.out.println("Document number: " + student.getDocumentNumber());
        System.out.println("First name: " + student.getFirstName());
        System.out.println("Last name: " + student.getLastName());
        System.out.println("Status: " + student.getStatus());
        System.out.println("Birth date: " + student.getBirthDate());

        Enrollments enrollments = new Enrollments();

        enrollments.setStudentId("Studen ID:" + enrollments.getStudentId());


    }

}
