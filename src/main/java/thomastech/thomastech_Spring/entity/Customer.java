package thomastech.thomastech_Spring.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerid;

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
    @Size(max=500, message="Address cannot exceed 500 characters")
    private String address;

    @NotBlank(message="Education cannot be empty")
    @Size(max=500, message="Education cannot exceed 500 characters")
    private String education;

    @NotBlank(message="Course cannot be empty")
    @Size(max=500, message="Course cannot exceed 500 characters")
    private String course;

    public Customer(String firstname, String lastname, String email, String phoneno, String address, String education,String course) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phoneno = phoneno;
        this.address = address;
        this.education= education;
        this.course=course;
    }
}
