public class Vektor2D{
    double x, y;
    public Vektor2D(double ux, double uy){
        x=ux; y=uy;
    }
    public double kysiX(){return x;}
    public double kysiY(){return y;}
    public Vektor2D liida(Vektor2D liidetav){
        return new Vektor2D(this.kysiX()+liidetav.kysiX(), 
                            this.kysiY()+liidetav.kysiY());
    }
    public Vektor2D korruta(double tegur){
        return new Vektor2D(x*tegur, y*tegur);        
    }
    public String toString(){return x+","+y;}
}