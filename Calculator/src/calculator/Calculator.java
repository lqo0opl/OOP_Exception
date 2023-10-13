/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author User
 */
public class Calculator {
    public int add(int x, int y){
        int result = 0;
        try{
            result = x + y;
        }catch(Exception e){
            System.out.println("General Error Get Better"+"\n"+e);
        }
        return result;
    }
    
    // This method could throw an ArithmeticException
    public double divide(int x, int y) {
        int result = 0;
        try{
            result = x / y;
        }catch(Exception e){
            System.out.println("Error Get Better"+"\n"+e);
        }
        return result;
    }
    
     public static void main(String[] args) {
        // TODO code application logic here
        Calculator Calc = new Calculator();
            System.out.println(Calc.divide(10,0));
    }
}
