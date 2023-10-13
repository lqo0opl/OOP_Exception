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
public class ExceptionEx1{

    public static void main(String args[]) {
       
            int[] nums = {3, 2, 6, 1};
            badUse(nums);
    }

    public static void badUse(int[] vals) {
        int total = 0;
            try{
                for (int i = 0; i < vals.length; i++) {
                    int index = vals[i];
                    System.out.printf("%d + %d\n", index, vals[index]);
                    total += vals[index];
                }
            }catch(Exception e){
                System.out.println("Error Get Better"+"\n"+e);
            }
      
         System.out.println(total);
    }
}
