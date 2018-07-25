package mission.service

import mission.OrderConfiguration
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification
import spock.lang.Subject

/**
 * @author Michael Mair
 */
@ContextConfiguration(classes = OrderConfiguration)
class OrderServiceImplTest extends Specification {

    @Subject
    //todo: #26 add autowired annotation
    @Autowired
    private OrderService orderService

    def "bean is autowired"() {
        when:
        def result = orderService.validate(1000)

        then:
        result == true
    }
}
