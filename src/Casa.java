public class Casa {
    private Habitacion[] habitaciones;
    private int cantidadHabitaciones;
    private final int CAPACIDAD_MAXIMA = 100;

    public Casa () {
        this.habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        this.cantidadHabitaciones = 0;
    }

    public void agregarHabitaciones (Habitacion h) {
        if(cantidadHabitaciones < CAPACIDAD_MAXIMA) {
            this.habitaciones[cantidadHabitaciones] = h;
            cantidadHabitaciones++;
        }
    }

    public void destruirCasa() {
        this.cantidadHabitaciones = 0;
    }

    public void mostrarInformacionCasa() {
        if(cantidadHabitaciones > 0) {
            for (int i = 0; i < cantidadHabitaciones; i++) {
                System.out.println("No de habitacion: " + this.habitaciones[i].numeroHabitacion + " -  Tamaño: " + this.habitaciones[i].tamanoHabitacion);
            }
        }else {
            System.out.println("no hay habitaciones");
        }

    }

}
