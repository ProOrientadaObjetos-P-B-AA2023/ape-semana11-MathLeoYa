
package problematica2;
import java.util.ArrayList;
import java.util.List;
public class Ejecutor001 {
    public static void main(String[] args) {
       List<Menu> listaMenu1 = new ArrayList<>();
       MenuNinio menuNinio1 = new MenuNinio(4,3,"´Papas a la Mathie",7,7);
       MenuNinio menuNinio2 = new MenuNinio(1,8,"Cabecitas de Poio",9,9);
       listaMenu1.add(menuNinio1);
       listaMenu1.add(menuNinio2);
       MenuEconomico menuEconomico1 = new MenuEconomico(12.5,"Arroz con huevo",3,3);
       listaMenu1.add(menuEconomico1);
       MenuDia menuDia1 = new MenuDia(6,2,"Pollo al jugo",8,10);
       listaMenu1.add(menuDia1);
       MenuCarta menuCarta1 = new MenuCarta(5,2,5,"Patitas de res ",10,10);
       listaMenu1.add(menuCarta1);
       Cuenta cuenta1 = new Cuenta("Ramirez",listaMenu1,12); 
       
       cuenta1.calcularValorSubtotal();
       cuenta1.calcularValorTotal();
       
        System.out.println(cuenta1.toString());
    }
    
}

