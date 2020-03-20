import java.util.*;
public class SeemneHoidla implements Hoidla{
    int kogus;
    List<Integer> kogused=new ArrayList<Integer>();
    public void lisa(int a){
        kogused.add(a);
    }
    public int kysi(){
        int summa=0;
        for(int i=0;i<kogused.size();i++){
            summa+=kogused.get(i);
        }
        return summa;
    }

    public String toString(){
        return "Hoidlas: " + kogused;
    }

}