public class Proov1{    
    public static void main(String[] arg){
        Vektor2D v1=new Vektor2D(3, 1);
        System.out.println(v1.korruta(2));
        Vektor2D v2=new Vektor2D(-1, 0);
        Vektor2D v3=v1.liida(v2);
        System.out.println(v3.kysiX()+", "+v3.kysiY());
        System.out.println(v3);
    }
}