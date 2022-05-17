import java.util.Scanner;

public class Memoria {
	String tipo, marca;
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
	public Memoria () { }	
	public Memoria(String tipo, String marca) {
		setTipo(tipo);
		setMarca(marca);
	}
	public void cadastrar(String tipo, String marca) {
		setTipo(tipo);
		setMarca(marca);
	}
	public void imprimir() {
		System.out.println("::: Memoria :::");
		System.out.println("Tipo: " + getTipo());
		System.out.println("Marca: " + getMarca());	
	}
	public void entrada() {
		Scanner ent = new Scanner(System.in);
		System.out.println("::: Memoria :::");
		System.out.println("Tipo:");
		setTipo(ent.nextLine());
		System.out.println("Marca:");
		setMarca(ent.nextLine());	
	}
}
