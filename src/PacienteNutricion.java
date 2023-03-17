import javax.swing.*;

public class PacienteNutricion {
    private String name;
    private String lastName;
    private int age;
    private double height;
    private double weight;
    private char gender;

    private String compotition;

    public PacienteNutricion(String name, String lastName, int age, double height, double weight, char gender, String compotition) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.compotition = compotition;
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

    public String getCompotition() {
        return compotition;
    }

    public void setCompotition(String compotition) {
        this.compotition = compotition;
    }

    public double imc(double weight,double height){
        return weight/(height*height);
    }

    public  String Compotition(double imc){
        if (imc < 18.5){
            return "Debajo del peso";
        }else if (imc >= 18.5 && imc < 25){
            return "peso normal";
        }else if (imc >= 25 && imc < 30){
            return "sobre peso";
        }else {
            return "Obesidad";
        }
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
