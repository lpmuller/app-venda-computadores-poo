import java.util.Scanner;

public class HD {
	String tipo, marca;
	int capacidade;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
			this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public HD () { }
	public HD(String tipo, String marca) {
		setTipo(tipo);
		setMarca(marca);
	}
	public HD(String tipo, int capacidade) {
		setTipo(tipo);
		setCapacidade(capacidade);
	}
	public HD(String tipo, String marca, int capacidade) {
		setTipo(tipo);
		setMarca(marca);
		setCapacidade(capacidade);
	}
	public void cadastrar(String tipo, String marca, int capacidade) {
		setTipo(tipo);
		setMarca(marca);
		setCapacidade(capacidade);
	}
	public void imprimir() {
		System.out.println("::: HD :::");
		System.out.println("Tipo: " + getTipo());
		System.out.println("Marca: " + getMarca());
		System.out.println("Capacidade: " + getCapacidade());		
	}
	public void entrada() {
		Scanner ent = new Scanner(System.in);
		System.out.println("::: HD :::");
		System.out.println("Tipo:");
		setTipo(ent.nextLine());
		System.out.println("Marca:");
		setMarca(ent.nextLine());		
		System.out.println("Capacidade: ");
		setCapacidade(Integer.parseInt(ent.nextLine()));
	}
}
