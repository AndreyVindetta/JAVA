abstract class Transport{
    protected double speed;
    protected double price;
    public void farePerson(double road,int countPerson){
        double time = road/speed;
        double priceRoad = road * price * countPerson;
        System.out.println("Время пути: " + time + " Cтоимость пути: " + priceRoad);
    }
    public void fareCargo(double road,int cargoWeight){
        double time = road/speed;
        double priceRoad = road * price * cargoWeight;
        System.out.println("Время пути: " + time + " Cтоимость перевозки: " + priceRoad);
    }
}
class Car extends Transport{
    public Car(double speed, double price){
        this.speed = speed;
        this.price = price;
    }
    public String toString() {
        return String.format("Автомобиль- Скорость: %.2f км/час Цена за 1 км: %.2f руб",speed,price);
    }
}
class Train extends Transport{
    public Train(double speed, double price){
        this.speed = speed;
        this.price = price;
    }
    public String toString() {
        return String.format("Поезд- Скорость: %.2f км/час Цена за 1 км: %.2f руб",speed,price);
    }
}
class Plane extends Transport{
    public Plane(double speed, double price){
        this.speed = speed;
        this.price = price;
    }
    public String toString() {
        return String.format("Самолет- Скорость: %.2f км/час Цена за 1 км: %.2f руб",speed,price);
    }
}
class Ship extends Transport{
    public Ship(double speed, double price){
        this.speed = speed;
        this.price = price;
    }
    public String toString() {
        return String.format("Корабль- Скорость: %.2f км/час Цена за 1 км: %.2f руб",speed,price);
    }
}