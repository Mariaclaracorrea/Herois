package ArenaDosHerois;

public class Mago extends Personagens {
	private int mana;
	
	public Mago(String nome) {
		super(nome, 100, 25); // Menos vida, ataque magico moderado
	}
	@Override
	public void atacar(Personagens oponente) {
		if(mana >=10) {
			oponente.receberDano(this.getDanoBase() + 15); // causa dano extra com magia
			mana -=10;
			System.out.println(getNome() + "lançou um feitiço em " + oponente.getNome() + "à distância.");
		}else{
			System.out.println(getNome() + "não tem mana suficiente para atacar!");
			
		}
	}
	
	

}
