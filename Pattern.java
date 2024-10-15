package JavaPat;

public class Pattern {

    public static void main(String[] args) {
        //pattern 1
        // for(int i=0;i<5;i++){
        //     for(int j =0;j<5;j++){
        //         System.out.print("*");
        //     }
        // System.out.print("\n");}

        // pattern 2
        for(int i=0;i<5;i++){
            for(int j =0;j<5;j++){
                if(i>0 && i<4 && j>0 && j<4 ){
                    System.out.print(" ");

                }
                else{
                System.out.print("*");}
            }
            System.out.print("\n");
        }




        }
    }
