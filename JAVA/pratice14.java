public class pratice14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a mark: ");
        int mark = sc.nextInt();

        if(mark >= 35)
        { 
            if(mark >= 90)
            {
                System.out.println("A+ Grade");
            }
            else if(mark >= 80)
            {
                System.out.println("A Grade");
            }
            else if(mark >= 70)
            {
                System.out.println("B+ Grade");
            }
            else if(mark >= 60)
            {
                System.out.println("B Grade");
            }
            else if(mark >= 50)
            {
                System.out.println("C Grade");
            }
            else
            {
                System.out.println("D Grade");
            }

        }
        else
        {
            System.out.println("Fail");
        }
        
    }
    
}
