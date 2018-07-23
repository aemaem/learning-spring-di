package mission.service;

import mission.repository.OrderRepositoryImpl;

/**
 * @author Michael Mair
 */
public class OrderServiceImpl {

    private OrderRepositoryImpl orderRepository;

    public OrderServiceImpl() {
        this.orderRepository = new OrderRepositoryImpl();
    }
}
