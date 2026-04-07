package co.edu.cesde.ga.model;

public class Student extends Person {

    private String birthDate;
    private Long studentId;

    public Student(Long studentId, String documentType, String documentNumber, String firstName, String lastName, String status, String birthDate) {
    }

    public Student(Long studentId, String birthDate, Long userId, String code,String documentType, String documentNumber, String firstName, String lastName, String status) {
        super(userId, code, documentType, documentNumber, firstName, lastName, status);
        this.birthDate = birthDate;
        this.studentId = studentId;
    }

    public String getBirthDate() { return birthDate;}

    public void setBirthDate(String birthDate) {this.birthDate = birthDate;}

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + getStudentId() + '\n' +
                "userId=" + getUserId() + '\n' +
                "documentNumber= " + getDocumentNumber() + '\n' +
                "documentType=" + getDocumentType() + '\n' +
                "firstName=" + getFirstName() + '\n' +
                "lastName=" + getLastName() + '\n' +
                "birthDate=" + getBirthDate() + '\n' +
                "status=" + getStatus() + '\n' +
                " }";
    }
}
