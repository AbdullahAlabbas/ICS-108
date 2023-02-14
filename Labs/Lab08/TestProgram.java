package Labs.Lab08;

class TestProgram {     
  
    public static void main(String[] args) {      

        String question = "Variables that are shared by every instance of a class are:";
        String[] choices = {"\n  a. public variables\n", "b. private variables\n", "c. instance variables\n", "d. class variables"};      

        MCQuestion firstQuestion = new MCQuestion(question, choices, 'd');      

        System.out.println(firstQuestion);     

    }  
}