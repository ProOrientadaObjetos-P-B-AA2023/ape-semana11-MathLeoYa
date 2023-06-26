
package problematica2;

abstract class Menu {
    public String nombrePlato;
    public double valorMenu;
    public double valorInicialMenu;

    public Menu() {}
    public Menu(String nombrePlato, double valorMenu, double valorInicialMenu) {
        this.nombrePlato = nombrePlato;
        this.valorMenu = valorMenu;
        this.valorInicialMenu = valorInicialMenu;
    }

    public double getValorMenu() {
        return valorMenu;
    }
    
    @Override
    public String toString() {
        return 
               "                       Menu\n"+
               "Nombre del Plato = " + nombrePlato + "\n" + 
               "Valor Menu = " + valorMenu + "\n" + 
               "Valor Inicial del Menu = " + valorInicialMenu + "\n";
    }
}








