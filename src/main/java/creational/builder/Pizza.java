package creational.builder;

/**
 * ~~~~ Builder design pattern ~~~~
 *
 * Problem:     Complex object will be inconvenient to instantiate just with constructors.
 *              Dividing it to several subclasses will increase complexity of code
 *
 * Solution:    The Builder pattern suggests that you extract the object construction code out of its
 *              own class and move it to separate objects called builders. This allows you to build
 *              complex objects step by step.
 *
 * Pros:        Code is more maintainable if number of fields required to create object is more than 4 or 5
 *              Object Creation code less error-prone as user will know what they are passing because of explicit method call.
 *              Builder pattern increase robustness, as only fully constructed object will be available to client.
 *
 * Cons:        Builder pattern is verbose and requires code duplication as Builder needs to copy all fields from Original or Item class.
 */

public class Pizza {

    private int size;
    private int cheese;
    private int pepperoni;
    private int pineapple;
    private int pepper;
    private int mushrooms;

    public int getSize() {
        return size;
    }

    public int getCheese() {
        return cheese;
    }

    public int getPepperoni() {
        return pepperoni;
    }

    public int getPineapple() {
        return pineapple;
    }

    public int getPepper() {
        return pepper;
    }

    public int getMushrooms() {
        return mushrooms;
    }

    public Pizza(int size, int cheese, int pepperoni, int pineapple, int pepper, int mushrooms) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.pineapple = pineapple;
        this.pepper = pepper;
        this.mushrooms = mushrooms;
    }

    public static class Builder {

        private int size;
        private int cheese;
        private int pepperoni;
        private int pineapple;
        private int pepper;
        private int mushrooms;

        private Builder(){
            this.size = 0;
            this.cheese = 0;
            this.pepperoni = 0;
            this.pineapple = 0;
            this.pepper = 0;
            this.mushrooms = 0;
        }

        public Builder(int size, int cheese) {
            this();
            this.size = size;
            this.cheese = cheese;
        }

        public Builder setPepperoni(int pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public Builder setPineapple(int pineapple) {
            this.pineapple = pineapple;
            return this;
        }

        public Builder setPepper(int pepper) {
            this.pepper = pepper;
            return this;
        }

        public Builder setMushrooms(int mushrooms) {
            this.mushrooms = mushrooms;
            return this;
        }

        public Pizza build() {
            return new Pizza(
                    size,
                    cheese,
                    pepperoni,
                    pineapple,
                    pepper,
                    mushrooms
            );
        }
    }
}
