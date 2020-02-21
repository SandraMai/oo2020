public class Proov3{
    public static void main(String[] arg){
        Ala a1=new Ala(new Vektor2D(90, 0), new Vektor2D(0, 30));
        System.out.println(a1);
        Vektor2D palliKoht=new Vektor2D(1, 15);
        System.out.println(a1.kasSees(palliKoht));
        Paiknemine palliPaiknemine=new Paiknemine(palliKoht, new Vektor2D(10, 0));
        System.out.println(a1.kasSees(palliPaiknemine.kysiAsukoht(1)));
        //Koosta kolm ala - kogu väljak, kummagi võistkonna väravavahi ala
        //Väravavaht lööb palli oma värava eest keskelt otse teise värava suunas
        //kiirusega 10 m/s. Kuva iga sekundi järel, milliste alade sees pall on
      for(int sekund=0; sekund<12; sekund++){
        Ala[] alad=new Ala[3];
        alad[0]=new Ala(new Vektor2D(0, 0), new Vektor2D(90, 30));
        alad[1]=new Ala(new Vektor2D(0, 5), new Vektor2D(15, 25));
        alad[2]=new Ala(new Vektor2D(75, 5), new Vektor2D(90, 25));
        System.out.print(sekund);
        for(int i=0; i<alad.length; i++){
            System.out.print(
              " "+alad[i].kasSees(palliPaiknemine.kysiAsukoht(sekund)));
        }
        System.out.println();
      }
    }
}