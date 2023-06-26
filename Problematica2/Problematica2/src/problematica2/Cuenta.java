package problematica2;
import java.util.List;
public class Cuenta {
    public String nombreCliente;
    public List<Menu> listadoMenus;
    public double valorTotal;
    public double valorSubtotal;
    public double iva;
    public Cuenta() {}
    public Cuenta(String nombreCliente, List<Menu> listadoMenus, double iva) {
        this.nombreCliente = nombreCliente;
        this.listadoMenus = listadoMenus;
        this.iva = iva;
    }
    public void calcularValorSubtotal(){
        this.valorSubtotal = 0;
        for(Menu menu : listadoMenus){
            this.valorSubtotal += menu.getValorMenu();
        }
    }
    
    public void calcularValorTotal(){
        this.valorTotal = ( this.valorSubtotal + (this.valorSubtotal/100) );
    }

    @Override
    public String toString() {
        
        return "====================================================\n"+
               "                       CUENTAS\n"+ 
               "====================================================\n"+
                "Nombre Cliente = " + nombreCliente + "\n" + 
                "Listado de Menus: " + "\n" + listadoMenus + "\n" + 
                "Valor Subtotal = " + valorSubtotal + "\n" + 
                "IVA = " + iva +
                "\nValor Total = " + valorTotal;
    }

}