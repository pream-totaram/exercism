class BirdWatcher {
    private final int[] birdsPerDay;
    private int birdsToday; 

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        this.birdsToday = this.birdsPerDay[6];
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsToday;
    }

    public void incrementTodaysCount() {
        this.birdsToday++;
    }

    public boolean hasDayWithoutBirds() {
        for (int i =0; i < birdsPerDay.length; i++) {
            if(this.birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if(numberOfDays > birdsPerDay.length){
            numberOfDays = birdsPerDay.length;
        }
        for (int i =0; i < numberOfDays; i++) {
            sum += birdsPerDay[i];
        }

        return sum;
    }

    public int getBusyDays() {
        int sum = 0;
        for (int i =0; i < birdsPerDay.length; i++) {
            if(birdsPerDay[i] >= 5){
                sum++;
            }
        }
        return sum;
    }
}
