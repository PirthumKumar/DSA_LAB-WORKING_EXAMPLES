// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//find out the sum of first n natutal number ;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        int number = ask.nextInt();
        int sum =0;
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}