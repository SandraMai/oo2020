import org.junit.*;
import static org.junit.Assert.*;
public class HoidlaTestid1{
  Hoidla h1=new ViljaHoidla();
  Hoidla h2=new SeemneHoidla();

  @Test
  public void algusesTyhi(){
    h1 = new ViljaHoidla();
    assertEquals(0, h1.kysi());
  }

  @Test
  public void lisamine1(){
	  h1.lisa(3);
	  h1.lisa(4);
      assertEquals(7, h1.kysi());
  }  
  @Test
  public void lisamine2(){
    h2.lisa(5);
    h2.lisa(10);
    assertEquals(15, h2.kysi());
  }
}