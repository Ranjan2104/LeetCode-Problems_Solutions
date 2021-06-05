class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int carry = 1;        
        for(int ind=length-1;ind>=0 && carry > 0 ;ind--){
         int sum = digits[ind]+carry;
         digits[ind] = (sum) % 10;
         carry = sum / 10;           
        }
        if(carry > 0){
         int[] newNumber = new int [length+1];
        newNumber[0] = carry;
        return newNumber;           
        }
        return digits;
    }
}
// Contributed by Amresh Ranjan.