public class Entrenador extends Seleccion_Futbol {



    private String id_federacion;

    public Entrenador(String id_federacion) {
        this.id_federacion = id_federacion;
    }

    public Entrenador() {
    }

    public Entrenador(String id_federacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.id_federacion = id_federacion;
    }

    public String getId_federacion() {
        return id_federacion;
    }

    public void setId_federacion(String id_federacion) {
        this.id_federacion = id_federacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Entrenador{" + "id_federacion=" + id_federacion + '}';
    }

    public void dirixirPartido(){


    }

    public void dirixirEntrenamiento(){


    }




















}
