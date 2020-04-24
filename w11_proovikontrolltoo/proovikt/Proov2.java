public class Proov2{
    public static void main(String[] arg){
        Jook j1=new Jook("piim", 0.4, 1.05);
        Joogipudel p1=new Joogipudel(3, 0, 0.2, 0.10, j1);
        System.out.println(p1);
        System.out.println(p1.kysiMass());
        System.out.println(p1.kysiOmahind());
        Joogipudel p2=new Joogipudel(3, 0, 0.2, 0.10, null);
        System.out.println(p2);
        System.out.println(p2.kysiMass());
        System.out.println(p2.kysiOmahind());
    }
}