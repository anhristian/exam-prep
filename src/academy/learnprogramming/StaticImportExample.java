package academy.learnprogramming;

import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;
import static academy.learnprogramming.Config.*; //imports all variables and methods from that class

public class StaticImportExample {

    public static void main(String[] args) {
        int min = min(5,7);
        out.println("min= "+min);
        out.println(PI);

        Config.printConfig();

        out.println("name= "+NAME);
        out.println("columnCount= "+MAX_COLUMN_COUNT);
    }
}
