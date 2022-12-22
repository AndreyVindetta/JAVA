public class Transport_main {
    public static void main(String[] args){
        Car car = new Car(100,50);
        Train train = new Train(150,100);
        Plane plane = new Plane(300,250);
        Ship ship = new Ship(200,150);
        System.out.println(car);
        car.farePerson(300,1);
        car.fareCargo(300,500);
        System.out.println(train);
        train.farePerson(300,1);
        train.fareCargo(300,500);
        System.out.println(plane);
        plane.farePerson(300,1);
        plane.fareCargo(300,500);
        System.out.println(ship);
        ship.farePerson(300,1);
        ship.fareCargo(300,500);

    }
}