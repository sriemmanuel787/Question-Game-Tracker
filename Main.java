import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) throws FileNotFoundException{
        // initialize point values for regions
        int reg1Pts = 0;
        int reg2Pts = 0;
        int reg3Pts = 0;
        int reg4Pts = 0;
        int regCPts = 0;

        // load in quesion bank
        // correct answer must be immediately after question
        File questionList = new File("questions.csv");
        Scanner init = new Scanner(questionList);
        ArrayList<String[]> questionBank = new ArrayList<String[]>();
        while (init.hasNext()) {
            questionBank.add(init.next().split(","));
        }
    }
}