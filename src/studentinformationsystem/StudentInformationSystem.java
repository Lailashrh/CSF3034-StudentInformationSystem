
package studentinformationsystem;
public class StudentInformationSystem {
    public static void main(String[] args) {
        
        System.out.println("Nor Laila Shahirah");
        System.out.println("Student ID:S85510");
        
        double mark1=42.5;
        double mark2=45.0;
        double totalMark= mark1+ mark2;
        
        System.out.println("Total Mark:"+ totalMark);
        
        if (totalMark >= 80){
            System.out.println("Result Message:Excellent");
        }else if  (totalMark >= 50){
            System.out.println("Result Message:Good");
        }else{
            System.out.println("Result Message:Needs Improvement");
           
            
        }
    }
    
}
