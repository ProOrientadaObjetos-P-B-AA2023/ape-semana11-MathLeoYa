package problematica2;
class MenuCarta extends Menu{
    public double valorPorcion;
    public double valorBebida;
    public double porcentajeAdicionalServicio;

    public MenuCarta() {}
    public MenuCarta(double valorPorcion, double valorBebida, double porcentajeAdicionalServicio, String nombrePlato, double valorMenu, double valorInicialMenu) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.valorPorcion = valorPorcion;
        this.valorBebida = valorBebida;
        this.porcentajeAdicionalServicio = porcentajeAdicionalServicio;
    }

    @Override
    public String toString() {
        return super.toString() +
               "Valor de porcion de Guarnicion = " + valorPorcion + "\n"+
               "Valor de Bebida = " + valorBebida + "\n"+
               "Porcentaje Adicional por Servicio en relación del valor inicial del menú = " + porcentajeAdicionalServicio + "\n" + 
               "Tipo de Menu -> Menu a la Carta\n"
                +"===============================================================\n";
    }    
}
