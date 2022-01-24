package calc.calc.sq.mvn;
/*
 * This code is for simple arithmetic calculation
 */
public class Calc {
    public double doAdd(double a, double b){
    	double sum = 0;
    	sum = a + b;
        return sum;
    }
    public double doSub(double num1, double num2){
        double sub = 0;
        sub = num1 - num2;
    	return sub;
    }
    public double doMul(double num1, double num2){
        return num1 * num2;
    }
    public double doDiv(double num1, double num2) throws Exception{
        if(num2 == 0){
        	throw new Exception();
        }
    	return num1 / num2;
    }
	public double changeSign(double num){
        return -1 * num;
    }
}
