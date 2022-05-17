import java.util.Scanner;

public class Fonte {
	String tipo, marca;
	int potencia;
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
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public Fonte () { }
	public Fonte(String tipo, String marca) {
		setTipo(tipo);
		setMarca(marca);
	}
	public Fonte(String tipo, int potencia) {
		setTipo(tipo);
		setPotencia(potencia);
	}
	public Fonte(String tipo, String marca, int potencia) {
		setTipo(tipo);
		setMarca(marca);
		setPotencia(potencia);
	}
	public void cadastrar(String tipo, String marca, int potencia) {
		setTipo(tipo);
		setMarca(marca);
		setPotencia(potencia);
	}
	public void imprimir() {
		System.out.println("::: Fonte :::");
		System.out.println("Tipo: " + getTipo());
		System.out.println("Marca: " + getMarca());
		System.out.println("potencia: " + getPotencia());		
	}
	public void entrada() {
		Scanner ent = new Scanner(System.in);
		System.out.println("::: Fonte :::");
		System.out.println("Tipo:");
		setTipo(ent.nextLine());
		System.out.println("Marca:");
		setMarca(ent.nextLine());		
		System.out.println("Potencia: ");
		setPotencia(Integer.parseInt(ent.nextLine()));
	}
}

