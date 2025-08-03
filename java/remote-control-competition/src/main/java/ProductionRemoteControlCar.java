class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int distance = 0;
    int numberOfVictories = 0;

    public void drive() {
      this.distance += 10;
    }

    public int getNumberOfVictories() {
      return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
      this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int getDistanceTravelled() {
      return this.distance;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar arg0) {
      if(arg0.getNumberOfVictories() == this.getNumberOfVictories()) {
        return 0;
      }
      return this.getNumberOfVictories() > arg0.getNumberOfVictories() ? 1 : -1;
    }
}
