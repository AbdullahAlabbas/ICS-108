package Homework.Assignment3;
import java.util.ArrayList;
import java.util.Arrays;

public class Assignment03 {
    public static void main(String[] args) {
        int numberOFCards =4;
        // creates an array of type Card
        Card[] cards = new Card[numberOFCards];

        // Fill the array with objects from various subclasses. Do some transactions with all cards, call the method purchase with random amounts.

        cards[0] = new SilverCard(2001,0.15);

        cards[0].purchase(500);
        cards[0].purchase(100);

        cards[1] = new GoldenCard(2002,50);
        cards[1].purchase(150);

        cards[2] = new GoldenCard(2003,70);
        cards[2].purchase(100);
        cards[2].purchase(300);


        cards[3] = new SilverCard(2004,0.20);
        cards[3].purchase(200);
        cards[3].purchase(100);


// line 30 to 39 is to generate random numbers if u want to test it u can delete lines 9 to 26 and uncomment line 30 to 39
// int numberOFCards = 10; // It can be of your own choice.
// Card[] cards = new Card[numberOFCards];
// for (int i =0 ; i < cards.length ; i ++){
//     int choice = (int) (Math.random()*2);
//  if ( choice % 2 ==0 )
// cards[i] =new SilverCard(1000 + (int) (Math.random()*9000), 0.15);
//  else cards[i] = new GoldenCard(1000+(int) (Math.random()*9000), 150);  
//     int transactions = (int) (Math.random()*5);
//     for (int j = 0 ; j < transactions ; j++)
//         cards[i].purchase(100);  // (int) (Math.random()*1000);  // 100 just an example for testing purposes}

        System.out.println("All cards: ");
        for(Card unsorted : cards){
            System.out.println(unsorted);
            System.out.println("---");}

        // Sort the array using Arrays.sort method based on the total amount then print it.

        Arrays.sort(cards);

        System.out.println("Cards sorted by total amount+fee: ");
        for(Card sorted : cards){
            System.out.println(sorted);
            System.out.println("---");}


        // find the total amount of all GoldenCard objects in the array.
        int totalGold = 0;
        for(Card gCard : cards){
            if(gCard instanceof GoldenCard) totalGold += gCard.totalAmount();}
        System.out.println("Golden cards total " + totalGold + " $");}}

    abstract class Card implements Comparable<Card> {
        //  two instance variables card no. (int) and transactions (ArrayList of doubles)
        private int cardNo;
        private ArrayList<Double> transactions = new ArrayList<>();

        //one constructor, with one argument, card no, that creates a card object.
        Card(int cardNo){this.cardNo = cardNo;}


        //Include getters/ setters for all variables. 
        public int getCardNo() { return cardNo; }

        public void setCardNo(int cardNo) {this.cardNo = cardNo;}

        public ArrayList<Double> getTransactions() {return transactions;}

        public void setTransactions(ArrayList<Double> transactions) {this.transactions = transactions;}

        // override the toString method to return card no and the total amount, including the fees, that must be paid by the card owner. 
        @Override
        public String toString() {return String.format("Card no:  %d  %nTotal Amount: %.2f", cardNo , totalAmount());}
        public abstract double totalAmount();

        // Include the method purchase(double amount) that adds a new transaction to the transactions lists. 
        public void purchase(double amount){this.transactions.add(amount);}

        // Override the equals method. Two cards are equal if they have the same card no. 
        @Override
        public boolean equals(Object that) {
            if( that instanceof Card){
                Card obj = (Card) that;
                return (this.cardNo == obj.cardNo);}
            else return false;}

            //the comparison is based on the total amount, including the fees, that must be paid by the card owner.
        @Override
        public int compareTo(Card that) {
            if(this.totalAmount() > that.totalAmount()) return 1;
            else if (this.totalAmount() == that.totalAmount()) return 0;
            else return -1;}}

    class SilverCard extends Card {
        // one instance variable transactionFee (double).
        private double transactionFee;
    
        //Include one constructor with all the arguments. 
        SilverCard(int cardNo, double transactionFee){
            super(cardNo);
            this.transactionFee = transactionFee;
        }
    
        // Override the purchase method to also compute the fee and append it as a new transaction to the transactions list.
        @Override
        public void purchase(double amount) {
            super.purchase(amount);
            super.getTransactions().add(amount * transactionFee);}

        @Override
        public double totalAmount() {
            double totalWithFees = 0;
    
            for (double i : super.getTransactions()){
                totalWithFees += i;}
            return totalWithFees;
        }}
    
    class GoldenCard extends Card{
        // one instance variable monthlyFee (int). 
        private int monthlyFee;
    
        // one constructor with all the arguments. 
        public GoldenCard(int cardNo, int monthlyFee) {
            super(cardNo);
            this.monthlyFee = monthlyFee;}
    
        @Override
        public double totalAmount() {
            double totalWithFees = 0.0;
            for (double i : super.getTransactions()) totalWithFees += i;
            return totalWithFees + monthlyFee;}}
    