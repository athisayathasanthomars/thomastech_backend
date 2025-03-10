package thomastech.thomastech_Spring.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;

//import lombok.Data; //for @Data
//@Data // generates all getter/setter methods automatically
@Entity
@Table(name = "customerquery")
public class CustomerQuery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long queryid;

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

    @NotBlank(message="Message cannot be empty")
    @Size(max=500, message="Message cannot exceed 500 characters")
    private String message;

    private String status; //Default value is New

    public CustomerQuery(String firstname, String lastname, String email, String phoneno, String message, String status) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phoneno = phoneno;
        this.message = message;
        this.status = status;
    }

    public Long getQueryId() {
        return queryid;
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

    public String getMessage() {
        return message;
    }
    public void setMessage(String Message) {
        this.message = Message;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String Status) {
        this.status = Status;
    }
}
