package mission.service;

import javax.annotation.PostConstruct;

/**
 * @author Michael Mair
 */
//todo: #42 add spring stereotype annotation
public class OrderServiceImpl {

    //todo: #43 create SLF4J logger with LoggerFactory

    private boolean initialized = false;

    //todo: #44 annotate method with @PostConstruct
    public void init() {
        this.initialized = true;
    }

    //todo: #45 annotate method with @PreDestroy
    public void cleanup()  {
        //todo: #46 log invocation
    }

    public boolean isInitialized() {
        return this.initialized;
    }
}
