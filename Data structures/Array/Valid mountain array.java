/* Valid Mountain array
-----------------------
Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]
---------------------------------------------- */
class Solution {
    public boolean validMountainArray(int[] A) {
        if(A == null || A.length == 0) return false;
        int max = A[0];
        int cnt = 0;
        int f = 0;
        for(int i = 1; i < A.length; i++) {
            if(max == A[i]) {
                return false;
            } 
            if(max < A[i]) {
                f = 1;
                max = A[i];
            } 
            if(max > A[i]) {
                cnt = i - 1;
                break;
            }
        }
        
        int min = A[cnt];
        int e = 0;
        for(int i = cnt+1; i < A.length; i++) {
            if(min == A[i]) {
                return false;
            } 
            if(min > A[i]) {
                e = 1;
                min = A[i];
            }
            if(min < A[i]) return false;
        }
        if(f == 1 && e == 1) {
            return true;
        } else {
            return false;
        }    
    }
}