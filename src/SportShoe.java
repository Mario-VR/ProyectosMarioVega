public class SportShoe {
    private String name;
    private short age;
    private char sex;
    private String mark;
    private byte size;
    private String color;
    private int amount;

    public SportShoe(String name, short age, char sex, String mark, byte size, String color,int amount) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.mark = mark;
        this.size = size;
        this.color = color;
        this.amount = amount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public short getAge() {
        return age;
    }
    public void setAge(short age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
    public byte getSize() {
        return size;
    }
    public void setSize(byte size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String toString() {
        System.out.println("Los datos de la persona son:");
        System.out.println("Nombre: " + getName());
        System.out.println("Sexo: " + getSex());
        System.out.println("Edad: " + getAge());
        System.out.println("Talla de calzado: " + getSize());
        System.out.println("Cantidad: " + getAmount());
        System.out.println("La marca de sus tenis es: " + getMark());
        System.out.println("El color de sus tenis es: " + getColor());
        return "";
    }
}