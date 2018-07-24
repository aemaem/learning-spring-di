package mission;

import mission.repository.OrderRepository;
import mission.repository.OrderRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Michael Mair
 */
@Configuration
public class OrderConfiguration {

    //todo: #11 register bean
    @Bean
    public OrderRepository orderRepository() {
        return new OrderRepositoryImpl();
    }
}
