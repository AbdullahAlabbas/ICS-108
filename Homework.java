import java.util.ArrayList;
import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int numberOFCards =4;
        Card[] cards = new Card[numberOFCards];

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

        System.out.println("All cards: ");
        for(Card unsorted : cards){
            System.out.println(unsorted);}
            System.out.println("---------------------------------");
        Arrays.sort(cards);
        System.out.println("Cards sorted by total amount+fee: ");
        for(Card sorted : cards){
            System.out.println(sorted);}
            System.out.println("---------------------------------");


        int sum = 0;
        for(Card goldenCards : cards){
            if(goldenCards instanceof GoldenCard) sum += goldenCards.totalAmount();}
        System.out.println("Golden cards total " + sum + " $");}}

    abstract class Card implements Comparable<Card> {
        private int cardNumber;
        private ArrayList<Double> transactions = new ArrayList<>();

        Card(int cardNumber){
            this.cardNumber = cardNumber;}


        public int getcardNumber() {
             return cardNumber; }

        public void setcardNumber(int cardNumber) {
            this.cardNumber = cardNumber;}

        public ArrayList<Double> getTransactions() {
            return transactions;}

        public void setTransactions(ArrayList<Double> transactions) {
            this.transactions = transactions;}

        @Override
        public String toString() {return String.format("Card no:  %d  %nTotal Amount: %.2f", cardNumber , totalAmount());}
        public abstract double totalAmount();

        public void purchase(double amount){this.transactions.add(amount);}

        @Override
        public boolean equals(Object that) {
            if( that instanceof Card){
                Card obj = (Card) that;
                return (this.cardNumber == obj.cardNumber);}
            else return false;}

        @Override
        public int compareTo(Card o) {
            if(this.totalAmount() > o.totalAmount()) return 1;
            else if (this.totalAmount() == o.totalAmount()) return 0;
            else return -1;}}

    class SilverCard extends Card {
        private double transactionFee;
    
        SilverCard(int cardNumber, double transactionFee){
            super(cardNumber);
            this.transactionFee = transactionFee;
        }
    
        @Override
        public void purchase(double amount) {
            super.purchase(amount);
            super.getTransactions().add(amount * transactionFee);}

        @Override
        public double totalAmount() {
            double sum = 0;
    
            for (double i : super.getTransactions()){
                sum += i;}
            return sum;
        }}
    
    class GoldenCard extends Card{
        private int fee;
    
        public GoldenCard(int cardNumber, int fee) {
            super(cardNumber);
            this.fee = fee;}
    
        @Override
        public double totalAmount() {
            double sum = 0.0;
            for (double i : super.getTransactions()) sum += i;
            return sum + fee;}}
    