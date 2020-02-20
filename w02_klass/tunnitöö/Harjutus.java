/*
Akvaarium
*koosta klass ristkülikukujulise akvaariumi tarbeks. Väljadeks pikkus, laius ja kõrgus cm.
Sees olev vesi milliliitrites. 
*loo käsklus küsimaks, mitme cmine kiht vett on akvaariumis
*loo käsklus akvaariumile etteantud milliliitrites jagu vee lisamiseks
*kui lisatav vee kogus ületab akvaariumi mahtu, siis antakse hoiatus
kood kahes failis -  ühes akvaarium ning teises proovikäsud
koosta peaprogramm mitme akvaariumiga
koosta akvaariumidest massiiv
loo funktsioon arvutamaks, mitu liitrit vett on akvaariumimassiivis kokku
*/

public class Harjutus{
    public static double waterTogether(Akvaarium[] akvaariumid){
        double summa = 0;
        for(int i=0; i<akvaariumid.length; i++){
            summa+=akvaariumid[i].waterInAquarium();
        }
        return summa;
    } 
    public static void main(String[] arg){
        Akvaarium fancyFishes = new Akvaarium(100, 150, 50,700000);
        Akvaarium localFishes = new Akvaarium(62, 77, 38,160000);
        Akvaarium boringFishes = new Akvaarium(30, 50, 10, 10000);
        System.out.println("Veesamba kõrgus: " + fancyFishes.waterHeight());
        System.out.println(localFishes.cubage());
        System.out.println(boringFishes.cubage());
        boringFishes.addWater(20001);
        System.out.println(boringFishes.waterInAquarium());
        Akvaarium[] ad = new Akvaarium[3];
        ad[0] = fancyFishes;
        ad[1] = localFishes;
        ad[2] = boringFishes;
        System.out.println("Vett kokku " + waterTogether(ad) );
    }
}