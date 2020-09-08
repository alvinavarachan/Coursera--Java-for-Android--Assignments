package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO -- start your code here
    private int argOne = 0;
    private int argTwo = 0;
    private int subt = 0;

    public Subtract(int argumentOne, int argumentTwo) {
        argOne = argumentOne;
        argTwo = argumentTwo;
    }

    public String toString(){
        subt = argOne - argTwo;
        return String.valueOf(subt);
    }
}
