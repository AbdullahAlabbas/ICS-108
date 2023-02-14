package Labs.Lab08;
import java.util.Arrays;

public class Question {
    private String text;

    Question(String text){
        this.text = text;
    }

    @Override
    public String toString(){
        return this.text;
    }
}

// class MCQuestion extends Question{
//     String[] choices = new String[4];
//     char answer;

//     MCQuestion(String text, String[] choices , char answer){
//         super(text);
//         this.choices = choices; 
//         this.answer = answer;
//     }

//     @Override
//     public String toString(){
//         return super.toString() + "\nChoices: " + Arrays.toString(choices) + "\nAnswer: " + answer;  
//        }
// }

// class TestProgram {     
  
//     public static void main(String[] args) {      

//         String question = "Variables that are shared by every instance of a class are:";
//         String[] choices = {"\n  a. public variables\n", "b. private variables\n", "c. instance variables\n", "d. class variables"};      

//         MCQuestion firstQuestion = new MCQuestion(question, choices, 'd');      

//         System.out.println(firstQuestion);     

//     }  
// }