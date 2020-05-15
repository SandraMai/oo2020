import java.util.ArrayList;

public class Toit{
    String nimetus;
    ArrayList<Toidukomponent> komponendid;

    public Toit(String unimetus, ArrayList<Toidukomponent> ukomponendid){
        nimetus = unimetus;
        komponendid = ukomponendid;
    }

    // public String toString(){
    //     return "Salatis on " + k1.kysiNimetus() + ", " + k2.kysiNimetus() + " ja " + k3.kysiNimetus();
    // }

    public double rasvaSisaldus(){
        double kokku = 0;
        for(int i=0; i<komponendid.size();i++){
            kokku += komponendid.get(i).rasvaKogus();
        }
        return kokku;
    }

    public double valguSisaldus(){
        double kokku = 0;
        for(int i=0; i<komponendid.size();i++){
            kokku += komponendid.get(i).valguKogus();
        }
        return kokku;
    }

    public double sysiSisaldus(){
        double kokku = 0;
        for(int i=0; i<komponendid.size();i++){
            kokku += komponendid.get(i).sysivesikuKogus();
        }
        return kokku;
    }

    public double algneKogus(){
        double kokku = 0;
        for(int i=0; i<komponendid.size();i++){
            kokku += komponendid.get(i).kysiKogus();
        }
        return kokku;
    }
}