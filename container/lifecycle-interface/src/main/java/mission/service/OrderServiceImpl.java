package mission.service;

/**
 * @author Michael Mair
 */
//todo: #34 add spring stereotype annotation
//todo: #36 implement InitializingBean + add WARN logging inside implemented method + change state of propertiesSet field
//todo: #37 implement DisposableBean and add WARN logging inside implemented method
public class OrderServiceImpl {

    //todo: #35 create SLF4J logger with LoggerFactory

    private boolean propertiesSet = false;

    public boolean arePropertiesSet() {
        return this.propertiesSet;
    }
}
