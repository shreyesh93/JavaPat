package JavaPat;
/**
 * ADPattern
 */
public class ADPattern {

    public static void main(String[] args) {
        // int n = 4;
        // for(int i = 0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j = 5;j<=5;j++){
                
        //         System.out.print("p");
                
                
        //     }
        //     System.out.print("\n");
        // }
    
        int n = 4;
        int k = 8;
        int kut = 2;
        for(int i = 1;i<n+1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        if(i<n){
        for(int j=2;j<k;j++){
            System.out.print(" ");
        }
    k-=2;}
           

    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    
        System.out.println();
    
    
    }
    
    for(int i = 1;i<5;i++){
            for(int j=5;j>=i+1;j--){
                System.out.print("*");
            }
            if(i>=1 && i<5){
                    for(int j=2;j<kut;j++){
                        System.out.print(" ");
                    }
                kut +=2;}
                for(int j=5;j>=i+1;j--){
                    System.out.print("*");
                }
            
            System.out.println();
            
        }

    

}}