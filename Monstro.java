public abstract class Monstro {

    public String nome;
    public int vida;
    public int forcaAtaque;
    //Atributos 

    public Monstro(String nome, int vida, int forcaAtaque) {
    //Método monstro

        this.nome = nome;
        this.vida = vida;
        this.forcaAtaque = forcaAtaque;

    }

    public void Atacar(Jogador jogador) {
        jogador.vida -= this.forcaAtaque;
        System.out.printf("%s atacou o jogador e causou %d de dano.", this.nome, this.forcaAtaque);
    }
 

    public void ReceberDano(int dano) {

        this.vida -= dano;
        System.out.printf("%s recebeu %d de dano. Vida restante: %d.", this.nome, dano, this.vida);

    };

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
