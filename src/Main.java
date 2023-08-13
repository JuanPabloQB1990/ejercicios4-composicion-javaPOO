// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa();
        Habitacion habitacion1 = new Habitacion(123, 45.5);
        Habitacion habitacion2 = new Habitacion(456, 30.5);

        casa.agregarHabitaciones(habitacion1);
        casa.agregarHabitaciones(habitacion2);

        casa.mostrarInformacionCasa();
        casa.destruirCasa();
        casa.mostrarInformacionCasa();
    }
}