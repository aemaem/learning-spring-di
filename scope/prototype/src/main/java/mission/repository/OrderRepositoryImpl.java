package mission.repository;

import org.springframework.stereotype.Repository;

/**
 * @author Michael Mair
 */
//todo: #31 annotate with stereotype
@Repository
public class OrderRepositoryImpl implements OrderRepository {

    @Override
    public String findById(Integer orderId) {
        return "foo";
    }
}
