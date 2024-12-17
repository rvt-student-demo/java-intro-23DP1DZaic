package lv.rvt;

public class PaymentCard {
    private double balance;


    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }




    public boolean takeMoney(double amount) {
        if (balance < amount) {
            System.out.println("Your card doesn't have sufficient funds.");
            return false; 
            }
            else {
                balance = balance - amount;
                return true;
            }
    }


















    // public PaymentCard(double openingBalance) {
    //     this.balance = openingBalance;
    // }


    // public String toString() {
    //         return "The card has a balance of " + this.balance + " euros.";

    // }


    // public void eatAffordably() {
    //     if (balance < 2.60 ) {
    //         this.balance = balance - 0; }
    //     else {this.balance = balance - 2.60;}
    // }
    
    // public void eatHeartily() {
    // if (balance < 4.60 ) {
    //     this.balance = balance - 0; }
    // else {this.balance = balance - 4.60;}
    // }



    // public void addMoney(double amount) {
    //     if (amount < 0.0) {
    //         amount = 0;
    //     }
    //     if (this.balance + amount > 150) {
    //         this.balance = 150;
    //     }
    //     else{this.balance = balance + amount;}


    // }
}