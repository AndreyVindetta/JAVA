public class Phone {
    private long number;
    private String model;
    private int weight;
    public Phone(long number,String model,int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(long number,String model){
        this.number = number;
        this.model = model;
        weight = 0;
    }
    public Phone(){
        number = 0;
        model = "NoName";
        weight = 0;
    }
    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name, long number) {
        System.out.println("Звонит " + name + " Номер телефона: " + number);
    }
    public long getNumber() {
        return number;
    }
    public void sendMessage(long[] numbers){
        System.out.println("Сообщение отправленно данным номерам: ");
        for(long x:numbers){
            System.out.println(x);
        }
    }
    public String toString() {
        return "Модель телефона: " + model + " Номер телефона: " + number + " Масса телефона: " + weight;
    }
}