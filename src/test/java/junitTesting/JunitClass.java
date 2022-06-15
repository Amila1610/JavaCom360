package junitTesting;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class JunitClass {

     @Mock
     Car car;

     @InjectMocks
     Opel opel;

     @Before
     public void setUp(){
         MockitoAnnotations.initMocks(this);
     }

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

    @Test
    public void mockitoTest(){
        String expected="This is Mokka!!!";
        when(car.message(any(String.class))).thenReturn(expected);

        String actual=opel.sampleMethod();

        if(expected==actual){
            System.out.println("The sporty and dinamic look is a sure vision of Opel's attractive future. This is Mokka!!! Test is ok!");
        }else {
            System.out.println("Fix the difference");
        }

        assertEquals(expected,actual);
    }

}
