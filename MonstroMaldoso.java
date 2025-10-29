public class MonstroMaldoso extends Monstro {

    public MonstroMaldoso(String nome, int vida, int forcaAtaque) {

        super(nome, vida, forcaAtaque);

    }

    public String getNome(){

        return this.nome;

    }

    public int getVida() {

        return this.vida;

    }

    public int getForca() {

        return this.forcaAtaque;
        
    }
    
}
