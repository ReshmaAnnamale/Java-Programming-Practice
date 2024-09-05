class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int div=0;
        if(dividend== -2147483648  &&  divisor==-1)
        {
            div=2147483647;
            
        }
        else if(divisor!=0)
        {
         div= dividend/divisor;
         
        }
        return div;
        
    }
}