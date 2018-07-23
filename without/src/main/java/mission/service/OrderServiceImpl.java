package mission.service;

import mission.repository.OrderRepositoryImpl;

/**
 * @author Michael Mair
 */
public class OrderServiceImpl {

    private final OrderRepositoryImpl orderRepository;

    public OrderServiceImpl() {
        this.orderRepository = new OrderRepositoryImpl();
    }

    public boolean validate(Integer orderId) {
        String order = orderRepository.findById(orderId);
        return order != null;
    }
}
