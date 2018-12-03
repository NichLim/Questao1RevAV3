package entidades;

public class Lanche {

		private String nome;
		private double preco;

		public Lanche(){
			
		}
		
		public Lanche(String nome, double preco) {
			super();
			this.nome = nome;
			this.preco = preco;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		@Override
		public String toString() {
			return "Lanche [nome=" + nome + ", preco=" + preco + "]";
		}
		
		
		
		
}
