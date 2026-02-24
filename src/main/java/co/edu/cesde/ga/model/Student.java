package co.edu.cesde.ga.model;

public class Student extends Person {

    public Student() {

    }

    public Student(Long userId, String code, String documentNumber, String firstName, String lastName, String status) {
        super(userId, code, documentNumber, firstName, lastName, status);
    }
private String birthDate;

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;


    }
}
