
package staticimports;

//import static java.util.Arrays;         // cant make a class static .
import java.util.List;
import static java.util.Arrays.asList;      //Only a Static member can be imported.
import static java.lang.Math.*;
 import static java.lang.System.out;
import static java.lang.Math.PI;
import static java.lang.Math.cos;

public class StaticImports {

    private static double theta;

    public static void main(String[] args) {
       List<String> list=asList("one","two","three");       //no Arrays..Because we have added Static imports.
       System.out.println(list);
       
       //Arrays.asList("one");      Giving Error because Arrays import is missing ./
       
        int a=(int) sqrt(2);     //Dont need to write Math everytime
        double b=tan(33);
      

        double r = cos(PI * theta);         //added Static Imports.
        out.println("Blah blah blah");
    }
    
}
