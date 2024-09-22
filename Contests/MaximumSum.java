// You are given an array err of integers, where n is the Length of the array. Your task is to find the maximum coin of two distinct numbers from the array such that fore given bit position x, the x-th bit of one number is set (i.e., equals 1), and the x-th bit of the other number is unset (i.e., equals 0). 
// If no such pair of distinct numbers exists, where one has the x-th bit set and the other has the x-th bit unset, return -1.

class Solution {
    public static long maxSum(int n, int x, int[] arr) {
        // code here
        long a=-1, b=-1;
        
        for(long num: arr){
            if((num & (1L<<(x-1))) !=0 && num>a){
                a=num;
            }else if((num & (1L<<(x-1))) ==0 && num>b){
                b=num;
            }
        }
        
        if(a==-1 || b==-1){
            return -1;
        }
        
        return a+b;
    }
}