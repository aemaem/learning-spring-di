package mission.repository;

import org.springframework.stereotype.Repository;

/**
 * @author Michael Mair
 */
@Repository
public class OrderRepositoryImpl implements OrderRepository {

    @Override
    public String findById(Integer orderId) {
        return "foo";
    }
}
