public class Ala{
    public double xmin, ymin, xmax, ymax;
    public Ala(Vektor2D koht1, Vektor2D koht2){
        xmin=Math.min(koht1.kysiX(), koht2.kysiX());
        xmax=Math.max(koht1.kysiX(), koht2.kysiX());
        ymin=Math.min(koht1.kysiY(), koht2.kysiY());
        ymax=Math.max(koht1.kysiY(), koht2.kysiY());
    }
    //Koosta funktsioon, mis tagastab, kas etteantud asukoht on ala sees
    public boolean kasSees(Vektor2D koht){
        if(koht.kysiX()<xmin){return false;}
        if(koht.kysiX()>xmax){return false;}
        if(koht.kysiY()<ymin){return false;}
        if(koht.kysiY()>ymax){return false;}
        return true;
    }
    public String toString(){
        return xmin+","+xmax+"-"+ymin+","+ymax;
    }
}