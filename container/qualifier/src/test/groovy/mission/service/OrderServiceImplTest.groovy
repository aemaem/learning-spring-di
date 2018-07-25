package mission.service

import mission.OrderConfiguration
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification
import spock.lang.Subject

/**
 * @author Michael Mair
 */
@ContextConfiguration(classes = OrderConfiguration)
class OrderServiceImplTest extends Specification {

    @Subject
    //todo: #24 add autowired annotation along with qualifier
    @Autowired
    @Qualifier("production")
    private OrderService orderService

    def "bean is autowired"() {
        when:
        def result = orderService.validate(1000)

        then:
        result == true
    }
}
