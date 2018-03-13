package outer;

import com.tzhao.app.spring.service.HelloMessageService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OuterClass {


    private static final Logger LOGGER =
            LogManager.getLogger(OuterClass.class);

    public OuterClass() {
        LOGGER.info("info1");
        LOGGER.warn("warn1");
        LOGGER.error("error1");
    }
}
