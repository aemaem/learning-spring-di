package mission.repository;

import org.springframework.stereotype.Component;

/**
 * @author Michael Mair
 */
//todo: #15 annotate with stereotype
@Component
public class OrderRepositoryImpl implements OrderRepository {

    @Override
    public String findById(Integer orderId) {
        return "foo";
    }
}
