import org.junit.*;
import static org.junit.Assert.*;

public class JoogipudeliTestid{
    Joogipudel pudel1 = new Joogipudel(3, 0, 0.2, 0.10, new Jook("piim", 0.4, 1.05));
    Joogipudel pudel2 = new Joogipudel(3, 0, 0.2, 0.10, null);

    @Test
    public void KysiJoogiMass(){
        assertEquals(3.3500000000000005, pudel1.kysiMass(), 0.01);
    }

    @Test
    public void TeiseJoogiMass(){
        assertEquals(0.2, pudel2.kysiMass(), 0.01);
    }

    @Test
    public void vaat1(){
        Joogivaat v1= new Joogivaat(50, 15, new Jook("Limonaad", 0.2, 1.1));
        Joogipudel[] pd=new Joogipudel[10];
        for(int i=0; i<pd.length;i++){
            pd[i] = new Joogipudel(1.5, 1, 0.07, 0.10, null);
        }
        for(int i=0; i<pd.length;i++){
            v1.taida(pd[i]);
        }
        assertEquals(0, v1.kysiTaidetud(), 0.01);
    }
}