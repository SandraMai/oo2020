public class Proov{
    public static void main(String[] arg){
        Hoidla h1=new ViljaHoidla();
        h1.lisa(3);
        h1.lisa(5);
        System.out.println(h1.kysi());
        Hoidla h2=new SeemneHoidla();
        h2.lisa(5);
        h2.lisa(10);
        System.out.println(h2.kysi());
    }
}