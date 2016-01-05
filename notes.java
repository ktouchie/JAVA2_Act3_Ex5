import java.util.*;
class notes {
    
    public static void main(String[] args) {
        
        int[][] notes = new int{{19,18,12,7,16},{3,7,5,9,1},{20,16,14,20,11},{10,9,8,7,6},{14,12,3,19,5},{1,2,3,0,4}};
        
    }
    
    public static double percentage_pass(int[][] a) {
        int total = notes.length;
        int pass = 0;
        int sum = 0;
        
        for (int i=0; i<total; i++) {
            for (int j=0; i<notes[i].length; j++) {
                sum += notes[i][j];
            }
            if (((double)sum/(notes[i].length))>10) {
                pass++;
            }
            sum=0;
        }
        
        return (((double)pass)/total);
    }
    
}