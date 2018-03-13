package outer;

import com.tzhao.app.spring.SpringBootConsoleApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OuterClass {
    private static final Logger LOGGER = LoggerFactory.getLogger(OuterClass.class);

    public OuterClass()
    {
        LOGGER.info("info1");
        LOGGER.warn("warn1");
        LOGGER.error("error1");
    }
}
