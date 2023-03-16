
package jueguito.uwu;

public class Heroe {
    private String nombre_heroe;
    private int salud;
    public Heroe (String nombre_heroe, int salud){
        this.nombre_heroe=nombre_heroe;
        this.salud=salud;
    }
    public Heroe(){}
    public int getsalud(){
        return salud;
    }
    public String getnombre_heroe(){
        return nombre_heroe;
    }
    public void setsalud(int salud){
        this.salud=salud;
    }
    public void setnombre_heroe(String nommbre_heroe){
        this.nombre_heroe=nombre_heroe;
    }
    
}
