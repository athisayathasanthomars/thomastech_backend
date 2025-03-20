package thomastech.thomastech_Spring.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentid;

    @NotBlank(message="First name cannot be empty")
    @Size(min=2,max=50,message="First name must be between 2 and 50 characters")
    private String firstname;

    @NotBlank(message="Last name cannot be empty")
    @Size(min=2,max=50,message="Last name must be between 2 and 50 characters")
    private String lastname;

    @NotBlank(message="Email cannot be empty")
    @Email(message="Invalid email format")
    private String email;

    @NotBlank(message="Phone number cannot be empty")
    @Pattern(regexp="^[0-9]{10}$", message = "Phone number must be 10 digits")
    private String phoneno;

    @NotBlank(message="Address cannot be empty")
    @Size(min=2,max=100,message="Address must be between 2 and 100 characters")
    private String address;

    @NotBlank(message="Education cannot be empty")
    @Size(min=2,max=50,message="Education must be between 2 and 50 characters")
    private String education;

    private String selectedcourse;

    private String status;

    public Student(String firstname,String lastname,String email,String phoneno,String address,String education,String selectedcourse,String status){
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
        this.phoneno=phoneno;
        this.address=address;
        this.education=education;
        this.selectedcourse=selectedcourse;
        this.status=status;
    }

    public Long getStudentId() {
        return studentid;
    }

    public String getFirstName() {
        return firstname;
    }
    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }
    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getPhoneNo() {
        return phoneno;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneno = phoneNo;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String Address) {
        this.address = Address;
    }

    public String getEducation() {
        return education;
    }
    public void setEducation(String Education) {
        this.education=Education;
    }

    public String getSelectedCourse() {
        return selectedcourse;
    }
    public void setSelectedCourse(String SelectedCourse) {
        this.selectedcourse = SelectedCourse;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String Status) {
        this.status = Status;
    }
}
