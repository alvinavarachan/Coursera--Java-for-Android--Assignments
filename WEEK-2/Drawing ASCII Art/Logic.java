package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

        // TODO -- add your code here
        int line=1;
        if (size>=1)
        {
            //Straight line PRINT
            straightLine(size);

            if(size==1) {
                mOut.print("|");
                mOut.print("<>");
                mOut.println("|");
            }
            else {

                //UPPER PRINT
                line=upperPrint(size,line);

                //CENTER PRINTING
                line=centerPrint(size,line);

                //LOWER PRINT
                line=lowerPrint(size,line);

            }
            //Straight line PRINT
            straightLine(size);
        }


    }

    private void straightLine(int size) {
        int length=2*size+2;
        for (int i=1; i<= length;i++) {
            if(i==1 || i==length) {
                mOut.print("+");
            }
            else {
                mOut.print("-");
            }
        }
        mOut.println("");
    }

    private  int upperPrint(int size, int line) {
        // TODO Auto-generated method stub

        int space= size-1;
        for (int j = 1; j <= size-1; j++)
        {
            mOut.print("|");
            for (int i = 1; i <= space; i++)
            {
                mOut.print(" ");
            }
            space--;
            mOut.print("/");
            for (int i = 1; i <= 2 * j-2 ; i++)
            {
                if(line%2==0) {
                    mOut.print("-");
                }
                else {
                    mOut.print("=");
                }
            }

            mOut.print("\\");
            for (int i = 1; i <= space+1; i++)
            {
                mOut.print(" ");
            }

            mOut.println("|");
            line++;
        }
        return line;
    }

    private  int centerPrint(int size, int line) {
        // TODO Auto-generated method stub
        mOut.print("|");
        mOut.print("<");
        for(int i=1; i<= 2*size-2; i++) {

            if(line%2==0) {
                mOut.print("-");
            }
            else {
                mOut.print("=");
            }
        }
        line++;
        mOut.print(">");
        mOut.println("|");
        return line;
    }

    private int lowerPrint(int size, int line) {
        // TODO Auto-generated method stub
        int  space = 1;
        for (int j = 1; j <= size- 1; j++)
        {
            mOut.print("|");
            for (int i = 1; i <= space; i++)
            {
                mOut.print(" ");
            }
            space++;
            mOut.print("\\");
            for (int i = 1; i <= 2 * (size - j)-2 ; i++)
            {
                if(line%2==0) {
                    mOut.print("-");
                }
                else {
                    mOut.print("=");
                }
            }
            line++;
            mOut.print("/");

            for (int i = 1; i <= space-1; i++)
            {
                mOut.print(" ");
            }
            mOut.println("|");
        }
        return line;
    }
}
