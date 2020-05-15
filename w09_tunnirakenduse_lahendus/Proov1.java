public class Proov1{
    public static void main(String[] arg){
        PunktmassiPaar paar1=new PunktmassiPaar(new Punktmass1_klass(5, 3), new Punktmass1_klass(2, 10));
        System.out.println(paar1.massikeseX());
        PunktmassiPaar paar2=new PunktmassiPaar(paar1, new Punktmass1_klass(10, 15));
        System.out.println(paar2.massikeseX());
        System.out.println(paar2.tekstina());
    }
}