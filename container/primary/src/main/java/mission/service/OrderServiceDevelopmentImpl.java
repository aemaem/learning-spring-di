package mission.service;

import mission.repository.OrderRepository;
import org.springframework.stereotype.Service;

/**
 * @author Michael Mair
 */
@Service
public class OrderServiceDevelopmentImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceDevelopmentImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public boolean validate(Integer orderId) {
        throw new UnsupportedOperationException();
    }
}
