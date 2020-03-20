public class HoidlaProov{
    public static void main(String[] arg){
        Hoidla h = new SeemneHoidla();
        for(int i = 0; i<arg.length; i++){
            h.lisa(Integer.parseInt(arg[i]));
        }
        System.out.println(h.kysi());
        System.out.println(h);
    }
}