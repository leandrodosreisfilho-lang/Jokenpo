package br.senai.sp.jandira.ds1t.jokenpo;

import br.senai.sp.jandira.ds1t.jokenpo.model.JokenpoSistema;

public class Jokenpoapp {
    public static void main (String[] args){
        System.out.println("Iniciando...");

        JokenpoSistema media = new JokenpoSistema();
        media.coletarDados();

    }
}
