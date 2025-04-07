package CodingJava8;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        //7
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int sum=0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0 && list.size()==0){
                list.add(i);
            } else if(arr[i]>0){
                list.add(1, i);
            }
        }
        for(int i=list.get(0);i<=list.get(1);i++){
            sum+=arr[i];
        }
        System.out.println("The sum is: "+sum);

        String str1 = "pawan";
        String str = new String("pawan");


    }
}
