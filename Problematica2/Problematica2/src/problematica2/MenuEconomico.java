package problematica2;
class MenuEconomico extends Menu{
    public double porcentajeDescuento;

    public MenuEconomico() {}
    public MenuEconomico(double porcentajeDescuento, String nombrePlato, double valorMenu, double valorInicialMenu) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String toString() {
        return super.toString()+
               "Porcentaje de Descuento, en refercia al Valor Inicial del menu = " + porcentajeDescuento + "\n" + 
               "Tipo de Menu: Menu Economico.\n"+"===============================================================\n";
    }
    
}
