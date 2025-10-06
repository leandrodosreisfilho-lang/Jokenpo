package br.senai.sp.jandira.ds1t.jokenpo.model;

import java.util.Random;
import java.util.Scanner;

public class JokenpoSistema {

    int valorDoUsuario;
    int valorDoComputador;





    public void coletarDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("----------------------------------------------------");
        System.out.println("*** VAMOS INICIAR O JOKENPÔ ***");
        System.out.println("----------------------------------------------------");
        System.out.println("Escolha uma opção:");
        System.out.println("(1) Pedra");
        System.out.println("(2) Papel");
        System.out.println("(3) Tesoura");
        System.out.println("----------------------------------------------------");
        System.out.println("Digite sua escolha: ");
        valorDoUsuario = leitor.nextInt();

        convencionarNumeroEmOpcoes();
    }


    public void convencionarNumeroEmOpcoes(){

        if (valorDoUsuario == 1){
            System.out.println("Você escolheu: Pedra");

        } else if (valorDoUsuario == 2) {
            System.out.println("Você escolheu: Papel");

        } else if (valorDoUsuario == 3){
            System.out.println("Você escolheu: Tesoura");
        }
            ativarEscolhaDoComputador();
    }

    public void ativarEscolhaDoComputador(){
        Random random = new Random();

        valorDoComputador = random.nextInt(3)+1;
        transformarEscolhaDoComputador();


    }
    public void transformarEscolhaDoComputador(){

        if (valorDoComputador == 1){
            System.out.println("O computador escolheu: Pedra");

        } else if (valorDoComputador == 2){
            System.out.println("O computador escolheu: Papel");

        } else if (valorDoComputador == 3) {
            System.out.println("O computador escolheu: Tesoura");

        }

        exibirResultados();

    }

    public void exibirResultados(){

        if (valorDoComputador == valorDoUsuario){
            System.out.println("Empate");

        } else if (valorDoComputador == 1 && valorDoUsuario == 2) {
            System.out.println("Você venceu");

        } else if (valorDoComputador == 1 && valorDoUsuario == 3) {
            System.out.println("Você perdeu");

        } else if (valorDoComputador == 2 && valorDoUsuario == 1) {
            System.out.println("Você perdeu");

        } else if (valorDoComputador == 2 && valorDoUsuario == 3) {
            System.out.println("Você venceu");

        } else if (valorDoComputador == 3 && valorDoUsuario == 1) {
            System.out.println("Você venceu");

        } else if (valorDoComputador == 3 && valorDoUsuario == 2) {
            System.out.println("Você perdeu");

        }

        opçãoJogarNovamente();

    }

    public void opçãoJogarNovamente(){
        Scanner leitor = new Scanner(System.in);

        String jogarNovamente;

        System.out.println("Jogar novamente? S/N");
        jogarNovamente= leitor.nextLine();

        if (jogarNovamente.equals("S")){
            coletarDados();
        } else {
            System.out.println("Obrigado por jogar");
        }
    }

}