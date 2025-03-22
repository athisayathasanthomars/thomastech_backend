package thomastech.thomastech_Spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CheckoutEntity {
    @Id
    private Long id;  // If you want to generate an ID for each checkout request (optional)

    private String courseName;
    private Long price;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
