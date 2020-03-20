import java.util.ArrayList;
public class Abifunktsioonid{
	public static void main(String[] arg){
		System.out.println(geomKeskmine(new double[]{4,9}));
	}
	public static double geomKeskmine(double[] arvud){		
		double abi = arvud[0];
		for(int i = 1; i < arvud.length; i++){
			abi*=arvud[i];}
		return Math.pow(abi, 1.0/arvud.length);
	}

	public static ArrayList<Integer> jagajateLoetelu(int arv){
        ArrayList<Integer> vastus=new ArrayList<Integer>();
        int jagaja=2;
        while(arv != 1){
            if(arv % jagaja == 0){
                vastus.add(jagaja);
                arv = arv / jagaja;
                jagaja = 2;
            } else {
                jagaja++;
            }
        }
        return vastus;
    }

	public static ArrayList<Integer> yhisedJagajad(int arv1, int arv2){
        ArrayList<Integer> jagajad1 = jagajateLoetelu(arv1);
        ArrayList<Integer> jagajad2 = jagajateLoetelu(arv2);
        ArrayList<Integer> vastus= new ArrayList<Integer>();
        for(int arv: jagajad1){
            if(jagajad2.contains(arv)){
                vastus.add(arv);
                jagajad2.remove(new Integer(arv));
            }
        }
        return vastus;
    }
    //koosta funktsioon väljastamaks ArrayListis olevate arvude korrutise
    public static int arvudeKorrutis(ArrayList<Integer> tegurid){
        int korrutis=1;
        for(int arv: tegurid){
            korrutis = korrutis*arv;
        }
        return korrutis; 
    }
    
    //koosta funktsioon kahe arvu suurima ühisteguri leidmiseks kasutades eelnevaid funktsioone
    public static int syt(int arv1, int arv2){
        return arvudeKorrutis(yhisedJagajad(arv1, arv2));
    }
}