public class RisttahukaRuumala implements Arvutatav{
    double pikkus;
    double laius;
    public RisttahukaRuumala(double upikkus, double ulaius){
        pikkus = upikkus;
        laius = ulaius;
    }
    public double f(double korgus){
        return pikkus*laius*korgus;
    }
}