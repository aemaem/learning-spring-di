package mission.service

import mission.repository.OrderRepository
import mission.service.OrderServiceImpl
import org.springframework.context.ApplicationContext
import org.springframework.context.support.FileSystemXmlApplicationContext
import spock.lang.Specification

/**
 * @author Michael Mair
 */
class OrderServiceImplTest extends Specification {

    def "bean is registered and retrieved in static application context"() {
        given:
        ApplicationContext xmlContext = new FileSystemXmlApplicationContext("src/main/resources/context.xml")

        when:
        //todo: #10 get bean from application context
        OrderServiceImpl orderService = new OrderServiceImpl(xmlContext.getBean(OrderRepository))
        and:
        def result = orderService.validate(1000)

        then:
        result == true
    }
}
