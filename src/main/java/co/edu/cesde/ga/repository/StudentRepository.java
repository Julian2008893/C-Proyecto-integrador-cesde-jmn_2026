package co.edu.cesde.ga.repository;

import co.edu.cesde.ga.model.Student;
import java.util.List;

public interface StudentRepository {

    Student create (Student student);

    List <Student> findAll();

    Student findById (Long studentId);

    Student findByDocument (String documentNumber);

    boolean update (Student updateStudent);

    boolean delete (Long studentId);

    boolean existsByDocument (String documentNumber);

    int count();

}