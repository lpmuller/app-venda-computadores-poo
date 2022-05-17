import java.util.Scanner;

public class Servidor extends Computador {
	String tipoGabinete, marcaGabinete;
	int numeroHD, slotsMemoria, capacidadeMemoria;
	public String getTipoGabinete() {
		return tipoGabinete;
	}
	public void setTipoGabinete(String tipoGabinete) {
			this.tipoGabinete = tipoGabinete;
	}
	public String getMarcaGabinete() {
		return marcaGabinete;
	}
	public void setMarcaGabinete(String marcaGabinete) {
		this.marcaGabinete = marcaGabinete;
	}
	public int getNumeroHD() {
		return numeroHD;
	}
	public void setNumeroHD(int numeroHD) {
		this.numeroHD = numeroHD;
	}
	public int getSlotsMemoria() {
		return slotsMemoria;
	}
	public void setSlotsMemoria(int slotsMemoria) {
		this.slotsMemoria = slotsMemoria;
	}
	public int getCapacidadeMemoria() {
		return capacidadeMemoria;
	}
	public void setCapacidadeMemoria(int capacidadeMemoria) {
		this.capacidadeMemoria = capacidadeMemoria;
	}
	public Servidor () { }
	public Servidor(String tipoGabinete, String marcaGabinete) {
		setTipoGabinete(tipoGabinete);
		setMarcaGabinete(marcaGabinete);
	}
	public Servidor(String tipoGabinete, int numeroHD) {
		setTipoGabinete(tipoGabinete);
		setNumeroHD(numeroHD);
	}
	public Servidor(int numeroHD, int slotsMemoria, int capacidadeMemoria) {		
		setNumeroHD(numeroHD);
		setSlotsMemoria(slotsMemoria);
		setCapacidadeMemoria(capacidadeMemoria);		
	}	
	public Servidor(String tipoGabinete, String marcaGabinete, int numeroHD, int slotsMemoria, int capacidadeMemoria) {
		setTipoGabinete(tipoGabinete);
		setMarcaGabinete(marcaGabinete);
		setNumeroHD(numeroHD);
		setSlotsMemoria(slotsMemoria);
		setCapacidadeMemoria(capacidadeMemoria);		
	}
	// Reaproveitamento do método construtor da Superclasse
	public Servidor(String modelo, String marca, double preco, int quantidade, HD hd, Fonte fonte, Memoria memoria, String tipoGabinete, String marcaGabinete, int numeroHD, int slotsMemoria, int capacidadeMemoria) {
		super(modelo, marca, preco, quantidade, hd, fonte, memoria);
		cadastrar(tipoGabinete, marcaGabinete, numeroHD, slotsMemoria, capacidadeMemoria);
	}
	public void cadastrar(String tipoGabinete, String marcaGabinete, int numeroHD, int slotsMemoria, int capacidadeMemoria) {
		setTipoGabinete(tipoGabinete);
		setMarcaGabinete(marcaGabinete);
		setNumeroHD(numeroHD);
		setSlotsMemoria(slotsMemoria);
		setCapacidadeMemoria(capacidadeMemoria);		
	}
	public void imprimir() {
		// Reaproveitamento do método da SuperClasse
		super.imprimir();
		System.out.println("::: Servidor :::");
		System.out.println("tipoGabinete: " + getTipoGabinete());
		System.out.println("marcaGabinete: " + getMarcaGabinete());
		System.out.println("numeroHD: " + getNumeroHD());	
		System.out.println("slotsMemoria: " + getSlotsMemoria());	
		System.out.println("capacidadeMemoria: " + getCapacidadeMemoria());	
	}
	public void entrada() {
		Scanner ent = new Scanner(System.in);
		// Reaproveitamento do método da SuperClasse
		super.entrada();
		System.out.println("::: Servidor :::");
		System.out.println("tipoGabinete:");
		setTipoGabinete(ent.nextLine());
		System.out.println("marcaGabinete:");
		setMarcaGabinete(ent.nextLine());		
		System.out.println("numeroHD: ");
		setNumeroHD(Integer.parseInt(ent.nextLine()));
		System.out.println("slotsMemoria: ");
		setSlotsMemoria(Integer.parseInt(ent.nextLine()));
		System.out.println("capacidadeMemoria: ");
		setCapacidadeMemoria(Integer.parseInt(ent.nextLine()));
	}
}
