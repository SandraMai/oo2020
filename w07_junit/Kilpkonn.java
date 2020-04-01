import java.util.*;
public class Kilpkonn implements K2igud{
    int x;
    int y;
    String suund;
    public Kilpkonn(int ux, int uy, String usuund){
        x = ux;
        y = uy;
        suund = usuund;
    }
    
    public int kysiX(){
        return x;
    }

    public int kysiY(){
        return y;
    }

    public void paremale(String suund){
        if(suund.equals("ida")){
            suund = "lõuna";
        }else if(suund.equals("lõuna")){
            suund = "lääs";
        }else if(suund.equals("lääs")){
            suund = "põhi";
        }else{
            suund ="ida";
        }
    }
    public void edasi(String suund){
        if(suund.equals("ida")){
            x++;
        }else if(suund.equals("põhi")){
            y--;
        }else if(suund.equals("lõuna")){
            y++;
        }else if(suund.equals("lääs")){
            x--;
        }
    }
}