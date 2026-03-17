package co.edu.cesde.ga.model;

public class Student extends Person {

    public Student() {

    }

    public Student(Long studentId, Long userId, String code, String documentNumber, String firstName, String lastName, String status) {
        super(userId, code, documentNumber, firstName, lastName, status);
        this.birthDate = birthDate;
        this.studentId = studentId;
    }

    private String birthDate;
    private long studentId;

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;


    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {

        return "Teacher{" +
                "StudentId=" + +studentId +
                ", userId=" + getUserId() +
                ",documentNumber=" + getDocumentNumber() + '\'' +
                ",firstName=" + getFirstName() + '\'' +
                ",lastName=" + getLastName() + '\'' +
                ",birthDate=" + birthDate +
                "status =" + getStatus() +
                '}';

    }
}