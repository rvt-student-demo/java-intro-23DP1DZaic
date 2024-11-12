package lv.rvt;

public class Person {
    private String name;
    private int age;
    private String group;
    private int weight;
    private int height;

    public Person(String initialName) {
        this.age = 10;
        this.weight = 0;
        this.height = 0;
        this.name = initialName;
    }


    // OBSOLETE
    // public void printPerson() {
    //     System.out.println(this.name + ", age " + this.age + " years");
    // }

    // growOlder() method has been added
    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
    }

    public int returnAge() {
        return this.age;
    }


    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }


public String getName() {
    return this.name;
}


//  Getter method

    public String getGroup() {
        return this.
        group;
    }

// Setter method
    public void setGroup() {
        this.group = group;
    }



// important
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }



}
