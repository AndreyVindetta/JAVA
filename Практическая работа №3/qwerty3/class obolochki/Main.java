public class Main {
    public static void main(String[] args) {
        Double a = Double.valueOf(5);
        System.out.println(a);
        String str = "100";
        double b = Double.parseDouble(str);
        System.out.println(b);
        Double obj = new Double("23.12");
        double doubleObj = obj.doubleValue();
        System.out.println(doubleObj);
        int intObj = obj.intValue();
        System.out.println(intObj);
        byte byteObj = obj.byteValue();
        System.out.println(byteObj);
        short shortObj = obj.shortValue();
        System.out.println(shortObj);
        long longObj = obj.longValue();
        System.out.println(longObj);
        float floatObj = obj.floatValue();
        System.out.println(floatObj);
        double d = 3.14;
        System.out.println("String d = " + Double.toString(d));
    }
}