package entidades;

public class MaquinaDeVenderLanches {
	private Lanche lanche;
	private double valorTotal;
	
	
	public MaquinaDeVenderLanches(Lanche lanche){
		this.lanche = lanche;
	}
	
	public Lanche getLanche() {
		return lanche;
	}



	public void setLanche(Lanche lanche) {
		this.lanche = lanche;
	}



	public double getValorTotal() {
		return valorTotal;
	}



	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}



	public void venderLanche(double valor){
		if(this.lanche.getPreco() <= valor){
			double precoLanche = this.lanche.getPreco();
			System.out.println("Venda Concluida com Sucesso!");
			double troco = valor - precoLanche;
			System.out.println("Troco: " + troco);
			this.valorTotal = this.valorTotal + precoLanche;
			
		}
		else{
			System.err.println("Saldo insuficiente!");
		}
	}
	
}
