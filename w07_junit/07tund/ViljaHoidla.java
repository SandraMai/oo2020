public class ViljaHoidla implements Hoidla{
    int kogus;
    public void lisa(int a){
        kogus += a;
    }
    public int kysi(){
        return kogus;
    }
}