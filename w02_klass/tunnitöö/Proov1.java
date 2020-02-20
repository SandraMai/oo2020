public class Proov1{
    public static void main(String[] arg){
        Kilpkonnatyyp1 hallloom = new Kilpkonnatyyp1(2,1,"lõuna");
        Kilpkonnatyyp1 kollaneloom = new Kilpkonnatyyp1(2,3,"põhi");
        //System.out.println(hallloom.toString()); annab sama välja
        hallloom.edasi();
        kollaneloom.edasi();
        System.out.println(hallloom.kysiX());
        System.out.println(kollaneloom.kysiX()-hallloom.kysiX());
        hallloom.paremale();
        System.out.println(hallloom);
        hallloom.edasi();
        hallloom.edasi();
        hallloom.edasi();
        System.out.println(hallloom);

    } 
}