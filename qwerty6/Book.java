public class Book implements Printable{
    private String name;
    public Book(String name)
    {
        this.name=name;
    }
    public void print() {
        System.out.printf("%s%n",name);
    }
}