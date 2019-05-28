package myPackage;


import java.util.*;

public class leftMove {
    public static void main(String[] args){
        String str = "adbcs";
        str.toCharArray();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] nums = {1,32,123};
        int[] n = {7,5,6,4};
        System.out.println(f(nums));
        System.out.println(6^(1));

    }

    public static String f(int[] nums){
        String str="";
        ArrayList<Integer> res = new ArrayList<>();
        for(int x:nums){
            res.add(x);
        }

        Collections.sort(res,new Comparator<Integer>(){
            public int compare(Integer s1,Integer s2){
                String str1 = s1+""+s2;
                String str2 = s2+""+s1;
                return str1.compareTo(str2);
            }
        });

        for(int x:res){
            str+=x;
        }
        return str;
    }
    public static int f2(String str){
        Set<Character> set = new HashSet<>();
        return 0;
    }

    public static void f2(int [] array){
        if(array==null) return;
        for(int i=0;i<array.length;i++){
            if((array[i]&1)!=0){
                int temp = array[i];
                int j=i-1;
                while(j>=0 && (array[j]&1)==0)
                {
                    array[j+1]=array[j];
                    j--;
                }
                array[j+1]=temp;
            }
        }
    }
    public static int f3(int[] array){
        int res = 0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j])
                    res++;
            }
        }
        return res;
    }
}
