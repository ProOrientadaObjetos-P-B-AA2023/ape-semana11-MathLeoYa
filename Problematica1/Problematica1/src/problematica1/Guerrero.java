
package problematica1;

class Guerrero extends Personaje{
    public int nivilFuerza;
    public int nivelHabilidadCombate;

    public Guerrero() {}

    public Guerrero(int nivilFuerza, int nivelHabilidadCombate, String nombre, int puntosVida, int nivelExperiencia) {
        super(nombre, puntosVida, nivelExperiencia);
        this.nivilFuerza = nivilFuerza;
        this.nivelHabilidadCombate = nivelHabilidadCombate;
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        danio = this.nivelHabilidadCombate + this.nivilFuerza;
        System.out.println("El Guerrero combate cuerpo a cuerpo con "+ enemigo.getNombre()+ 
                            "\nGenerandole un danio de " + danio);
        enemigo.danio(danio);
    }
    @Override
    public void defender() {
        System.out.println("El Guerrero esquiva el ataque");  
    }
    
}
