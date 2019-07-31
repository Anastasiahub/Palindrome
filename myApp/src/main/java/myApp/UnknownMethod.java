package myApp;

public class UnknownMethod {
    private Number num;
    private String number;

    UnknownMethod(Number num)
    {
        this.number = num.getNumber();
    }

    public String getlongestPalindrome()
    {
        String buffer="";
        int count=0;
        for (int i=0; i<number.length(); i++)
        {
            for(int j=0; j<number.length(); j++)
            {
                if(number.charAt(i)!=number.charAt(j))
                {
                    count++;
                }
            }
            if(count!=(number.length()-1))
            {
                buffer+=number.charAt(i);
            }
        }
        return buffer;
    }


}
