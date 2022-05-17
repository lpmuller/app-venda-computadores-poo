import java.util.Scanner;

public class Computador {
	String modelo, marca;
	double preco;
	int quantidade;
	HD hd = new HD();
	Fonte fonte = new Fonte();
	Memoria memoria = new Memoria();
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
			this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public HD getHD() {
		return hd;
	}
	public void setHD(HD hd) {
		this.hd = hd;
	}
	public Fonte getFonte() {
		return fonte;
	}
	public void setFonte(Fonte fonte) {
		this.fonte = fonte;
	}
	public Memoria getMemoria() {
		return memoria;
	}
	public void setMemoria(Memoria memoria) {
		this.memoria = memoria;
	}
	public Computador () { }
	public Computador(String modelo, String marca) {
		setModelo(modelo);
		setMarca(marca);
	}
	public Computador(String modelo, int quantidade) {
		setModelo(modelo);
		setQuantidade(quantidade);
	}
	public Computador(String modelo, String marca, int quantidade) {
		setModelo(modelo);
		setMarca(marca);
		setQuantidade(quantidade);
	}
	public Computador(String modelo, String marca, double preco) {
		setModelo(modelo);
		setMarca(marca);
		setPreco(preco);
	}
	public Computador(String modelo, String marca, double preco, int quantidade, HD hd, Fonte fonte, Memoria memoria) {
		setModelo(modelo);
		setMarca(marca);
		setPreco(preco);
		setQuantidade(quantidade);
		setHD(hd);
		setFonte(fonte);
		setMemoria(memoria);
	}
	public void cadastrar(String modelo, String marca, double preco, int quantidade, HD hd, Fonte fonte, Memoria memoria) {
		setModelo(modelo);
		setMarca(marca);
		setPreco(preco);
		setQuantidade(quantidade);
		setHD(hd);
		setFonte(fonte);
		setMemoria(memoria);
	}
	public void imprimir() {
		System.out.println("::: Computador :::");
		System.out.println("Modelo: " + getModelo());
		System.out.println("Marca: " + getMarca());
		System.out.println("Preco: " + getPreco());
		System.out.println("Quantidade: " + getQuantidade());
		//Reaproveitamento do método das classes agregadas
		hd.imprimir();
		fonte.imprimir();
		memoria.imprimir();
	}
	public void entrada() {
		Scanner ent = new Scanner(System.in);
		System.out.println("::: Computador :::");
		System.out.println("Modelo:");
		setModelo(ent.nextLine());
		System.out.println("Marca:");
		setMarca(ent.nextLine());
		System.out.println("Preco :");
		setPreco(Double.parseDouble(ent.nextLine()));
		System.out.println("Quantidade: ");
		setQuantidade(Integer.parseInt(ent.nextLine()));
		//Reaproveitamento do método das classes agregadas
		hd.entrada();
		fonte.entrada();
		memoria.entrada();
	}
}
