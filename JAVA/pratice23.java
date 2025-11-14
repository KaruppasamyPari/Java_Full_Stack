public class pratice23 {
    public static void main(String args[]){
     
        int term = 1;     
        int diff = 3;     
        int add = 3;      

        System.out.print(term + " ");

        for (int i = 2; i <= 7; i++) {
            term = term + diff;     
            System.out.print(term + " ");
            diff = diff + add;      
            add++;                 
        }
    }
}

