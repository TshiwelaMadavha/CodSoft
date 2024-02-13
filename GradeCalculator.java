import java.util.Scanner;
public class GradeCalculator {


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String moreSubjects;
        int numSubjects=0,totalMarks=0,marks;
        char grade;
        double averagePerc;
        
         System.out.println("Enter the number of subject you have: ");
         numSubjects =kb.nextInt();
         
         for(int i=1;i<=numSubjects;i++){
              System.out.print("Enter the marks you obtained in each subject: "+ i +":");
              marks =kb.nextInt();
              totalMarks += marks;
         }
         averagePerc =totalMarks/numSubjects;
          if(averagePerc >= 90){
            grade= 'A';
        }
        else if(averagePerc >=80){
            grade= 'B';
        }
        else if(averagePerc >=70){
            grade='C';
        }
        else if(averagePerc >=60){
            grade ='D';}
        else{
            grade = 'F';}
          System.out.println("Total Marks: " + totalMarks);
          System.out.println("Average Percentage: " + averagePerc + "%");
          System.out.println("Grade: "+ grade);
            
    }
          
    
}
