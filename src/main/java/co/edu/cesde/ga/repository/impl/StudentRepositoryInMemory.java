package co.edu.cesde.ga.repository.impl;

import co.edu.cesde.ga.model.Student;
import co.edu.cesde.ga.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryInMemory implements StudentRepository {

    private List<Student> students;
    private Long nextStudentId;

    public StudentRepositoryInMemory() {
        this.students = new ArrayList<>();
        this.nextStudentId = 1L;
    }

    @Override
    public Student create(Student student) {

        if (student == null) {
            return null;
        }

        if (existsByDocument(student.getDocumentNumber())) {
            return null;
        }

        student.setStudentId(nextStudentId++);
        students.add(student);
        return student;
    }

    @Override
    public boolean existByDocumentNumber(String documentNumber){

        if (documentNumber == null || documentNumber.isEmpty()){
            return false;
        }

        return findByDocument(documentNumber) != null;

    }

    @Override
    public Student findByDocumentNumber(String documentNumber){

        if (documentNumber == null || documentNumber.isEmpty()){
            return null;
        }

        for (Student student : students){
            if (documentNumber.equals(student.getDocumentNumber())){
                return student;
            }
        }

        return null;
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public Student findById(Long studentId){

        if (studentId == null || studentId <= 0){
            return null;
        }

        for (Student student : students) {
            if (studentId.equals(student.getStudentId())){
                return student;
            }
        }

        return null;
    }

    @Override
    public Student findByDocument(String documentNumber) {
        return null;
    }

    @Override
    public boolean delete (Long studentId){

        Student student = findById(studentId);
        if (student == null) return false;
        students.remove(student);

        return true;
    }

    @Override
    public boolean existsByDocument(String documentNumber) {
        return false;
    }

    @Override
    public int count() {
        return students.size();
    }

    @Override
    public boolean update(Student updatedStudent) {
        if (updatedStudent == null || updatedStudent.getStudentId() == null) {
            return false;
        }

        for (Student student : students) {
            if (!student.getStudentId().equals(updatedStudent.getStudentId())
                    && student.getDocumentNumber().equals(updatedStudent.getDocumentNumber())) {
                return false;
            }
        }

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(updatedStudent.getStudentId())) {
                students.set(i, updatedStudent);
                return true;
            }
        }
        return false;
    }

}