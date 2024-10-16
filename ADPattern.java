package JavaPat;
/**
 * ADPattern
 */
public class ADPattern {

    public static void main(String[] args) {

        // ADQ1

        // int n = 4;
        // int k = 8;
        // int kut = 2;
        // for(int i = 1;i<n+1;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     if(i<n){
        //         for(int j=2;j<k;j++){
        //             System.out.print(" ");
        //     }
        //             k -=2;}
           

        // for(int j=1;j<=i;j++){
        //     System.out.print("*");
        // }
        
        //     System.out.println();
    
    
        // }
    
        // for(int i = 1;i<5;i++){

        //     for(int j=5;j>=i+1;j--){
        //         System.out.print("*");
        //     }
        //     if(i>=1 && i<5){
        //             for(int j=2;j<kut;j++){
        //                 System.out.print(" ");
        //             }
        //         kut +=2;}
        //         for(int j=5;j>=i+1;j--){
        //             System.out.print("*");
        //         }
            
        //     System.out.println();
            
        // }

        //ADQ2
        // int n = 4;
        // for(int i = 1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
            
        //     for(int j =1;j<=i;j++){
        //         System.out.print(i);
            
        // }
        //        System.out.println();
// }

        int n = 4;
        for(int i = 1;i<=n;i++){
            if(i>=1 && i <=n ){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            if(i>1){
            for(int j=1;j<=i;j++){
                System.out.print(j);}}
            
                    System.out.print("1");
                    System.out.println();}
        }
        int k =4;
        for(int i = 1;i<=k;i++){ 
            
            for(int j=1;j<=i;j++){
                        System.out.print(" ");
                    }
            for(int j=1;j<=k-i;j++){
                    System.out.print(j);}
            if(i>=1 && i<3 ){
                System.out.print("1");
            
            }
            System.out.println();
            
            }
            
            
        }}