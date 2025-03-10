package thomastech.thomastech_Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thomastech.thomastech_Spring.entity.CustomerQuery;

@Repository
public interface CustomerQueryRepository extends JpaRepository<CustomerQuery,Long> {

}
