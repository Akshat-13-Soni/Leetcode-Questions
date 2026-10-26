class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];  //array for storing ugly numbers
        ugly[0]=1;
        int p2=0, p3=0, p5=0;     
        for(int i=1; i<n; i++){
            int divBy2 = ugly[p2]*2;     //existing ugly number *2
            int divBy3 = ugly[p3]*3;     //existing ugly number *3
            int divBy5 = ugly[p5]*5;     //existing ugly number *5

            int nextSmallest = Math.min(divBy2, Math.min(divBy3, divBy5));  //for increasing order of array elements
            ugly[i]=nextSmallest;

            //once element is used move the pointer forward
            if(nextSmallest == divBy2){
                p2++;
            }

            //instead of else if's, if's are used as 2*3 & 3*2 both yield 6 so used if to avoid twice addition of  6
            if(nextSmallest == divBy3){
                p3++;
            }
            if(nextSmallest == divBy5){
                p5++;
            }
        }
        return ugly[n-1];
    }
}