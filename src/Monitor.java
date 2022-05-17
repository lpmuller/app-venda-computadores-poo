import java.util.Scanner;

public class Monitor {
	String tipo, marca;
	int resolucao;
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
	public int getResolucao() {
		return resolucao;
	}
	public void setResolucao(int resolucao) {
		this.resolucao = resolucao;
	}
	public Monitor () { }
	public Monitor(String tipo, String marca) {
		setTipo(tipo);
		setMarca(marca);
	}
	public Monitor(String tipo, int resolucao) {
		setTipo(tipo);
		setResolucao(resolucao);
	}
	public Monitor(String tipo, String marca, int resolucao) {
		setTipo(tipo);
		setMarca(marca);
		setResolucao(resolucao);
	}
	public void cadastrar(String tipo, String marca, int resolucao) {
		setTipo(tipo);
		setMarca(marca);
		setResolucao(resolucao);
	}
	public void imprimir() {
		System.out.println("::: Monitor :::");
		System.out.println("Tipo: " + getTipo());
		System.out.println("Marca: " + getMarca());
		System.out.println("resolucao: " + getResolucao());		
	}
	public void entrada() {
		Scanner ent = new Scanner(System.in);
		System.out.println("::: Monitor :::");
		System.out.println("Tipo:");
		setTipo(ent.nextLine());
		System.out.println("Marca:");
		setMarca(ent.nextLine());		
		System.out.println("Resolucao: ");
		setResolucao(Integer.parseInt(ent.nextLine()));
	}
}
