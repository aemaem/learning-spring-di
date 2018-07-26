package mission.service

import mission.repository.OrderRepository
import mission.service.OrderServiceImpl
import spock.lang.Specification

/**
 * @author Michael Mair
 */
class OrderServiceImplTest extends Specification {

    def "validate returns false because order id is null"() {
        setup:
        OrderRepository repositoryMock = Mock()
        OrderServiceImpl orderService = new OrderServiceImpl(repositoryMock)
        //todo: #03 inject dependent object as mock

        when:
        boolean result = orderService.validate(null)

        then:
        result == false
    }

    def "validate returns true because order id is returned"() {
        setup:
        OrderRepository repositoryMock = Mock()
        repositoryMock.findById(1000) >> "foo"
        OrderServiceImpl orderService = new OrderServiceImpl(repositoryMock)
        //todo: #04 inject dependent object as mock

        when:
        boolean result = orderService.validate(1000)

        then:
        result == true
    }
}
