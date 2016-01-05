import java.util.*;
class notes {
    
    public static void main(String[] args) {
        
        int[][] notes = {{19,18,12,7,16},{3,7,5,9,1},{20,16,14,20,11},{10,9,8,7,6},{14,12,3,19,5},{1,2,3,0,4}};      //Declare array
        
        System.out.println(percentage_pass(notes) + "%");     //Call method
        
    }
    
    public static double percentage_pass(int[][] a) {
        int total = a.length;                           //Total number of students
        int pass = 0;                                   //Number of students with over 50% average
        int sum = 0;                                    //Sum of each student's grades
        
        for (int i=0; i<total; i++) {
            for (int j=0; j<a[i].length; j++) {
                sum += a[i][j];                         //Find sum of each students grades
            }
            if ((((double)sum)/(a[i].length))>10) {     //If students average is over 10 (50% of 20), add 1 to "pass"
                pass++;
            }
            sum=0;                                      //Reset sum to zero for next student
        }
        
        double percentage = (100*(double)pass)/total;
        return percentage;                              //Return percentage of students who passed
    }
    
}