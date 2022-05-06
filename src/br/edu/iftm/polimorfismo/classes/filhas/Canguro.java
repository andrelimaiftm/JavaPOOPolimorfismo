package br.edu.iftm.polimorfismo.classes.filhas;

import br.edu.iftm.polimorfismo.classes.Mamifero;

public class Canguro extends Mamifero {

    public void usarBolsa(){
        System.out.println("Usando a Bolsa");
    }

    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
}
