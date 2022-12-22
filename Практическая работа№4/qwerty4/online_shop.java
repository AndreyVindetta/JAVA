import java.util.Scanner;
public class online_shop {
    public static class Product {
        String nameProduct;
        double cost;
        Product(String nameProduct, double cost) {
            this.nameProduct = nameProduct;
            this.cost = cost;
        }
    }
    public static class Category {
        String nameCategory;
        Product[] products;
        Category(String nameCategory, Product[] products) {
            this.nameCategory = nameCategory;
            this.products = products;
        }
    }
    public static class Basket {
        Product[] purchased;
        Basket(Product[] purchased) {
            this.purchased = purchased;
        }
    }
    public static class User {
        public User(String login, String password) {
            this.login = login;
            this.password = password;
        }
        public String login, password;
        public Basket purchased;
        boolean isAuth(String login, String password) {
            if(this.login == login && this.password == password) return true;
            else return false;
        }
    }
    public static void getMenu() {
        System.out.println("\n Главное меню");
        System.out.println("1.Категории товаров");
        System.out.println("2.Корзина");
        System.out.println("3.Оплатить");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number) {
            case 1: {
                getCategory(all);
                break;
            }
            case 2: {
                name_product(card);
                break;
            }
            case 3: {
                Buy();
                break;
            }
        }
    }
    public static void Buy() {
        Basket cards = new Basket(card);
        client.purchased = cards;
        System.out.println("Товарный чек");
        for(int i = 0; i < client.purchased.purchased.length; ++i) {
            if(client.purchased.purchased[i] == null) break;
            System.out.println((i+1) + ". " + client.purchased.purchased[i].nameProduct + " ------- "
                    + client.purchased.purchased[i].cost);
        }
        double gc = getCash(client.purchased.purchased);
        System.out.print("Общая сумма покупок составляет -------" + gc);
    }
    public static double getCash(Product[] p) {
        double cash = 0.0;
        for(int i = 0; i < p.length; ++i) {
            if(p[i] == null) break;
            cash+=p[i].cost;
        }
        return cash;
    }
    public static void getCategory(Category[] c) {
        for(int i = 0; i < c.length; ++i){
            System.out.println("№"+ (i+1) + " " + c[i].nameCategory);
        }
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
        else seeProduct(all[number-1]);
    }
    public static void name_product(Product[] b) {
        for(int i = 0; i < b.length; ++i) {
            if(b[i] == null) break;
            System.out.println((i+1) + ". " + b[i].nameProduct + " ------- "
                    + b[i].cost);
        }
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
    }
    public static void seeProduct(Category cat) {
        for(int i = 0; i < cat.products.length; ++i) {
            System.out.println((i+1) + ". " + cat.products[i].nameProduct + " ------- "
                    + cat.products[i].cost);
        }
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getCategory(all);
        else buyProduct(cat.products[number-1]);
    }
    private static void buyProduct(Product p) {
        System.out.println("Товар " + p.nameProduct + " за " + p.cost + " был добавлен в вашу корзину");
        for(int i = 0; i < card.length; ++i) {
            if(card[i] == null) {
                card[i] = p;
                break;
            }
        }
        getCategory(all);
    }
    static Product down_jacket = new Product("Пуховик", 7600.0);
    static Product coat = new Product("Пальто", 12000.0);
    static Product fur_coat = new Product("Шуба", 100999.0);
    static Product sneakers = new Product("Кроссовки", 6100.0);
    static Product boots = new Product("Сапоги", 8300.0);
    static Product slippers = new Product("Шлепки", 300.0);
    static Product bag = new Product("Сумка", 3400.0);
    static Product glasses = new Product("Очки", 1100.0);
    static Product scarf = new Product("Шарф", 800.0);
    static Product[] Outerwear = {
            down_jacket, coat, fur_coat
    };
    static Product[] Shoes = {
            sneakers, boots, slippers
    };
    static Product[] Accessories = {
            bag, glasses, scarf
    };
    static Category outerwear = new Category("Верхняя одежда", Outerwear);
    static Category shoes = new Category("Обувь", Shoes);
    static Category accessories = new Category("Аксессуары", Accessories);
    static Category[] all = {
            outerwear, accessories, shoes
    };
    static Product[] card;
    static User client;
    public static void main(String[] args) {
        client = new User("123","123");
        Scanner scanner = new Scanner(System.in);
        card = new Product[1000];
        System.out.println("Авторизация \nВведите логин и пароль пользователя:");
        String login = (String)scanner.nextLine();
        String password = (String)scanner.nextLine();
        if (!client.isAuth(login, password)) {
            getMenu();
        }
    }
}