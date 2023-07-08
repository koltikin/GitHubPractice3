package practice1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(add3Int(3,4,5)+add4Int(4,7,8,6));
        System.out.println(add4Int(5,8,9,7));
        System.out.println(add3Int(3,8,9));
    }

    public static int add3Int(int a, int b, int c){
        return a+b+c;
    }

    public static int add4Int(int a,int b,int c,int d){
        return a+b+c+d;
    }
}
