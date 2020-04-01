public class Kilpkonnaproov{
    public static void main(String[] arg){
        Kilpkonn kilbu = new Kilpkonn(2, 6, "lõuna");
        Uss peeter = new Uss(4, 10, "lääs");  
       
        kilbu.edasi("põhi");
        System.out.println(kilbu.kysiX());
        kilbu.paremale("ida");
        kilbu.edasi("lõuna");
        System.out.println(kilbu.kysiY());
        jaagu.edasi("lõuna");
        System.out.println(peeter.kysiY());


    } 
}

//[sandrmai@greeny kodutoo7]$ java Kilpkonnaproov
//2
//6
//11
