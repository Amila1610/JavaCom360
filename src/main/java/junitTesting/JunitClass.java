package junitTesting;

import org.junit.Test;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;

public class JunitClass {
    Toyota toyota=new Toyota("Toyota","C-HR",5);
    //Logger logger;

    @Test
    public void JunitTest(){
        Logger logger = Logger.getLogger("com.api.jar");

        logger.info("Test class has started running");
        toyota.printDetails();
        assertEquals("Toyota", toyota.make);
        //assertEquals("C-HRdd", toyota.model);
        logger.info("Test class has been ended.");
    }

}
