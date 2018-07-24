package mission.service

import mission.repository.OrderRepository
import spock.lang.Specification

/**
 * @author Michael Mair
 */
class OrderServiceImplTest extends Specification {

    def "validate returns false because order id is null"() {
        setup:
        OrderRepository orderRepositoryMock = Mock()
        OrderServiceImpl orderService = new OrderServiceImpl()
        orderService.setOrderRepository(orderRepositoryMock)
        //todo: #05 inject dependent object as mock

        when:
        boolean result = orderService.validate(null)

        then:
        result == false
    }

    def "validate returns true because order id is returned"() {
        setup:
        OrderRepository orderRepositoryMock = Mock()
        orderRepositoryMock.findById(1000) >> "T-Shirts"
        OrderServiceImpl orderService = new OrderServiceImpl()
        orderService.setOrderRepository(orderRepositoryMock)
        //todo: #06 inject dependent object as mock

        when:
        boolean result = orderService.validate(1000)

        then:
        result == true
    }
}
