class Solution {
    static int evenlyDivides(int n) {
        // code here
        // if (n%2!=0)
        // {
        //     return 0;
        // }
        int a=n;
        int c=0;
        int p=0;
        while (a>0)
        {
            p=a%10;
            a=a/10;
            if (p==0)
            {
                continue;
            }
            if (n%p==0)
            {
                c++;
            }
        }
        return c;
    }
}