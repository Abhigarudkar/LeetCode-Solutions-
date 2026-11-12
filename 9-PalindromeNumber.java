class Solution {
    public boolean isPalindrome(int x) 
    {
        int iDigit = 0;
        int revers =0;

        if(x <0)
        {
            return false;
        }

        int temp = x;

        while( temp != 0)
        {
            iDigit = temp % 10;

            revers = iDigit + (revers * 10);

            temp = temp / 10;
        }
        return x == revers;
    }
} 
