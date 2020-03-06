import java.util.Scanner;

public class Kt1{

    public static void kasJagub(int arv){
        int[] jagajad = {2, 3, 5, 7};
        int jagub = 0;
        for(int i=0;i<jagajad.length;i++){
            if(arv % jagajad[i] == 0){
                jagub++;
            }
        }
        if(jagub>0){
            System.out.println("Jagub");
        }else{
            System.out.println("Ei jagu");
        }
    }

    public static boolean kasAlgarv(int arv){
        for(int jagaja=2; jagaja<arv; jagaja++){
            if(arv % jagaja == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] arg){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Sisesta arv");
        int number = Integer.parseInt(myObj.nextLine());
        kasJagub(number);
        if(kasAlgarv(number) == true){
            System.out.println("On algarv");
        }else{
            System.out.println("Ei ole algarv");
        }
    
    }
}