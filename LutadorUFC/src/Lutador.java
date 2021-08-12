
public class Lutador {
	private String nome, nacionalidade, categoria; 
	private double altura, peso;
	private int idade, vitorias, derrotas, empates;
	
//Metodos personalizados
	public void apresentar() {
		System.out.println("---------------------------------");
		System.out.println("Lutador: "+ this.getNome());
		System.out.println("Origem: "+ this.getNacionalidade());
		System.out.println(this.getIdade()+ " anos");
		System.out.println(this.getAltura()+ "cm de altura");
		System.out.println("Pesando : "+ this.getPeso());
		System.out.println("Ganhou : "+ this.getVitorias());
		System.out.println("Perdeu : "+ this.getDerrotas());
		System.out.println("Empatou : "+ this.getEmpates());
		
	}
	public void status() {
		System.out.println("---------------------------------");
		System.out.println(this.getNome());
		System.out.println("É um peso: " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + " vezes");
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
	}
	
//Construtor
	public Lutador(String no, String na, int ida, double alt, double pe, int vi, int de, int emp) {
		this.setNome(no);
		this.setNacionalidade(na);
		this.setIdade(ida);
		this.setAltura(alt);
		this.setPeso(pe);
		this.setVitorias(vi);
		this.setDerrotas(de);
		this.setEmpates(emp);		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String no) {
		this.nome = no;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String na) {
		this.nacionalidade = na;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int ida) {
		this.idade = ida;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double alt) {
		this.altura = alt;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double pe) {
		this.peso = pe;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.peso < 52.2){
			this.categoria = "Categoria inválida";
		}
		else if(this.peso <= 70.2) { 
			this.categoria = "Peso leve";
		}
		else if(this.peso <= 84.2) {
			this.categoria = "Peso médio";
		}
		else if (this.peso <= 120.2) {
			this.categoria = "Peso pesado";
		}
		else {
			this.categoria = "Categoria inválida";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vi) {
		this.vitorias = vi;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int de) {
		this.derrotas = de;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int emp) {
		this.empates = emp;
	}
	
	
}
