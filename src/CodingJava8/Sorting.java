package Coding2AdvancedJava;

public class Sorting {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] arr = {4,5,6,7,1,9};
        for(int i=0; i<arr.length;i++){
            System.out.println("Value of i = "+i);
            for(int j=0;j<arr.length-i;j++){
                System.out.println("j = "+j);
                if(arr[i]>arr[j]){
                    int temp =arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        print(arr);

    }

    private static void print(int[] arr) {
        for(int i:arr){
            System.out.println(arr[i]);
        }
    }
}
