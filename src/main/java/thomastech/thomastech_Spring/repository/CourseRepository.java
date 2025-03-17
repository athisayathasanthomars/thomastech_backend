package thomastech.thomastech_Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thomastech.thomastech_Spring.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
