package Labs.Lab04;
public class StudentScore {

    public static void main(String[] args) {
        
        int[][] QsAns = { {0,0,0,1}, {0,0,1,0} , {1,0,0,0} , {1,0,0,0} };
        int[][] StAns = { {4,3,1,1}, {1,3,2,1} , {1,1,3,3} , {2,4,3,1} }; 
        int studentScore = 0;
        double sectionAvg = 0.0;

        for(int i =0; i < QsAns.length; i++){
            studentScore = 0;
            for(int j = 0; j < QsAns[i].length; j++){
                int newIdx = StAns[i][j]-1 ;
                if((QsAns[j][newIdx] == 1))
                studentScore +=1;
            }
            System.out.println("Student score: " + studentScore);
            sectionAvg += studentScore;
        }
        System.out.println("Section Average: " + (sectionAvg / StAns.length));
    }
}
