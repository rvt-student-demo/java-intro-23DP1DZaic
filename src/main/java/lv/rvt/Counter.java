package lv.rvt;

public class Counter {
    private int value;   // a variable that remembers the value of the counter

    public Counter(int startValue) {
        this.value = startValue;
    }



    public void printValue() {
        System.out.println("value: " + this.value);
    } 




    public void decrement() {
    while (value < 1);
    value = value - 1;
    }




    
    public void Counter(){
        value = 0;
    }
    


    public int value() {
        return this.value;
    }



    public void increase() {
        this.value = value;
        value = value + 1;
    }


    public void decrease() {
        this.value = value;
        value = value - 1;
    }




}
