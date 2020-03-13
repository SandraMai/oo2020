public class Proov2Kuvamine{

    public static void kuva(Arvutatav a){
        for(int i=1; i<=5; i++){
            System.out.println(a.f(i)+" ");
        }
        System.out.println();
    }

    public static void kuva2(Arvutatav b){
        for(int i=1; i<=5; i++){
            System.out.println(b.f(i)+" ");
        }
        System.out.println();
    }
    


    public static void main(String[] arg){
        kuva(new RingiPindala());
        kuva2(new RuuduPindala());
        kuva(new RistkylikuPindala(5));
        kuva(new RisttahukaRuumala(5, 3));
    } 
}