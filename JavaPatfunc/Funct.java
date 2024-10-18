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

    // int k = 0;
    // public void summ(int n){
    // for(int i=0;i<=n;i++){
    //     if(i%2 != 0){
    //         k += i;
    //     }}
    //     System.out.println("sum of odd number till"+" "+n+" "+ "is" +" "+k);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a number till which u have to print sum of odd number:");
    //     int n = sc.nextInt();
    //     Funct f = new Funct();
    //     f.summ(n);    
    // }


    //3. Number of 0's, +v'es and -v'es present in user input

    // int l,o,p = 0;
    // Scanner sc = new Scanner(System.in);
    // public void ff(){
        
    //     System.out.println("Enter how many numbers:");
    //     int a = sc.nextInt();
    //     int [] arr= new int[a];
    //     for(int i = 0;i<a;i++){
    //         System.out.println("Enter number" +" "+ i + " "+":");
    //         int n = sc.nextInt();
    //         arr[i] = n;
    //     }
    //     System.out.println();
    //     System.out.println("elements in array are:");
    //     for(int kk:arr){
    //         System.out.print(kk);
    //         System.out.print(" ");
    //     }
    //     for(int b:arr){
    //         if(b==0){
    //             l++;
    //         }
    //         else if(b>0){
    //             o++;
    //         }
    //         else{
    //             p++;
    //         }
    //     }
    //     System.out.println("\nNumber of zeros are"+" "+l+ "\n"+ "Number of positive are"+" "+o+ "\n"+"Number of zeros are"+" "+p); 
    // }
    // public static void main(String[] args) {
    //     Funct f = new Funct();
    //     f.ff();
    //     }


    //4. To print power of a number

    // public int ff(int a , int b){
    //     int result =1;
    //     for(int i  =0;i<b;i++){
    //         result *= a;
    //     }
    //     return result;
    // }
    // public static void main(String[] args) {
    //     Funct f = new Funct();
    //     System.out.println(f.ff(4, 2));
    //     // f.ff();
    //     }


Scanner sc = new Scanner(System.in);
    public void ff(){
        int a = 0;
        int b = 1;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no:");
        int n = sc.nextInt();
        System.out.print(a + " "+b+ " ");
        
        for(int i =0;i<n-2;i++){
            c = a + b;
            System.out.print(c);
            System.out.print(" ");
            a = b;
            b =c;
            c= 0;
        }
    }
     public static void main(String[] args) {
        Funct f = new Funct();
        f.ff();
        }
   
    }

    
