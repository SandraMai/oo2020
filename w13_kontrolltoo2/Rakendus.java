import java.util.*;
public class Rakendus{
    public static void main(String[] arg){
        Toiduaine tomat = new Toiduaine("tomat", 1.5, 10, 30); 
        Toiduaine hapukoor = new Toiduaine("hapukoor", 2.6, 30, 2.7);
        Toiduaine kurk = new Toiduaine("kurk", 0.5, 12.5, 6.3);
        Toidukomponent tomatid = new Toidukomponent(30, tomat);
        Toidukomponent hapukoor1 = new Toidukomponent(50, hapukoor);
        Toidukomponent kurgid = new Toidukomponent(30, kurk);

        ArrayList<Toidukomponent> Toidukomponendid = new ArrayList<>();
        Toidukomponendid.add(tomatid);
        Toidukomponendid.add(hapukoor1);
        Toidukomponendid.add(kurgid);

        Toit kurgitomati = new Toit("salat", Toidukomponendid);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Sisesta kogus kilogrammides: ");

        int kogus = Integer.parseInt(myObj.nextLine())*1000;
        double soovitudKogus = kogus/kurgitomati.algneKogus();
        double tomatiKogus = Math.round(tomatid.kysiKogus()*soovitudKogus);
        double kurgiKogus = Math.round(kurgid.kysiKogus()*soovitudKogus);
        double hapukooreKogus = Math.round(hapukoor1.kysiKogus()*soovitudKogus);
        System.out.println("Vaja läheb: " + tomatiKogus + "g tomatit, " + hapukooreKogus + "g hapukoort ja " + kurgiKogus + "g kurki.");
    }
}