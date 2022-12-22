public class Main {
    public static void main(String[] args) {
        Phone phone_1 = new Phone(999_967_07_71L, "Iphone", 150);
        Phone phone_2 = new Phone(916_735_40_55L, "Samsung", 160);
        Phone phone_3 = new Phone(916_123_32_53L, "Nokia", 333);
        System.out.println(phone_1);
        System.out.println(phone_2);
        System.out.println(phone_3);
        phone_1.receiveCall("Андрей");
        phone_1.receiveCall("Андрей", 985_640_13_25L);
        System.out.println("Номер второго телефона: " + phone_2.getNumber());
        long[] numbers = new long[3];
        numbers[0] = 916_534_80_90L;
        numbers[1] = 988_123_45_67L;
        numbers[2] = 925_087_34_78L;
        phone_1.sendMessage(numbers);
    }
}