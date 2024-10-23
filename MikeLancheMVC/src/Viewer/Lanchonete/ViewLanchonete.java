package Viewer.Lanchonete;

import Cotroller.Lanchonete.ControllerLanchonete;
import java.util.Scanner;

public class ViewLanchonete {
    public Scanner scan = new Scanner(System.in);
    public Integer escolha;
    private ControllerLanchonete mycontrol;
    public ViewLanchonete(ControllerLanchonete controller) {
        this.mycontrol = controller;
    }

    public void ViewerLanchonete() {
        System.out.println("Bem-vindo, escolha uma das opções abaixo");
        System.out.println("[1] Comprar");
        System.out.println("[2] Finalizar pedido");
        System.out.println("[3] Sair");
        escolha = scan.nextInt();
    }

    public void ViewerCompras() {
        System.out.println("[1] Hamburguers");
        System.out.println("[2] Bebidas");
        System.out.println("[3] Sobremesas");
        System.out.println("[4] Voltar ao Menu");
        escolha = scan.nextInt();
    }

    public void ViewerHamburguers() {
        System.out.println("[1] MikeLanche (R$21,00)");
        System.out.println("[2] Quarterinha (R$25,00)");
        System.out.println("[3] Pimpim (R$39,00)");
        System.out.println("[4] Voltar");
        escolha = scan.nextInt();
    }

    public void ViewerBebidas() {
        System.out.println("[1] Coca 500 ml (R$6,00)");
        System.out.println("[2] Fanta 500 ml (R$6,00)");
        System.out.println("[3] Vitamina de abacate (R$8,00)");
        System.out.println("[4] Voltar");
        escolha = scan.nextInt();
    }

    public void ViewerSobremesa() {
        System.out.println("[1] Sorvete (R$6,50)");
        System.out.println("[2] Doce de abacate (R$10,00)");
        System.out.println("[3] Sorvete com bolo de chocolate (R$20,00)");
        System.out.println("[4] Voltar");
        escolha = scan.nextInt();
    }

    public void Finalizar() {
        System.out.println("~~~~ PEDIDOS ~~~~");
        mycontrol.hash.addAll(mycontrol.ListaDePedidos);
        mycontrol.hash.remove("Mikelanche (R$21,00)"); mycontrol.hash.remove("Quarterinha (R$25,00)");mycontrol.hash.remove("Pimpim (R$39,00)");mycontrol.hash.remove("Coca 500 ml (R$6,00)");mycontrol.hash.remove("Fanta 500 ml (R$6,00)");mycontrol.hash.remove("Vitamina de abacate (R$ 8,00)");mycontrol.hash.remove("sorvete com bolo de chocolate (R$ 20,00)");mycontrol.hash.remove("Doce de abacate (R$ 10,00)");mycontrol.hash.remove("Sorvete (R$ 6,50)");
        mycontrol.ListaDePedidos.clear();
        mycontrol.ListaDePedidos.addAll(mycontrol.hash);
        for (String pedido : mycontrol.ListaDePedidos) {
            System.out.println(pedido);
        }
        System.out.println("Preço total: R$ " + mycontrol.mymodel.getPrecoTotal());
    }
}
