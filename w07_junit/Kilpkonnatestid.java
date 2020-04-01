import org.junit.*;
import static org.junit.Assert.*;

public class Kilpkonnatestid{
    K2igud kilbu = new Kilpkonn(2, 6, "lõuna");
    K2igud henri = new Uss(1, 3, "põhi");

    @Test
    public void kysiXkoordinaat(){
        assertEquals(2, kilbu.kysiX());
    }

     @Test
    public void kysiYkoordinaat(){
        kilbu.edasi("põhi");
        assertEquals(5, kilbu.kysiY());
    }

    @Test
    public void kysiUssilt(){
        henri.edasi("lõuna");
        henri.edasi("ida");
        assertEquals(2, henri.kysiX());
        assertEquals(4, henri.kysiY());
    }
} 

//java -cp junit4.jar:. org.junit.runner.JUnitCore Kilpkonnatestid
//JUnit version 4.8.2
//...
//Time: 0.019

//OK (3 tests)
