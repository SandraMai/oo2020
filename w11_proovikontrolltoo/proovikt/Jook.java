public class Jook{

    String nimetus;
    double liitri_omahind; // eur/liiter
    double erikaal; //kg/liiter

    public Jook(String unimetus, double uomahind, double ukaal){
        nimetus = unimetus;
        liitri_omahind = uomahind;
        erikaal = ukaal;
    }

    public String kysiNimetus(){
        return nimetus;
    }

    public double kysiOmahind(){
        return liitri_omahind;
    }

    public double kysiErikaal(){
        return erikaal;
    }

    public String toString(){
        return nimetus + " "+ liitri_omahind + " eur/liiter " + erikaal + " kg/liiter";
    }
}