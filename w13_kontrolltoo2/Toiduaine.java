public class Toiduaine{
    String nimetus;
    double valgud; //
    double rasvad;
    double sysivesikud;

    public Toiduaine(String unimetus, double uvalgud, double urasvad, double usysvesikud){
        if(uvalgud+urasvad+usysvesikud>100){
            System.out.println("Protsent kokku ei saa ületada 100%");
        }else{
            nimetus = unimetus;
            valgud = uvalgud;
            rasvad = urasvad;
            sysivesikud = usysvesikud;
        }
    }

    public String kysiNimetus(){
        return nimetus;
    } 

    public double kysiValgud(){
        return valgud;
    }

    public double kysiRasvad(){
        return rasvad;
    }

    public double kysiSysivesikud(){
        return sysivesikud;
    }

    public String toString(){
        return nimetus + ", valgud: " + valgud + "%, rasvad: " + rasvad + "%, süsivesikud: " + sysivesikud + "%";
    }
}