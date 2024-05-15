package 内部类例子;

public class Car {
    String carName;
    int carAge;
    String carColor;


    class Engine{
        String engineName;
        int engineAge;

        public void show() {
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
