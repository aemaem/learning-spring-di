package mission.service;

import mission.repository.OrderRepository;

/**
 * @author Michael Mair
 */
public class OrderServiceImpl {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public boolean validate(Integer orderId) {
        String order = orderRepository.findById(orderId);
        return order != null;
    }
}
