package Cotroller.Cadastro;
import Cotroller.Lanchonete.ControllerLanchonete;
import Model.Cadastro.ModelCadastro;
import Viewer.Cadastro.TelaDeCadastro;

public class ControlCadastro{
    ControllerLanchonete mylanchonete = new ControllerLanchonete();
    public Boolean login = false;
    TelaDeCadastro myview = new TelaDeCadastro();
    ModelCadastro mymodel = new ModelCadastro();

    public void Control() {
        boolean login = true;
        while (login) {
            myview.Viewer_CADASTRO();
            if (myview.escolha == 1) {
                myview.View_CADASTRO();
                mymodel.Nome = myview.Nome;
                mymodel.Senha = myview.Senha;
                mymodel.Cadastrar();
            } else if (myview.escolha == 2) {
                myview.View_LOGIN();
                mymodel.Nome2 = myview.Nome2;
                mymodel.Senha2 = myview.Senha2;
                if (mymodel.Comparador()) {
                    login = false;
                } else {
                    System.out.println("erro");
                }
            } else if (myview.escolha == 3) {
                login = false;
            }
        }
    }
}