public class EliudsEggs {
    private int count = 0;
    
    public int eggCount(int number) {
        while(number > 1){
            int div = number%2;
            if (div == 1){
                count ++;
                number = number/2;
            }else{
                number = number/2;
            }
        }
        if(number == 1){
            count ++;
        }
        return count;
    }
}
