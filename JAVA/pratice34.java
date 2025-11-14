class student{
    public void mark(){
        int mark = 90;

        if(mark>=90){
            System.out.println("A++");

        }else if(mark>=70){
            System.out.println("B++");
        }else if(mark>=50){
            System.out.println("C++");
        }else{
            System.out.println("Fail");
        }
    }
}


public class pratice34 {
    public static void main(String[] args) {
        student s1= new student();
        s1.mark();       
    }
    
}
