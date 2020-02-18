public class Bmrcalc{
    public static double mequation(int weight, int height, int age){
        double malebmr = 66.5 + (13.75 * weight) + (5.003 * height) - (6.775 * age);
        return malebmr;
    }

    public static double fequation(int weight, int height, int age){
        double femalebmr = 655.1 + (9.563 * weight) + (1.85 * height) - (4.676 * age);
        return femalebmr; 
    }

    public static void main(String[] arg){
        String sex = arg[0];
        int weight = Integer.parseInt(arg[1]);
        int height = Integer.parseInt(arg[2]);
        int age = Integer.parseInt(arg[3]); 
        if(sex.equals("naine")){
            System.out.println("Päevane baasenergiakulu on "+ fequation(weight, height, age) +" kcal.");
        }else if(sex.equals("mees")){
            System.out.println("Päevane baasenergiakulu on " + mequation(weight, height, age) +" kcal.");
        }
    }
}
/*
java Bmrcalc naine 52 167 22
Päevane baasenergiakulu on 1358.454 kcal.
ululullululullu
*/
