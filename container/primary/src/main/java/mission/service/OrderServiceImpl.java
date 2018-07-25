package mission.service;

import mission.repository.OrderRepository;
import org.springframework.stereotype.Service;

/**
 * @author Michael Mair
 */
@Service
//todo: #25 add primary annotation
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
