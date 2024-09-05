class Palindrome {
    public boolean isPalindrome(int x) {
        int rev=0;
        int unit; 
        int orig=x;
        if(x<0)
        {
            return false;
        }

        while(x>0)
	{
	    unit=x%10;				
    	rev= rev*10+unit;		
    	x=x/10;
	}
    
	
        return rev==orig;
    
    
    }
}