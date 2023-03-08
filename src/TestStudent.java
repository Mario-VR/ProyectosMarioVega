public class TestStudent {
    public static void main(String[] args) {
        System.out.println("Probando la clase Student");
        Student alumno1500 = new Student(22670080,"Mario Hasinm Zarek","Vega Rosendo","Informatica",2);

        System.out.println("Alumno Numero de Control = " + alumno1500.getControlNumber());
        System.out.println("Alumno Nombre = " + alumno1500.getName());
        System.out.println("Alumno Apellidos = " + alumno1500.getLastName());
        System.out.println("Alumno semestre = " + alumno1500.getSemester());
        System.out.println("Alumno Carrera = " + alumno1500.getCareer());

        System.out.println("/////////////////////////////////////////////////////////////////////////"); //Separacion//

        alumno1500.toString();
        alumno1500.setControlNumber(00542245);
        alumno1500.toString();
        alumno1500.setName("Juan pedro");
        alumno1500.toString();
        alumno1500.setLastName("gonzales");
        alumno1500.toString();
        alumno1500.setSemester(2);
        alumno1500.toString();
        alumno1500.setCareer("Mecanica");
    }


}
