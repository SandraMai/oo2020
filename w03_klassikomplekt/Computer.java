public class Computer{
    Info pc;

    public Computer(Info upc){
        pc = upc;
    }

    public int addAmount(int newAmount){
        return (pc.getAmount()+newAmount);
    }

    public String specs(){
        return "(" + pc.brand + ", " + pc.ram + "gb ram, " + pc.space + "gb, " + pc.price + "eur)";
    }
}
