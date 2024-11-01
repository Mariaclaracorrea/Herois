package ArenaDosHerois;

public class Tabuleiro {
    private Personagens[] personagens;
    private int tamanho;
    
    public Tabuleiro(Personagens[] personagens, int tamanho) {
    	this.personagens = personagens;
    	this.tamanho = tamanho;
    }
    public void iniciarJogo() {
    	System.out.println("iniciando o jogo!");
    	for (int i = 0; i < personagens.length; i ++) {
    		personagens[1].mover(i * 2);
    	}
    	exibirTabuleiro();
    }
    public void exibirTabuleiro() {
    	System.out.println("\nPosições no Tabuleiro:");
    	for(Personagens p: personagens) {
    		if(p.getVida() > 0) {
    			System.out.println(p.getNome() + "esta na posicao" + p.getPosicao() + "com" + p.getVida() + "de vida");
    		}
    	}
    	System.out.println();
    }
    public void movimentarPersonagem(Personagens p, int novaPosicao) {
    	if (novaPosicao < 0 || novaPosicao >= tamanho) {
    		System.out.println("Movimento invalido! Fora dos limites do tabuleiro.");
    	}else{
    		p.mover(novaPosicao);
    		exibirTabuleiro();
    	}
    }
    public boolean checarVencedor() {
    	int vivos = 0;
    	Personagens vencedor = null;
    	for(Personagens p : personagens) {
    		if (p.getVida() > 0) {
    			vivos++;
    			vencedor = p;
    		}
    	}
    	if (vivos ==1) {
    		System.out.println("O vencedor é " + vencedor.getNome() + "!");
    		return true;
    	}
    	return false;
    }
}
