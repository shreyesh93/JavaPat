package JavaPat;
import java.util.Scanner;

public class Funct {

    //1. using function to print average of 3 numbers
    
    // int A,B,C;
    // public void j(int A,int B,int C){
    //     int k = A + B + C;
    //     System.out.println(k/3);
    // }
    // public static void main(String[] args) {
    //     Funct jo = new Funct();
    //     jo.j(1,2,3);  }

    //2. function to print sum of all odd numbers from 1 to n
    int k = 0;
    public void summ(int n){
    for(int i=0;i<=n;i++){
        if(i%2 != 0){
            k += i;
        }}
        System.out.println("sum of odd number till"+" "+n+" "+ "is" +" "+k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number till which u have to print sum of odd number:");
        int n = sc.nextInt();
        Funct f = new Funct();
        f.summ(n);    
    }

    }
