package mission.service;

import mission.repository.OrderRepository;

/**
 * @author Michael Mair
 */
//todo: #30 annotate with stereotype and scope of type prototype
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
