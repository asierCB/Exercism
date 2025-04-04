class CollatzCalculator {

    int computeStepCount(int start) {
        if (start <= 0) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        }
        int count = 0;
        long n = start;
        while(n != 1){
            if(n % 2 == 0){
                n = n / 2; 
                count ++;
            }else{
                n = (n * 3) + 1;
                count ++;
            }
        }
        return count;
    }
}