class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean yes = true;
        boolean loop = true;
        while (loop) {
            if (n == 1) {
                yes = true;
                loop = false;
            } else if (n != 0) {
                if (n%2 == 0) {
                    n = n/2;
                } else {
                    yes = false;
                    loop = false;
                }
            } else {
                yes = false;
                loop = false;
            }
        }
        return yes;
    }
}
