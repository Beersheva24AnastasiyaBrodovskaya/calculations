package telran.introduction;

public class Calculations {
    public static int sum(int op1, int op2) {
       int res = op1 + op2;
       return res;
    }
    public static int multiply(int op1, int op2) {
        int res = op1 * op2;
        return res;
    }
    public static int divide(int op1, int op2) {
        
        int res = op1 / op2;
        return res;
       
    }
    public static int subtract(int op1, int op2) {
        
        int res = op1 - op2;
        return res;
    }
    public static int sumOfDigits(int number) {
        
        int s;
        s=0;
        while(Math.abs(number)>0){
            s=s+number%10;
            number=number/10;
        }
        return s;
    }
   
    public static int maxDigit(int number){
        
        int maxD;
        maxD = 0;
        while (Math.abs(number)>0){
            if (number%10 >= maxD){
                maxD = number%10;
            }
            number = number / 10;
        }
        return maxD;
    }
    public static boolean isDividedOn(int number, int dividor) {
        
        
        return (number%dividor == 0) && (dividor != 0);
        }
        }
    