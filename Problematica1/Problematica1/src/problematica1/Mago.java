package problematica1;
class Mago extends Personaje{
    public int nivilHechizo;
    public int nivelPoderMagico;

    public Mago() {}
    public Mago(int nivilHechizo, int nivelPoderMagico, String nombre, int puntosVida, int nivelExperiencia) {
        super(nombre, puntosVida, nivelExperiencia);
        this.nivilHechizo = nivilHechizo;
        this.nivelPoderMagico = nivelPoderMagico;
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        danio = nivelExperiencia * nivelExperiencia;
        System.out.println("El Mago lanza su Hechizo de nivel "+ this.nivilHechizo + " y lastima a su oponente\n"
                + enemigo.getNombre() +" Generandole un danio de " + danio);
        enemigo.danio(danio); 
    }

    @Override
    public void defender() {
        System.out.println("El mago se evito el ataque con su escudo magico");
    }
}
