public class Computer{
    Info pc;
    int finalAmount;

    public Computer(Info upc){
        pc = upc;
    }

    public int addAmount(int newAmount){
        finalAmount = (pc.getAmount()+newAmount);
        return finalAmount;
    }

    public String specs(){
        return "(" + pc.brand + ", " + pc.ram + "gb ram, " + pc.space + "gb, " + pc.price + "eur)";
    }
}
