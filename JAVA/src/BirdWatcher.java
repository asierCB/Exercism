public class BirdWatcher {
	private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int [] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
    	this.birdsPerDay[birdsPerDay.length - 1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
    	int daysWithoutBirds = 0;
        for (int x = 0; x < birdsPerDay.length; x++) {
        	
            if (birdsPerDay[x] == 0) {
            	daysWithoutBirds++;
            }
        }
        if (daysWithoutBirds != 0) {
        	return true;
        }else{
        	return false;
        }
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if (numberOfDays <= 7){
            for (int x = 0; x < numberOfDays; x++) {
                 sum += birdsPerDay[x];
            }
        }else{
            numberOfDays = 7;
            for (int x = 0; x < numberOfDays; x++) {
                 sum += birdsPerDay[x];
            }
        }
        
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int x = 0; x < birdsPerDay.length; x++) {
			if (birdsPerDay[x] > 4){
                busyDays ++;
            }
        }
        return busyDays;
    }
}

/* 				INSTRUCCIONES:

You're an avid bird watcher who keeps track of how many birds have visited your garden in the last 
seven days.
You have six tasks, all dealing with the numbers of birds that visited your garden.

	- Check what the count was last week.
For comparison purposes, you always keep a copy of last week's counts nearby, 
which were: 0, 2, 5, 3, 7, 8 and 4. Implement the BirdWatcher.getLastWeek() method that returns 
last week's counts:

	-Check how many birds visited today.
Implement the BirdWatcher.getToday() method to return how many birds visited your garden today. 
The bird counts are ordered by day, with the first element being the count of the oldest day, 
and the last element being today's count.

	-Increment today's count
Implement the BirdWatcher.incrementTodaysCount() method to increment today's count:

	-Check if there was a day with no visiting birds.
Implement the BirdWatcher.hasDayWithoutBirds() method that returns true if there was a day at 
which zero birds visited the garden; otherwise, return false

	-Calculate the number of visiting birds for the first number of days.
Implement the BirdWatcher.getCountForFirstDays() method that returns the number of birds that 
have visited your garden from the start of the week, but limit the count to the specified number 
of days from the beginning of the week.

	-Calculate the number of busy days
Some days are busier than others. A busy day is one where five or more birds have visited your 
garden. Implement the BirdWatcher.getBusyDays() method to return the number of busy days:

*/