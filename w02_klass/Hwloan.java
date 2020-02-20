public class Hwloan{
    double loanSum;
    double interest;
    double period;
    public Hwloan(double nLoanSum, double nInterest, double nPeriod){
        loanSum = nLoanSum;
        interest = nInterest;
        period = nPeriod;
    }

    public double interestRate(){
        return interest/100*period*loanSum;
    }
    
    public double wholeSum(){
        return loanSum + interestRate();
    }

    public double askInterest(){
        return interest;
    }
}