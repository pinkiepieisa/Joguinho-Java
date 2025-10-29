public abstract class Jogador {

    public int vida;
    public int forcaAtaque;

    public Jogador(int vida, int forcaAtaque) {

        this.vida = vida;
        this.forcaAtaque = forcaAtaque;

    }

    public void Atacar(Monstro monstro) {

        monstro.ReceberDano(forcaAtaque);

    }
    
}
