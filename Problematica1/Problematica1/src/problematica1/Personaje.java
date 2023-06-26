
package problematica1;


abstract class Personaje {
    public String nombre;
    public int puntosVida;
    public int nivelExperiencia;
    public int danio;
    public Personaje() {}
    public Personaje(String nombre, int puntosVida, int nivelExperiencia) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.nivelExperiencia = nivelExperiencia;
    }
    
    public abstract void atacar(Personaje enemigo);
    public abstract void defender();
    
    public void danio(int danioRecibido){
        this.puntosVida = this.puntosVida - danioRecibido;
        if (this.puntosVida <= 0) {
            System.out.println(nombre + " ha sido derrotado.");
        } else{
            System.out.println();
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    public boolean validadVida(){
        if(puntosVida <= 0){
            return false;
        }
        return true;
    }
}
