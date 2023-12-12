package c_persona;
public class Main {
     public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.nombre = "Fulano";
        empleado.edad = 25;
        empleado.sexo = "Masculino";
        empleado.sueldo = 50000.0;
        empleado.mostrarDatos();
        empleado.mostrarSueldo();
    }
    
}