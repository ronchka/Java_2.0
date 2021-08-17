import org.junit.jupiter.api.Test;
import sun.awt.SunToolkit;
import static org.junit.jupiter.api.Assertions.*;

public class Task8Tests {

    @Test
    public void testSum(){
        Task7.Calculator c = new Task7.Calculator(1.1 , 2.3 , "сложение");
        assertEquals( 3.4, c.sum() );
    }

    @Test
    public void testMinus(){
        Task7.Calculator c = new Task7.Calculator(2.3 , 1.1 , "вычитание");
        assertEquals( 1.2 , c.minus() );
    }

    @Test
    public void testProizv(){
        Task7.Calculator c = new Task7.Calculator(1.2 , 3.5 , "умножение");
        assertEquals( 4.2 , c.proizv() );
    }

    @Test
    public void testProizv0(){
        Task7.Calculator c = new Task7.Calculator(3.2 , 0 , "умножение");
        assertEquals( 0 , c.proizv() );
    }

    @Test
    public void testDelenie(){
        Task7.Calculator c = new Task7.Calculator(6,2 , 2 , "деление");
        assertEquals( 3.1 , c.delenie() );
    }

}