package br.edu.iftm.polimorfismo.classes;

public class Reptil extends Animal {

    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Ratesjando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais ou carne");
    }

    @Override
    public void emitirSom() {
        System.out.println("grunhindo");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
