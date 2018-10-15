package mission.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Michael Mair
 */
//todo: #42 add spring stereotype annotation
@Service
public class OrderServiceImpl {

    //todo: #43 create SLF4J logger with LoggerFactory
    private static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);

    private boolean initialized = false;

    //todo: #44 annotate method with @PostConstruct
    @PostConstruct
    public void init() {
        this.initialized = true;
    }

    //todo: #45 annotate method with @PreDestroy
    @PreDestroy
    public void cleanup() {
        //todo: #46 log invocation
        log.warn("Cleanup");
    }

    public boolean isInitialized() {
        return this.initialized;
    }
}
