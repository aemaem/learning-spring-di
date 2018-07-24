package mission.service

import mission.service.OrderServiceImpl
import spock.lang.Specification

/**
 * @author Michael Mair
 */
class OrderServiceImplTest extends Specification {

    def "validate returns false because order id is null"() {
        setup:
        OrderServiceImpl orderService = new OrderServiceImpl()
        //todo: #01 instantiate order service

        when:
        boolean result = orderService.validate(null)

        then:
        result == false
    }

    def "validate returns true because order id is returned"() {
        setup:
        OrderServiceImpl orderService = Spy(new OrderServiceImpl())
        //todo: #02 instantiate order service
        orderService.validate(1000) >> true

        when:
        boolean result = orderService.validate(1000)

        then:
        result == true
    }
}
