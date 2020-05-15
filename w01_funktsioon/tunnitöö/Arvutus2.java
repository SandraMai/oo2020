public class Arvutus2{
    public static void main(String[] arg){
        int arv=Integer.parseInt(arg[0]);
        int arv2=Integer.parseInt(arg[1]);
        //koosta etteantud suuruses korrutustabel
        for(int i=1; i<arv; i++){
            for(int j=1; j<=arv2; j++){
                int v=i*j;
                if(i<10){System.out.print(" ");}
                System.out.print(" "+ v);
            }
            System.out.println();
        }
    }
}