package Model.Cadastro;

import Model.Cadastro.Abstrato;

public class ModelCadastro implements Abstrato {

    public String Nome;
    public String Senha;
    public String Nome2;
    public String Senha2;

    public String getNome2() {
        return Nome2;
    }

    public String getSenha2() {
        return Senha2;
    }

    public void setNome2(String nome2) {
        Nome2 = nome2;
    }

    public void setSenha2(String senha2) {
        Senha2 = senha2;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public String getNome() {
        return Nome;
    }

    public String getSenha() {
        return Senha;
    }

    @Override
    public void Cadastrar() {
        setNome(Nome);
        setSenha(Senha);
    }

    @Override
    public void Login() {
        setNome2(Nome2);
        setSenha2(Senha2);
    }

    @Override
    public boolean Comparador() {
        if ((Nome!=null)&&(Senha!=null)&&(Nome2!=null)&&(Senha2!=null)) {
            return Nome.equals(Nome2) && Senha.equals(Senha2);
        }else {
            return false;
        }
    }
}
