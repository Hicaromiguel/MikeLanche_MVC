package Cotroller.Lanchonete;

import Viewer.Lanchonete.ViewLanchonete;
import Model.Lanchonete.ModelLanchonete;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;



public class ControllerLanchonete {
    public ArrayList<String> ListaDePedidos = new ArrayList<>();
    public Set<String> hash = new HashSet<>(ListaDePedidos);
    public Boolean No_menu_de_compras = false;
    public Boolean No_menu_da_lanchonete = true;
    public ModelLanchonete mymodel = new ModelLanchonete(this);
    public Integer escolha2;

    public void ControlLanchonete() {
        ViewLanchonete myview = new ViewLanchonete(this);
        while (No_menu_da_lanchonete) {
            myview.ViewerLanchonete();//compra, finalizar, sair
            switch (myview.escolha) {
                case 1:
                    No_menu_de_compras = true;
                    while (No_menu_de_compras) {
                        myview.ViewerCompras(); // (hambúrguer, bebida, sobremesa)
                        switch (myview.escolha) {
                            case 1:
                                myview.ViewerHamburguers();
                                escolha2 = myview.escolha;
                                mymodel.PedidosHamburguersModel();
                                break;
                            case 2:
                                myview.ViewerBebidas();
                                escolha2 = myview.escolha;
                                mymodel.PedidosBebidasModel();
                                break;
                            case 3:
                                myview.ViewerSobremesa();
                                escolha2 = myview.escolha;
                                mymodel.PedidosSobremesaModel();
                                break;
                            case 4:
                                No_menu_de_compras = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    mymodel.ImplementarQuantidades();
                    myview.Finalizar();
                    No_menu_da_lanchonete = false;
                    break;
                case 3:
                case 4:
                    No_menu_da_lanchonete = false;
                    break;
            }
        }
    }
}
