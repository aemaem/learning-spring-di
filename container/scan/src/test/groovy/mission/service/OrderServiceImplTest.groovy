package mission.service

import mission.service.OrderServiceImpl
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import spock.lang.Specification

/**
 * @author Michael Mair
 */
class OrderServiceImplTest extends Specification {

    def "bean is registered and retrieved in annotation configuration application context using component scan"() {
        given:
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext()
        //todo: #14 register configuration class

        when:
        //todo: #17 get bean from application context
        OrderServiceImpl orderService = new OrderServiceImpl(null)
        and:
        def result = orderService.validate(1000)

        then:
        result == true
    }
}
