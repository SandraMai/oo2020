public class Kilpkonnatyyp1{
    int x;
    int y;
    String suund = "lõuna";
    public Kilpkonnatyyp1(int ux, int uy, String usuund){
        x = ux;
        y = uy;
        suund = usuund;
        if(!kasAsukohtSobib()){
            System.out.println("Sobimatu asukoht " + this.toString());
            //throw new RuntimeException("Asukoht ei sobi " + this.);
        }
    }
    public boolean kasAsukohtSobib(){
        if(x<1){return false;}
        if(y<1){return false;}
        if(x>4){return false;}
        if(y>4){return false;}
        return true;
    }
    public int kysiX(){
        return x;
    }
    public int kysiy(){
        return y;
    }
    public String toString(){
        return "(" +x+ "," +y+ "," +suund+ ")";
    }
    public void paremale(){
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
    public void edasi(){
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