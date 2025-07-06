class Solution {
    public boolean isHappy(int n) {
        boolean flag= true;
        int sum=0;
        while(flag)
        {
            while(n!=0)
            {
                int re= n%10;
                sum+= re*re;
                n/=10;
            }
            if(sum==1) return true;
            if(sum%10==sum && sum!=7 ) return false;
            else n=sum;sum=0;
        }
        return true;
    }
}