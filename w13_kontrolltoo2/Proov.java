import java.util.*;

public class Proov{
    public static void main(String[] arg){
        Toiduaine tomat = new Toiduaine("tomat", 1.5, 10, 30); 
        Toiduaine hapukoor = new Toiduaine("hapukoor", 2.6, 30, 2.7);
        Toiduaine kurk = new Toiduaine("kurk", 0.5, 12.5, 6.3);
        Toidukomponent tomatid = new Toidukomponent(30, tomat);
        Toidukomponent hapukoor1 = new Toidukomponent(50, hapukoor);
        Toidukomponent kurgid = new Toidukomponent(30, kurk);
        System.out.println(tomatid.toString());
        System.out.println("Rasva kogus " + tomatid.rasvaKogus() + "g");

        // Toit kurgitomati = new Toit("salat", tomatid, hapukoor1, kurgid);
        // System.out.println(kurgitomati.toString());
        // System.out.println("Salat sisaldab " + kurgitomati.valguSisaldus() + "g valku, " + kurgitomati.rasvaSisaldus() + "g rasva ja " + kurgitomati.sysiSisaldus() + "g süsivesikuid");

        ArrayList<Toidukomponent> Toidukomponendid = new ArrayList<>();
        Toidukomponendid.add(tomatid);
        Toidukomponendid.add(hapukoor1);
        Toidukomponendid.add(kurgid);

        Toit kurgitomati = new Toit("salat", Toidukomponendid);
        System.out.println("Salatis on: " + kurgitomati.rasvaSisaldus() + "g rasva, " + kurgitomati.valguSisaldus() +"g valku ja  "+ kurgitomati.sysiSisaldus() + "g süsivesikuid.");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Sisesta kogus kilogrammides: ");

        int kogus = Integer.parseInt(myObj.nextLine())*1000;
        double soovitudKogus = kogus/kurgitomati.algneKogus();
        System.out.println("Vaja läheb: " + Math.round(tomatid.kysiKogus()*soovitudKogus) + "g tomatit, " + Math.round(hapukoor1.kysiKogus()*soovitudKogus) + "g hapukoort ja " + Math.round(kurgid.kysiKogus()*soovitudKogus) + "g kurki.");

    }
}