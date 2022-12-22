public class Shop implements Printable{
    Printable[] A;
    Shop(String a,String b,String c)
    {
        A = new Printable[3];
        A[0] = new Book(a);
        A[1] = new Book(b);
        A[2] = new Book(c);
    }
    public void print() {
        for (int i = 0; i < 3; i++)
        {
            A[i].print();
        }
    }
}