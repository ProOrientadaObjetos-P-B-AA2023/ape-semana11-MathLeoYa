package problematica2;
class MenuNinio extends Menu{
    public double valorPorcionHelado;
    public double valorPorcionPastel;

    public MenuNinio() {}
    public MenuNinio(double valorPorcionHelado, double valorPorcionPastel, String nombrePlato, double valorMenu, double valorInicialMenu) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.valorPorcionHelado = valorPorcionHelado;
        this.valorPorcionPastel = valorPorcionPastel;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "Valor de Porcion de Helado = " + valorPorcionHelado + "\n"+
                "Valor de Porcion de Pastel = " + valorPorcionPastel + "\n" + 
               "Tipo de Menu -> Menu de Niños.\n"+
                "===============================================================\n";
    } 
}
