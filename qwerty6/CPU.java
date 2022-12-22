public class CPU implements Information{
    private String name;
    private int MHz;
    private byte Core;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getPower() {
        return MHz;
    }
    public void setPower(int power) {
        MHz = power;
    }
    public byte getObj() {
        return Core;
    }
    public void setObj(byte obj) {
        Core = obj;
    }
}