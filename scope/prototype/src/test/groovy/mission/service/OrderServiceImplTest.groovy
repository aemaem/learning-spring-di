package mission.service

import mission.OrderConfiguration
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

/**
 * @author Michael Mair
 */
@ContextConfiguration(classes = OrderConfiguration)
class OrderServiceImplTest extends Specification {

    @Autowired
    private ApplicationContext context

    def "bean is a singleton"() {
        when:
        def bean1 = context.getBean(OrderService)
        def bean2 = context.getBean(OrderService)

        then:
        bean1 != bean2
    }
}
