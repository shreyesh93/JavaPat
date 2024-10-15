package JavaPat;

public class Pattern {

    public static void main(String[] args) {
        //pattern 1
        // for(int i=0;i<5;i++){
        //     for(int j =0;j<5;j++){
        //         System.out.print("*");
        //     }
        // System.out.print("\n");}

        // Pattern 2
        // for(int i=0;i<5;i++){
        //     for(int j =0;j<5;j++){
        //         if(i>0 && i<4 && j>0 && j<4 ){
        //             System.out.print(" ");

        //         }
        //         else{
        //         System.out.print("*");}
        //     }
        //     System.out.print("\n");
        // }

        // Pattern 3
        // for(int i=0;i<5;i++){
        //     for(int j =0;j<i+1;j++){
        //         System.out.print("*");
                
        //     }
        //     System.out.print("\n");
        // }

        // Pattern 4
        // for(int i=0;i<5;i++){
        //     for(int j=5;j>=i+1;j--){
        //         System.out.print("*");
                
        //     }
        //     System.out.print("\n");
        // }
       
        // Pattern 5
        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
                
        //     System.out.print("\n");}

        //Pattern 6
        for(int i=0;i<5;i++){
            for(int j =0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.print("\n");

        }
        
        //Pattern 7
        // int n = 5;
        // for(int i=0;i<=n;i++){
        //     for(int j =0;j<n-i;j++){
        //         System.out.print(j+1);
        //     }
        //     System.out.print("\n");
            

        // }



        }}
    
