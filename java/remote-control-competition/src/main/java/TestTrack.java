import java.util.ArrayList;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
      car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
      quicksort(cars, cars.size() - 1, 0);

      return cars;
        
    }

    private static void quicksort(List<ProductionRemoteControlCar> cars, int highIndex, int lowIndex) {
      if(lowIndex >= highIndex) {
        return;
      }
      int pivot = cars.get(highIndex).getNumberOfVictories();
      int leftPointer = lowIndex;
      int rightPointer = highIndex;
      
      while(leftPointer < rightPointer) {
        while(cars.get(leftPointer).getNumberOfVictories() >= pivot && leftPointer < rightPointer) {
          leftPointer++;
        }

        while (cars.get(rightPointer).getNumberOfVictories() <= pivot && leftPointer < rightPointer) {
          rightPointer--;
        }
        swap(cars, leftPointer, rightPointer);
      }
      swap(cars, leftPointer, highIndex);
      quicksort(cars, leftPointer-1, lowIndex);
      quicksort(cars, highIndex, leftPointer+1);
      
    }

    private static void swap(List<ProductionRemoteControlCar> cars, int index1, int index2) {
      ProductionRemoteControlCar temp = cars.get(index1);
      cars.set(index1, cars.get(index2));
      cars.set(index2, temp);
    }
}
