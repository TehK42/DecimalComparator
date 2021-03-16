public class DecimalComparator {
    //Method that Compares if the given values are equal to three decimal places
    public static boolean areEqualByThreeDecimalPlaces(double var1, double var2) {
        //Prints out the first value
        //Casts the first value into an integer and multiplies it by 1000
        System.out.println(var1);
        var1 = (int) (var1 * 1000);
        //Prints out the final value
        System.out.println(var1);
        //Prints out the second value
        //Casts the second value into an integer and multiplies it by 1000
        System.out.println(var2);
        var2 = (int) (var2 * 1000);
        //Prints out the final value
        System.out.println(var2);
        //Returns the value of var1 and var2 after checking if they are equal
        return var1 == var2;
    }
}
