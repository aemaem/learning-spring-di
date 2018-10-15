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
    //todo: #47 inject bean with annotation
    @Autowired
    private OrderServiceImpl orderService

    def "bean has been initialized"() {
        expect:
        orderService.isInitialized()
    }
}
