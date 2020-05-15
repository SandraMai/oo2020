public class Toidukomponent{
    double kogus;
    Toiduaine aine;

    public Toidukomponent(double ukogus, Toiduaine ua1){
        kogus = ukogus;
        aine = ua1;
        
    }

    public String toString(){
        return "Toiduaine: " + aine + ", kogus: " + kogus + "g";
    }

    public double rasvaKogus(){
        return (kogus*aine.kysiRasvad())/100;
    }

    public double valguKogus(){
        return (kogus*aine.kysiValgud())/100;
    }

    public double sysivesikuKogus(){
        return (kogus*aine.kysiSysivesikud())/100;
    }

    public String kysiNimetus(){
        return aine.nimetus;
    }

    public double kysiKogus(){
        return kogus;
    }
}