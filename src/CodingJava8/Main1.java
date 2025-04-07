package CodingJava8;

public class Main1 {
    public static void main(String[] args) {
        switchBlock(57);
    }

    public static void switchBlock(int num){
        if(num ==55){
            return;
        } else {
            System.out.println("not 55");
        }

    }

    public void test(){
        switchBlock(55);
        System.out.println("test");
    }

}

class Outer{

}