public class PacienteNutricion {
    private String name;
    private String lastName;
    private int age;
    private double height;
    private double weight;
    private char gender;

    public PacienteNutricion(String name, String lastName, int age, double height, double weight, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public PacienteNutricion() {

    }



    public String toString() {
        System.out.println("Los datos del paciente son: ");

        System.out.println("Nombre: " + getName());
        System.out.println("Apellidos: " + getLastName());
        System.out.println("Edad: " + getAge());
        System.out.println("Altura: " + getHeight());
        System.out.println("Peso: " + getWeight());
        System.out.println("Genero (sexo):" + getGender() );
        System.out.println();

        return "";
    }

}
