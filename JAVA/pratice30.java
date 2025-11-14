public class pratice30 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                if(i == j){
                    System.out.print(i + " " + i + " ");
                }
                else{
                    System.out.print("* * "+ " ");
                }
            }
            System.out.println();
        }
    }
    
}
