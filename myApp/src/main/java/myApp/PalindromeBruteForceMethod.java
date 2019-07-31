package myApp;

public class PalindromeBruteForceMethod {
    private Number num;
    private String number;

    PalindromeBruteForceMethod(Number num)
    {
        this.number = num.getNumber();
    }

    public boolean isPalindrome(String number)
    {
        for (int i=0; i<number.length()/2; i++)
        {
            if(number.charAt(i)!=number.charAt(number.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }

    public String getLongestPalindrome()
    {
        String longestPalindrome = "";
        int maxLength=0;
        for (int i=0; i<number.length(); i++)
        {
            for(int j=i; j<number.length(); j++)
            {
                if(isPalindrome(number.substring(i, j+1)))
                {
                    if(j+1-i>maxLength)
                    {
                        maxLength = j+1-i;
                        longestPalindrome = number.substring(i, j+1);
                    }
                }
            }
        }
        return longestPalindrome;
    }

}
