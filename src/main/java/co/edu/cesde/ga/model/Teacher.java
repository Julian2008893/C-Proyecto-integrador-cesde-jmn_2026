package co.edu.cesde.ga.model;

public class Teacher extends Person{


    private Long  teacherId;

    public Teacher() { super();

    }

    public Teacher(Long userId, Long teacherId, String code, String documentNumber, String firstName, String lastName, String status) {
        super(userId, code, documentNumber, firstName, lastName, status);
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
                "TeacherId=" + teacherId +
                "DocuemntType=" + getDocumentType() +
                ", userId=" + getUserId() +
                ",documentNumber=" + getDocumentNumber() + '\'' +
                ",firstName=" + getFirstName() + '\'' +
                ",lastName=" + getLastName()+ '\'' +
                '}';



    }
}

