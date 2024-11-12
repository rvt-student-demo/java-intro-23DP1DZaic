package lv.rvt;

public class PaymentCard {
    private double balance;


    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }


    public String toString() {
            return "The card has a balance of " + this.balance + " euros.";

    }


    public void eatAffordably() {
        if (balance < 2.60 ) {
            this.balance = balance - 0; }
        else {this.balance = balance - 2.60;}
    }
    
    public void eatHeartily() {
    if (balance < 4.60 ) {
        this.balance = balance - 0; }
    else {this.balance = balance - 4.60;}
    }

}