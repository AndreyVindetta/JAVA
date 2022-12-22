public class Like_Season {
    public static void main(String[] args) {
        vremena_goda season = vremena_goda.SUMMER;
        System.out.println(season);
        print(vremena_goda.SUMMER);
        print_values();
    }
    public static void print(vremena_goda season){
        switch (season){
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
        }
    }
    public static void print_values() {
        for (vremena_goda x :vremena_goda.values()) {
            System.out.println(x + ", средняя температура: " + x.temp);
            System.out.println("Описание: " + x.getDescription());
        }
    }
}
