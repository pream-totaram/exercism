public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int productionPerHour =  speed * 221;
        if(speed == 10) {
            return productionPerHour * .77;
        } else if(speed == 9) {
            return productionPerHour * .8;
        } else if (speed >= 5 && speed <= 8) {
            return productionPerHour * .9;
        } else {
            return productionPerHour;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
    }
}
