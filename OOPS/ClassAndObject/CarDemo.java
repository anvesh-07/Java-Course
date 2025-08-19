package OOPS.ClassAndObject;

class Car {
  String brand;
  String color;
  int speed;

  void displayCar() {
    System.out.println("Brand: " + brand + ", Color: " + color + ", Speed: " + speed + " km/h");
  }
}

public class CarDemo {
  public static void main(String[] args) {
    Car car1 = new Car();
    car1.brand = "Tesla";
    car1.color = "Red";
    car1.speed = 120;
    car1.displayCar();

    Car car2 = new Car();
    car2.brand = "BMW";
    car2.color = "Black";
    car2.speed = 150;
    car2.displayCar();
  }
}

/*
 * Explanation:
 * 1) "Car" class defines 3 variables and 1 method.
 * 2) "car1" and "car2" are two independent objects.
 * 3) Each object has its own values (brand, color, speed).
 * 4) Methods can be reused for both objects.
 */
