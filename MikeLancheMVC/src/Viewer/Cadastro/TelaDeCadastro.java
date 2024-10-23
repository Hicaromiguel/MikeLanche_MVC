package Viewer.Cadastro;

import java.util.Scanner;

public class TelaDeCadastro {
    public String Senha;
    public String Nome;
    public String Senha2;
    public String Nome2;
    public Scanner scan = new Scanner(System.in);
    public Integer escolha;
    public void Viewer_CADASTRO(){
        System.out.println("Bem vindo ao mikelanches");
        System.out.println("por favo, faça o registro no site");
        System.out.println("[1]Cadastro");
        System.out.println("[2]Login");
        System.out.println("[3]Sair");
        escolha = scan.nextInt();
        scan.nextLine();
    }
    public void View_CADASTRO(){
        System.out.println("Nome:");
        Nome = scan.nextLine();
        System.out.println("Senha:");
        Senha = scan.nextLine();
    }
    public void View_LOGIN(){
        System.out.println("Qual seu nome de usuario?");
        Nome2 = scan.nextLine().trim();
        System.out.println("Qual a senha?");
        Senha2 = scan.nextLine().trim();
    }
}