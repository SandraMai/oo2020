public class Info{
    String brand;
    int ram; 
    int space;
    double price;
    int amount;

    public Info(String ubrand, int uram, int uspace, double uprice, int uamount){
        brand = ubrand;
        ram = uram;
        space = uspace;
        price = uprice;
        amount = uamount;
    }

    public int getAmount(){
        return amount;
    }
    
}
