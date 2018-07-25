package mission.service;

import mission.repository.OrderRepository;
import org.springframework.stereotype.Service;

/**
 * @author Michael Mair
 */
@Service
//todo: #23 add qualifier
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public boolean validate(Integer orderId) {
        String order = orderRepository.findById(orderId);
        return order != null;
    }
}
