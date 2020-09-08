package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO -- start your code here

    private int argOne = 0;
    private int argTwo = 0;
    private int mult = 0;

    public Multiply(int argumentOne, int argumentTwo) {
        argOne = argumentOne;
        argTwo = argumentTwo;

    }

    public String toString(){
        mult = argOne * argTwo;
        return String.valueOf(mult);
    }
}
