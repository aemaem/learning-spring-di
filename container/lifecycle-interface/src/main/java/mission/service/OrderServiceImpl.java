package mission.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * @author Michael Mair
 */
@Service
//todo: #34 add spring stereotype annotation
//todo: #36 implement InitializingBean + add WARN logging inside implemented method + change state of propertiesSet field
//todo: #37 implement DisposableBean and add WARN logging inside implemented method
public class OrderServiceImpl implements InitializingBean, DisposableBean {

    //todo: #35 create SLF4J logger with LoggerFactory
    private static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);

    private boolean propertiesSet = false;

    public boolean arePropertiesSet() {
        return this.propertiesSet;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.propertiesSet = true;
        log.warn("Properties set");
    }

    @Override
    public void destroy() throws Exception {
        log.warn("Destroyed");
    }
}
