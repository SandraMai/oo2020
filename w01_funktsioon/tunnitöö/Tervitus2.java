public class Tervitus2{
    public static void main(String[] arg){ //kokku lepitud et main alustab tööd
        if(arg.length>0){
            System.out.println("Tere, " + arg[0]);
            System.out.println("Sinu nimes on " + arg[0].length() + " tähte.");
        } else {
            System.out.println("Kasuta kujul: ");
            System.out.println("java Tervitus 2 Kati");
        }
    }
}