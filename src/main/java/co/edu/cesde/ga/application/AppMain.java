package co.edu.cesde.ga.application;

import co.edu.cesde.ga.model.Student;
import co.edu.cesde.ga.repository.StudentRepository;
import co.edu.cesde.ga.repository.impl.StudentRepositoryInMemory;
import co.edu.cesde.ga.service.StudentService;
import co.edu.cesde.ga.service.impl.StudentServiceImpl;

public class AppMain {


    public static void main(String[] args) {

        StudentRepository studentRepository = new StudentRepositoryInMemory();
        StudentService studentService = new StudentServiceImpl(studentRepository);

        Student student = new Student(null, "CC", "123456", "Austagio", "coma", "muerto", "22/01/2008");

        Student createStudent = studentService.create(student);

        System.out.println("Estudiante creado");
        System.out.println(createStudent);

    }
}
