package myPackage;

import java.util.Scanner;

public class BigMuti {

    public static void main(String[] args) {
        System.out.println("Input two number");
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.next();
        String num2 = scanner.next();
        String result = mutiply(num1, num2);
        System.out.println("res:"+result);
        scanner.close();
    }

    public static String mutiply(String num1,String num2){
        int[] n1 = getNum(num1);
        int[] n2 = getNum(num2);
        int[] res = new int[num1.length()+num2.length()];
        for(int i=0;i<n1.length;i++){
            for(int j = 0;j<n2.length;j++){
                res[i+j] = n1[i]*n2[j];
            }
        }
        for(int i=res.length-1;i>0;i--){
            res[i-1] += res[i]/10;
            res[i] %= 10;
        }
        String resString ="";
        for(int i=0;i<res.length-1;i++){
            resString += ""+res[i];
        }
        return resString;
    }

    private static int[] getNum(String s){
        char[] ch = s.toCharArray();
        int[] num = new int[ch.length];
        for(int i =0;i<ch.length;i++){
            num[i] = ch[i] - '0';
        }
        return num;
    }
}
