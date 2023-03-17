import java.util.Scanner;
public class TestPaciente {


    public static void main(String[] args) {
        double imc = 0;
        PacienteNutricion patient = new PacienteNutricion("Maria", "Morales", 20, 1.6, 65.500, 'F',"");

        imc=patient.imc(patient.getWeight(),patient.getHeight());

        System.out.println("Hola "+patient.getName()+", tu IMC es: "+imc);
       String compotition = patient.Compotition(imc);
        System.out.println("Tu composicion corporal es: "+compotition);
    }
}