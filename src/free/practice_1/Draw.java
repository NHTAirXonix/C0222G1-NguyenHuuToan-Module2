package free.practice_1;

public class Draw {
    public static void main(String[] args) {
        for (int i =0; i<=5; i++){
            for (int j = 5; j >0;j--){
                if (j ==i){
                    System.out.print(j);
                }
                System.out.print(" ");
            }
            for (int k = 1; k < 6;k++){
                System.out.print(" ");
                if (k ==i){
                    System.out.print(k);
                }
            }
            System.out.println();
        }
        for (int i =4; i>=1; i--){
            for (int j = 5; j >0;j--){
                if (j ==i){
                    System.out.print(j);
                }
                System.out.print(" ");
            }
            for (int k = 1; k < 6;k++){
                System.out.print(" ");
                if (k ==i){
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}
