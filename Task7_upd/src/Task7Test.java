
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.commons.util.StringUtils;
import org.junit.rules.ExpectedException;

import java.io.IOException;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.*;

class Task7Test {


        @org.junit.jupiter.api.Test
        public void testPus(){
            Task7.Calculator c = new Task7.Calculator(1.1 , 2.3 , "+");
            assertEquals(3.4, c.plus() );
        }
        @org.junit.jupiter.api.Test
        public void testMinus(){
            Task7.Calculator c = new Task7.Calculator(5.2, 2.1, "-");
            assertEquals(3.1, c.minus() );
        }

        @org.junit.jupiter.api.Test
        public void testProizv(){
            Task7.Calculator c = new Task7.Calculator(1.2 , 3.5 , "*");
            assertEquals( 4.2 , c.proizv() );
        }

        @org.junit.jupiter.api.Test
        public void testProizv0(){
            Task7.Calculator c = new Task7.Calculator(3.2 , 0 , "*");
            assertEquals( 0 , c.proizv() );
        }

        @org.junit.jupiter.api.Test
        public void testDelenie(){
            Task7.Calculator c = new Task7.Calculator(6.2,2 , "/");
            assertEquals( 3.1 , c.delenie() );
        }


}

