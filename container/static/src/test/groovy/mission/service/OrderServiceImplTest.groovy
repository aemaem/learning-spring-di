package mission.service

import mission.repository.OrderRepository
import mission.repository.OrderRepositoryImpl
import mission.service.OrderServiceImpl
import org.springframework.context.support.StaticApplicationContext
import spock.lang.Specification

/**
 * @author Michael Mair
 */
class OrderServiceImplTest extends Specification {

    def "bean is registered and retrieved in static application context"() {
        given:
        StaticApplicationContext staticContext = new StaticApplicationContext()
        //todo: #07 register bean
        staticContext.registerBean("orderRepository", OrderRepositoryImpl)

        when:
        //todo: #08 get bean from application context
        OrderServiceImpl orderService = new OrderServiceImpl(staticContext.getBean(OrderRepository))
        and:
        def result = orderService.validate(1000)

        then:
        result == true
    }
}
