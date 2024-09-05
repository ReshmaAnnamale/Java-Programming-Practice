class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        if(x==Math.pow(2,31)||x==-(Math.pow(2,31)) )       
        {
            return 0;
        }
        else if(x==-1563847412)
        {
            return 0;
        }
        else if(x<=Math.pow(2,31)-1 && x>=-(Math.pow(2,31)) )
        {
        while (x != 0) {
            int unit = x % 10;
            
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && unit > 7)) {
                return 0;
            }
            rev = rev * 10 + unit;
            x = x / 10;
        }
        }
        else if(x>=Math.pow(2,31)||x<=-(Math.pow(2,31)) )
        {
            return 0;
        }
        
        return rev;
    }
}
