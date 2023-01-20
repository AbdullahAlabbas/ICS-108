package PracticeProblems;
public class Investment 
{
    public static void main(String[] args) 
    {
        System.out.println(futureInvestmentValue(10000, 0.05/12, 5));
        
    }   
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) 
    {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    } 
}
