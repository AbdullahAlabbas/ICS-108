package Labs.Lab08;

import java.util.Arrays;

class MCQuestion extends Question{
    String[] choices = new String[4];
    char answer;

    MCQuestion(String text, String[] choices , char answer){
        super(text);
        this.choices = choices; 
        this.answer = answer;
    }

    @Override
    public String toString(){
        return super.toString() + "\nChoices: " + Arrays.toString(choices) + "\nAnswer: " + answer;  
       }
}