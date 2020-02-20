public class Akvaarium{
    double height;
    double length;
    double width;
    double waterIn;

    public Akvaarium(double newHeight, double newLength, double newWidth, double newWaterIn){
        height = newHeight;
        length = newLength;
        width = newWidth;
        waterIn = newWaterIn;
    }

    public double waterHeight(){
        return waterIn/(length*width);
    }

    public double waterInAquarium(){
        return waterIn;
    }

    public double cubage(){
        return height * length * width;
        
    }

    public void addWater(double cm3){
        waterIn = waterIn + cm3;
        if(waterInAquarium() > cubage()){
            System.out.println("Liiga palju vett!");
        }
    }
}