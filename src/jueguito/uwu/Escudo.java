
package jueguito.uwu;

public class escudo {
    private String nombre_escudo;
    private int protec_escudo;
    public escudo (String nombre_escudo, int protec_escudo){
        this.nombre_escudo=nombre_escudo;
        this.protec_escudo=protec_escudo;
    }
    public String getnom_escudo(){
        return nombre_escudo;
    }
    public int getprotec_escudo(){
        return protect_escudo;
    }
    public void setnombre_escudo(String nom_escudo){
        this.nombre_escudo=nombre_escudo;
    }
    public void setprotec_escudo(int protect_escudo){
        this.protec_escudo=protec_escudo;
    }
}
