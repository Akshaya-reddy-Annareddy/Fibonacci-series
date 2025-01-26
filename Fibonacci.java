import java.util.*;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int i1 = 0, i2 = 1;
        System.out.println("Fibonacci series: ");
        while(i1 <= num){
            System.out.println(i1);
            int sum = i1+i2;
            i1 = i2;
            i2 = sum;
        }
        
    }
}




