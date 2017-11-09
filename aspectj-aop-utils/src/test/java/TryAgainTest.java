import lombok.extern.java.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by ulysse on 09/11/2017.
 */
@Log
@RunWith(SpringRunner.class)
@SpringBootTest
public class TryAgainTest {

    class MyClass {
        @TryAgain(exceptions = {SQLException.class})
        public void myMethod() {
            log.info("Where are in MyClass.myMerthod()");
        }
    }

    @Test
    public void testTryAgain() {
        MyClass mc = new MyClass();
        mc.myMethod();

        assert true;
    }

}
