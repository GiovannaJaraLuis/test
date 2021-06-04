
package pc1;

public class seguro {
    String nombre;
    String especialidad;
    int tipo;
    String sexo;
    int nroCita;
    static int cuenta=1;

    public seguro() {
    }
    

    public seguro(String nombre, String especialidad, int tipo, String sexo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.tipo = tipo;
        this.sexo = sexo;
        this.nroCita=cuenta++;
    }
    public double pagoTotal(){
        return costo()-descuento();
    }
    public double descuento(){
        double des;
        if(tipo==1)des=0.10*costo();
        else if(tipo==2)des=0.15*costo();
        else des=0.20*costo();
        return des;
    }
    public double costo(){
        double precio;
        if(especialidad=="Medicina General")precio=30;
        else if(especialidad=="Gastroenterologia")precio=50;
        else if(especialidad=="Neurologia")precio=60;
        else precio=40;
        return precio;
    }
  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNroCita() {
        return nroCita;
    }

    public void setNroCita(int nroCita) {
        this.nroCita = nroCita;
    }
    
    public static void main(String[] args) {
       
        
    }
    
}
