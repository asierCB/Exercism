class Leap {

    boolean isLeapYear(int year) {
        if (year % 400 == 0){
            return true;            
        }else if(year % 100 == 0){
            return false;
        }else if(year % 4 == 0){
            return true;
        }else{
            return false;
        }
    }
}


/*  Another way to solve the problem
class Leap {

    boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
 
 */
