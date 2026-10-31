
package studentinformationsystem;
public class StudentInformationSystem { 
    public static void main(String[] args) {
        
        double mark1=20.0;
        double mark2=25.0;
        
        double totalMark = mark1+mark2;
        System.out.println("Total Mark:"+totalMark);
        
        if (totalMark >= 80){
            System.out.println("Result Message: Excellent");
        }else if (totalMark >= 50){
            System.out.println("Result Message: Good");
        }else{
            System.out.println("Result Message: Need Improvement");
        }
        
        
    }
    
}
