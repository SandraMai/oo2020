public class Hwtest{
    public static void main(String[] arg){
        Hwloan loan1 = new Hwloan(60000, 2.5, 15);
        Hwloan loan2 = new Hwloan(100000, 3, 20);
        System.out.println("Intressimäär on " + loan1.interestRate());
        System.out.println("Intress on " + loan1.askInterest());
        System.out.println("Intressimäär on " + loan2.interestRate());
        System.out.println("Kogu tagasimakstav summa on " + loan2.wholeSum());
    }
}

/*
Intressimäär on 22500.0
Intress on 2.5
Intressimäär on 60000.0
Kogu tagasimakstav summa on 160000.0
*/