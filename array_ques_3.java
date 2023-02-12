import java.util.Scanner;

import javax.swing.text.FlowView.FlowStrategy;

public class array_ques_3 {
    public static void main(String[] args) {
        /*
         * // practice
         * 
         * // ques-1 creat a array a 5 floats and calculate their sum
         * float[] marks = { 45.2f, 27.3f, 48.25f, 36.45f, 75.4f, 4587.24587f };
         * float sum =0;
         * for(float num:marks){
         * sum=sum+num;
         * 
         * 
         * System.out.println("the sum is\n"+ sum);
         */

        boolean isinarray = false;
        float[] marks = { 45.2f, 27.3f, 48.25f, 36.45f, 75.4f, 4587.24587f };
       // float num = 27.457f;
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
                for (float element : marks) {
            if (element == num) {
                isinarray = true;
                break;
            }  
        }
        if(isinarray){
            System.out.println("the element is in array");
        }
        else{
            System.out.println("element is not in array");
        }
        }

    }


