package Homework.Assignment2;
import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    
    public static void main(String[] args) {

    ArrayList<Integer> finalList = new ArrayList<>(Arrays.asList(1, 2,3 ,4 ,5 ,6 ,7,8,9));  // The numbers that the list should contain.
    ArrayList<Integer> randomList = randomListGenerator();  // generating a random list using the randomListGenerator from line 35.
    

    while(!randomList.containsAll(finalList)){ // while the does not contain the wanted numbers.
        int sumOfRandomList = 0;
        int count = 0;
        int sizeOfList = randomList.size();

        while(count != sizeOfList){ // until reaching the final element.
            randomList.set(count, randomList.get(count)-1);  // subtract one.
            sumOfRandomList += randomList.get(count);

            if(randomList.get(count) <= 0) // remove the number if it is zero.
                randomList.remove(count);  
            else
                count++;

            sizeOfList = randomList.size();
        }
        if(sumOfRandomList < 45)
            randomList.add( 45 - sumOfRandomList); // adding the number that has been subtract.
        
        System.out.println(randomList);
    }
}

    public static ArrayList<Integer> randomListGenerator() { 
        // This function is initializing a random list with a sum of 45.
        ArrayList<Integer> randomList = new ArrayList<>();
        int sumOfRandomList = 0;
        while(sumOfRandomList != 45){
            int randomNumber =(int) (1 + Math.random() * 45);
            if( sumOfRandomList + randomNumber <= 45 && randomNumber > 0){
                sumOfRandomList +=randomNumber;
                randomList.add(randomNumber);
            }    
        }
        return randomList;
    }
}

