package CodingJava8;

public class PrimeNumber {
    public static void main(String[] args) {
        //1,3,5,7,11
        int sum=0;
        for(int i=0;i<=100;i++){
            if (checkPrime(i)) {
                System.out.print(i+" ");
                sum+=i;
            }
        }
        System.out.println("The sum is "+sum);

    }

    private static boolean checkPrime(int i){
        int count=0;
        for(int j=1;j<100;j++){
            if(i%j==0){
                count++;
            }
        }
        return count==2?true:false;
    }
}
