package thomastech.thomastech_Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thomastech.thomastech_Spring.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
