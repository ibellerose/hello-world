/*****
 Ian Bellerose
 ******/
public class GitDemo {
    
    private double previousNumber;
    
    public GitDemo() {
        previousNumber = 1;
    }
    
    /*****
     * This function should add 'num' to 'previousNumber' and return the sum.
    *****/
    public double addNumber(double num) {
        System.out.print("Add num to previousNumber");
        int sum = previousNumber + num;
        return previousNumber;
    }
    
    /*****
     * This function should calculate the factorial of 'num' and return the resulting value.
     * i.e. if num = 4,
     *  the function will return the value of (1 * 2 * 3 * 4)
     *****/
    public double findFactorial(int num) {
        double c = 1;
        
        for(int i = 1; i <= num; ++i){
            factNum = factNum * i;
        }
        
        return factNum;
    }
    
    /*****
     * This function should reverse 'num' and return the resulting value.
     * i.e. if num = 1234
     *  the function will return 4321
     *****/
    public double reverseNumber(int num){
        double newNum = 0;
        
        while( num != 0 ) {
            double temp = num % 10;
            newNum = newNum * 10 + temp;
            num /= 10;
        }
      
        return newNum;
    }
    
}
