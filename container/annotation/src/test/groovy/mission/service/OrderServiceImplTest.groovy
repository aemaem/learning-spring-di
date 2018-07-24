package mission.service

import mission.OrderConfiguration
import mission.repository.OrderRepository
import mission.service.OrderServiceImpl
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import spock.lang.Specification

/**
 * @author Michael Mair
 */
class OrderServiceImplTest extends Specification {

    def "bean is registered and retrieved in annotation configuration application context"() {
        given:
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext()
        //todo: #12 register configuration class
        annotationContext.register(OrderConfiguration)
        annotationContext.refresh()

        when:
        //todo: #13 get bean from application context
        OrderServiceImpl orderService = new OrderServiceImpl(annotationContext.getBean(OrderRepository))
        and:
        def result = orderService.validate(1000)

        then:
        result == true
    }
}
