package myApp;

public class OutputPalindrome {
    private String number;
    private Number num;
    private PalindromeBruteForceMethod palindromeBruteForceMethod;
    private UnknownMethod unknownMethod;

    OutputPalindrome(Number num)
    {
        this.palindromeBruteForceMethod = new PalindromeBruteForceMethod(num);
        this.unknownMethod = new UnknownMethod(num);
    }

    public void printPalindrome()
    {
        System.out.println("First method: " + palindromeBruteForceMethod.getLongestPalindrome());
        System.out.println("Second method: " +  unknownMethod.getlongestPalindrome());
    }
}
