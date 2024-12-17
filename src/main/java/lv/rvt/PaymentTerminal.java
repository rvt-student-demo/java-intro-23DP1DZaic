package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        money = 1000;
    }



    public double eatAffordably(double payment) {
        if (money < 2.60 ) {
            this.money = money- 0; 
            return money; }
            // ?
        else {this.money = money - 2.60;}
        affordableMeals = affordableMeals + 1;
        return money;
    }





    public double eatHeartily(double payment) {
        if (money < 4.30) {
            this.money = money- 0; 
            return money; }
        else {this.money = money - 2.60;}
        heartyMeals = heartyMeals+ 1;
        return money;
    }



    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}









