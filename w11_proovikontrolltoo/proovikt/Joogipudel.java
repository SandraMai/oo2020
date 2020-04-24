public class Joogipudel{

    double maht;
    int pudelityyp; // 0-klaas,1- plastik 
    double mass;
    double taara_maksmus;
    Jook sisu;
    
    public Joogipudel(double umaht, int utyyp, double umass, double umaksmus, Jook uj1){
        maht = umaht;
        pudelityyp = utyyp;
        mass = umass;
        taara_maksmus = umaksmus;
        sisu = uj1;
    }

    public String toString(){
        return "Sisu: " + sisu + " taara " +((pudelityyp == 0)? "klaas ":"plastik ")+ mass + " kg, " + taara_maksmus + " eur";  
    }

    public double kysiMass(){
        if(sisu==null){
            return mass;
        }else{
            return mass+maht*sisu.kysiErikaal();
        }
    }

    public double kysiOmahind(){
        if(sisu==null){
            return taara_maksmus;
        }else{
            return taara_maksmus+maht*sisu.kysiOmahind();
        }
    }

    public Jook kysiSisu(){
        return sisu;
    }

    public void uusSisu(Jook j){
        sisu = j;
    }

    public double kysiMaht(){
        return maht;
    }
}