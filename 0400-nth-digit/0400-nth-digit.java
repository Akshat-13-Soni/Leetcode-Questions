class Solution {
    public int findNthDigit(int n) {
        long digits = 1;      // how many digits are in the current block
        long count = 9;       // how many numbers are in the current block
        long start = 1;       // first number in the current block
        long N = n;           //long N because number can be very big

        //figuring out which block N falls into
        while (N > digits * count) {
            N -= digits * count;   // subtract this chunk's total digit count
            digits++;
            count *= 10;
            start *= 10;
        }

        //figuring out which number within that block
        start += (N - 1) / digits;
        String s = Long.toString(start);

        // Step 3: figure out which digit of that number
        return s.charAt((int) ((N - 1) % digits)) - '0';
    }
}