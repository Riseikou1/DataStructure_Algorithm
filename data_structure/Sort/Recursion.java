package Sort;
public class Recursion {
    //  recursion  =   When a thing is defined in terms of itself.Apply the result of a prodecure,
    //                 to a prodecure.A recursive method calls itself.Can be a substitute for iteration.
    //                 Divide a problem into sub-problems of the same type as the original.
    //                 Commonly used with advanced sorting algorithms and navigating trees.
    //
    //                 Advantages : easier to read/write , easier to debug.
    //                 Disadvantages : sometimes slower, uses more memory.
    public static void main(String[] args) {
        System.out.println("factorial of 7 : "+factorial(7));
        System.out.println("2 power to the 8 : "+power(2,8));
    }
    public static int factorial(int number){
        if(number==0 || number ==1) return 1; // base case
        else return (number)*factorial(number-1);  // recursion case
    }
    public static int power(int base,int exponent){
        if (exponent <1 ) return 1;
        else return base*power(base,exponent-1);
    }
}
