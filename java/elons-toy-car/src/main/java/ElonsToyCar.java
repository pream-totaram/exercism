public class ElonsToyCar {
    private int distance = 0;
    private int batteryLevel = 100;
    public static ElonsToyCar buy() {
      return new ElonsToyCar();
    }

    public String distanceDisplay() {
      return String.format("Driven %d meters", this.distance);
    }

    public String batteryDisplay() {
      return this.batteryLevel == 0 ? "Battery empty" : String.format("Battery at %d%s", this.batteryLevel, "%");
    }

    public void drive() {
      if(this.batteryLevel == 0) {
        return;
      }
      this.distance += 20;
      this.batteryLevel -= 1;
    }
}
