import Cotroller.Cadastro.ControlCadastro;
import Cotroller.Lanchonete.ControllerLanchonete;

public class Main {
    static ControlCadastro C1 = new ControlCadastro();
    static ControllerLanchonete C2 = new ControllerLanchonete();
    public static void main(String[] args) {
        C1.Control();
        C2.ControlLanchonete();
    }
}