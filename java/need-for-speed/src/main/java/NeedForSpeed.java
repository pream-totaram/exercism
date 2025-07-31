class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int batteryLevel = 100;
    private int distanceDriven = 0;
    NeedForSpeed(int speed, int batteryDrain) {
      this.speed = speed;
      this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.batteryLevel - this.batteryDrain < 0;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
      if(!batteryDrained()) {
        this.distanceDriven += this.speed;
        this.batteryLevel -= this.batteryDrain;
      }
    }

    public int getSpeed() {
      return this.speed;
    }

    public int getBatteryDrain() {
      return this.batteryDrain;
    }

    public int getBatteryLevel() {
      return this.batteryLevel;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
      this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
      return this.distance <=  ((100/car.getBatteryDrain()) * car.getSpeed());
    }
}
