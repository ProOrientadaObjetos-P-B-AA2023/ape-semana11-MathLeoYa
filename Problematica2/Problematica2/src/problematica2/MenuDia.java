package problematica2;
class MenuDia extends Menu{
    public double valorPostre;
    public double valorBebida;

    public MenuDia() {}
    public MenuDia(double valorPostre, double valorBebida, String nombrePlato, double valorMenu, double valorInicialMenu) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "Valor de Postre = " + valorPostre + "\n"+
                "Valorde Bebida = " + valorBebida + "\n" + 
               "Tipo de Menu -> Menu del Dia\n"+
               "===============================================================\n";
    } 
}
