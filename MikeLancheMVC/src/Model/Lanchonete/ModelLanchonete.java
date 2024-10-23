package Model.Lanchonete;

import Model.Cadastro.Abstrato;
import Cotroller.Lanchonete.ControllerLanchonete;

import java.util.ArrayList;

public class ModelLanchonete {
    public int PH1,PH2,PH3,PB1,PB2,PB3,PS1,PS2,PS3 = 0;
    private ControllerLanchonete mylanchonete;
    public float PrecoTotal;

    public ModelLanchonete(ControllerLanchonete controllerLanchonete) {
        this.mylanchonete = controllerLanchonete;
    }

    public float getPrecoTotal() {
        return PrecoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        PrecoTotal = precoTotal;
    }


    public void PedidosHamburguersModel() {
        switch (mylanchonete.escolha2) {
            case 1: // MikeLanche (R$21,00)
                PH1 += 1;
                setPrecoTotal(getPrecoTotal() + 21);
                mylanchonete.ListaDePedidos.add("Mikelanche (R$21,00)");
                break;
            case 2: // Quarterinha (R$ 25,00)
                PH2 += 1;
                setPrecoTotal(getPrecoTotal() + 25);
                mylanchonete.ListaDePedidos.add("Quarterinha (R$25,00)");
                break;
            case 3: // Pimpim (R$39,00)
                PH3 += 1;
                setPrecoTotal(getPrecoTotal() + 39);
                mylanchonete.ListaDePedidos.add("Pimpim (R$39,00)");
                break;
        }
    }
    public void PedidosBebidasModel(){
        switch (mylanchonete.escolha2){
            case 1://Coca 500 ml (R$6,00)
                PB1 += 1;
                setPrecoTotal(getPrecoTotal()+6);
                mylanchonete.ListaDePedidos.add("Coca 500 ml (R$6,00)");
            case 2://Fanta 500 ml (R$6,00)
                PB2 += 1;
                setPrecoTotal(getPrecoTotal()+6);
                mylanchonete.ListaDePedidos.add("Fanta 500 ml (R$6,00)");
            case 3://Vitamina de abacate (R$ 8,00)
                PB3 += 1;
                setPrecoTotal(getPrecoTotal()+8);
                mylanchonete.ListaDePedidos.add("Vitamina de abacate (R$ 8,00)");
        }
    }
    public void PedidosSobremesaModel(){
        switch (mylanchonete.escolha2){
            case 1://Sorvete (R$ 6,50)
                this.PS1 += 1;
                setPrecoTotal((float) (getPrecoTotal()+6.50));
                mylanchonete.ListaDePedidos.add("Sorvete (R$ 6,50)");
                break;
            case 2:  //Doce de abacate (R$ 10,00)
                PS2 += 1;
                setPrecoTotal(getPrecoTotal()+10);
                mylanchonete.ListaDePedidos.add("Doce de abacate (R$ 10,00)");
                break;
            case 3: //sorvete com bolo de chocolate (R$ 20,00)
                PS3 +=1;
                setPrecoTotal(getPrecoTotal()+20);
                mylanchonete.ListaDePedidos.add("sorvete com bolo de chocolate (R$ 20,00)");
                break;
        }
    }
    public void ImplementarQuantidades(){
        if (mylanchonete.ListaDePedidos.contains("Mikelanche (R$21,00)")){
            mylanchonete.ListaDePedidos.remove("Mikelanche (R$21,00)");
            mylanchonete.ListaDePedidos.add("Mikelanche (R$21,00) "+PH1 + "X");
        }
        if (mylanchonete.ListaDePedidos.contains("Quarterinha (R$25,00)")){
            mylanchonete.ListaDePedidos.remove("Quarterinha (R$25,00)");
            mylanchonete.ListaDePedidos.add("Quarterinha (R$25,00) "+PH2 + "X");
        }
        if (mylanchonete.ListaDePedidos.contains("Pimpim (R$39,00)")){
            mylanchonete.ListaDePedidos.remove("Pimpim (R$39,00)");
            mylanchonete.ListaDePedidos.add("Pimpim (R$39,00) "+PH3 + "X");
        }
        if (mylanchonete.ListaDePedidos.contains("Coca 500 ml (R$6,00)")){
            mylanchonete.ListaDePedidos.remove("Coca 500 ml (R$6,00)");
            mylanchonete.ListaDePedidos.add("Coca 500 ml (R$6,00) " + PB1+"X");
        }
        if (mylanchonete.ListaDePedidos.contains("Fanta 500 ml (R$6,00)")){
            mylanchonete.ListaDePedidos.remove("Fanta 500 ml (R$6,00)");
            mylanchonete.ListaDePedidos.add("Fanta 500 ml (R$6,00) " + PB2 + "X");
        }
        if (mylanchonete.ListaDePedidos.contains("Vitamina de abacate (R$ 8,00)")){
            mylanchonete.ListaDePedidos.remove("Vitamina de abacate (R$ 8,00)");
            mylanchonete.ListaDePedidos.add("Vitamina de abacate (R$ 8,00) " + PB3 + "X");
        }
        if (mylanchonete.ListaDePedidos.contains("Sorvete (R$ 6,50)")){
         mylanchonete.ListaDePedidos.remove("Sorvete (R$ 6,50)");
         mylanchonete.ListaDePedidos.add("Sorvete (R$ 6,50) " + PS1 + "X");
        }
        if (mylanchonete.ListaDePedidos.contains("Doce de abacate (R$ 10,00)")){
            mylanchonete.ListaDePedidos.remove("Doce de abacate (R$ 10,00)");
            mylanchonete.ListaDePedidos.add("Doce de abacate (R$ 10,00) " + PS2 + "X");
        }
        if (mylanchonete.ListaDePedidos.contains("sorvete com bolo de chocolate (R$ 20,00)")){
            mylanchonete.ListaDePedidos.remove("sorvete com bolo de chocolate (R$ 20,00)");
            mylanchonete.ListaDePedidos.add("sorvete com bolo de chocolate (R$ 20,00) " + PS3 + "X");
        }
}}
