package co.edu.cesde.ga.model;

public class Teacher extends Person {

    private Long teacherId;

    public Teacher(Long userId, String code,String documentType, String documentNumber, String firstName, String lastName, String status) {

    }

    public Teacher(Long teacherId,Long userId, String code,String documentType, String documentNumber, String firstName, String lastName, String status) {
        super(userId, code, documentType, documentNumber, firstName, lastName, status);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId= " + getTeacherId() + '\n' +
                "userId= " + getUserId() + '\n' +
                "documentType= " + getDocumentType() + '\n' +
                "documentNumber= " + getDocumentNumber() + '\n' +
                "firstName= " + getFirstName() + '\n' +
                "lastName= " + getLastName() + '\n' +
                "status= " + getStatus() + '\n' +
                " }";
    }
}
