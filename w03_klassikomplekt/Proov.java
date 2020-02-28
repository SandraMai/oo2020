public class Proov{
    public static void main(String[] arg){
        Info sp1 = new Info("HP", 8, 500, 469.99,3);
        Computer sh1 = new Computer(sp1);
        System.out.println(sp1.getAmount());
        System.out.println(sh1.addAmount(2));
        System.out.println(sh1.finalAmount);
        System.out.println(sh1.specs());
    }
}

//3
//5
//5
//(HP, 8gb ram, 500gb, 469.99eur)
