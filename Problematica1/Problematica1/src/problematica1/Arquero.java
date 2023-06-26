package problematica1;
class Arquero extends Personaje{
    public int nivilPrecision;
    public int nivelHabilidadDistancia;

    public Arquero() {}

    public Arquero(int nivilPrecision, int nivelHabilidadDistancia, String nombre, int puntosVida, int nivelExperiencia) {
        super(nombre, puntosVida, nivelExperiencia);
        this.nivilPrecision = nivilPrecision;
        this.nivelHabilidadDistancia = nivelHabilidadDistancia;
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        danio = nivelExperiencia + nivilPrecision + nivelHabilidadDistancia;
        System.out.println("El Arquero aserto a su enemigo " + enemigo.getNombre() + " con una precision de "+ this.nivilPrecision 
                           + "\nGenerandole un danio de " + danio);
        enemigo.danio(danio);   
    }

    @Override
    public void defender() {
        System.out.println("El Arquero esquiva el ataque");
    }
}