public class Futbolista extends Seleccion_Futbol {


    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }


    public void xogarPartido() {


    }

    public void entrenar() {


    }

    @Override
    public String toString() {
        return super.toString() + "Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }


























}
