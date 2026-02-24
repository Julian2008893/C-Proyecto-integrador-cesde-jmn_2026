package co.edu.cesde.ga.application;

import co.edu.cesde.ga.model.Person;
import co.edu.cesde.ga.model.Student;
import co.edu.cesde.ga.model.Teacher;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.setUserId(2L);
        person.setCode("120");
        person.setStatus("CANCEL");
        person.setDocumentNumber("3142149293");
        person.setFirstName("Julian");
        person.setLastName("Cardona");


        System.out.println("User ID: " + person.getUserId());
        System.out.println("Code: " + person.getCode());
        System.out.println("Document number: " + person.getDocumentNumber());
        System.out.println("First name: " + person.getFirstName());
        System.out.println("Last name: " + person.getLastName());
        System.out.print("Status: " + person.getStatus());

        Teacher teacher = new Teacher();

        teacher.setUserId(2L);
        teacher.setCode("120");
        teacher.setStatus("CANCEL");
        teacher.setDocumentNumber("3142149293");
        teacher.setFirstName("Juli");
        teacher.setLastName("Cardo");


        System.out.println("User ID: " + teacher.getUserId());
        System.out.println("Code: " + teacher.getCode());
        System.out.println("Document number: " + teacher.getDocumentNumber());
        System.out.println("First name: " + teacher.getFirstName());
        System.out.println("Last name: " + teacher.getLastName());
        System.out.print("Status: " + teacher.getStatus());


        Student student = new Student();

        student.setUserId(2L);
        student.setCode("121");
        student.setStatus("ACTIVE");
        student.setDocumentNumber("314298738");
        student.setFirstName("Marcelo");
        student.setLastName("Cardo");
        student.setBirthDate("2008/01/22");


        System.out.println("User ID: " + student.getUserId());
        System.out.println("Code: " + student.getCode());
        System.out.println("Document number: " + student.getDocumentNumber());
        System.out.println("First name: " + student.getFirstName());
        System.out.println("Last name: " + student.getLastName());
        System.out.print("Status: " + student.getStatus());
        System.out.println("birth date" + student.getBirthDate());

    }


}
