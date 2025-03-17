package thomastech.thomastech_Spring.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "courses")
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseid;
    private String title;
    private String description;
    private String category;
    private Double price;
    private String duration;
    private String image;
    private String status;

    //public Course() {}
    public Course(String title, String description, String category, Double price, String duration,String image, String status) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.price = price;
        this.duration = duration;
        this.image=image;
        this.status = status;
    }
}
