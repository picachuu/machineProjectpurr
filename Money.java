public class Money {
    private int one, five, ten; //coins
    private int twenty, fifty, oneHundred, fiveHundred; //bills

    public Money(){
        one = 5;
        five = 5;
        ten = 5;
        twenty = 5;
        fifty = 5;
        oneHundred = 5;
        fiveHundred = 5;
    }

    public int getOne() {
        return one;
    }

    public void addOne(int add) {
        this.one += add;
    }

    public int getFive() {
        return five;
    }

    public void addFive(int add) {
        this.five += add;
    }

    public int getTen() {
        return ten;
    }

    public void addTen(int add) {
        this.ten += add;
    }

    public int getTwenty() {
        return twenty;
    }

    public void addTwenty(int add) {
        this.twenty += add;
    }

    public int getFifty() {
        return fifty;
    }

    public void addFifty(int add) {
        this.fifty += add;
    }

    public int getOneHundred() {
        return oneHundred;
    }

    public void addOneHundred(int add) {
        this.oneHundred += add;
    }

    public int getFiveHundred() {
        return fiveHundred;
    }

    public void addFiveHundred(int add) {
        this.fiveHundred += add;
    }

    public void subtract(double sub) {
        int amt = (int)sub;
        this.fiveHundred -= amt / 500;
        this.oneHundred -= amt % 500 / 100;
        this.fifty -= amt % 500 % 100 / 50;
        this.twenty -= amt % 500 % 100 % 50 / 20;
        this.ten -= amt % 500 % 100 % 50 % 20 / 10;
        this.five -= amt % 500 % 100 % 50 % 20 % 10 / 5;
        this.one -= amt % 500 % 100 % 50 % 20 % 10 % 5;
    }
/*
    public double getTotalBalance() {
        return 1 * one + 5 * five + 10 * ten + 20 * twenty + 50 * fifty + 100 * oneHundred + 500 *fiveHundred;
    }
    */
}
