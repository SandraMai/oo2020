public class Arvutus3{
    public static void main(String[] arg){
        if(arg.length!=2){
            System.out.println("palun ridade ja veergude arv");
            return;
        }
        try{
            int arv=Integer.parseInt(arg[0]);
            int arv2=Integer.parseInt(arg[1]);
            //koosta etteantud suuruses korrutustabel
            for(int i=1; i<arv; i++){
                for(int j=1; j<=arv2; j++){
                    int v=i*j;
                    if(i<10){
                        System.out.print(" ");
                    }
                    System.out.print(" "+ v);
                }
                System.out.println();
            }
        } catch(Exception ex){
            System.out.println("Probleem " + ex.getMessage());
        }
    }
}