// public class MCQuestion extends Question {
//     private String[] choices;

//     public MCQuestion(String text, String[] choices) {
//         super(text);
//         this.choices = choices;
//     }

//     @Override
//     public String toString() {
//         String question = super.toString();
//         for (int i = 0; i < choices.length; i++) {
//             question += String.format("\n%d. %s", i + 1, choices[i]);
//         }
//         return question;
//     }
// }