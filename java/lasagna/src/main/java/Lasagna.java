public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int elapsedTime) {
        return this.expectedMinutesInOven() - elapsedTime;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    public int totalTimeInMinutes(int numberOfLayers, int timeInOven) {
        return this.preparationTimeInMinutes(numberOfLayers) + timeInOven;
    }
}
