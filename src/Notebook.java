import java.util.Scanner;

public class Notebook extends Computador {
	int slotsMemoria, numeroSlotsMemoria;	
	Monitor monitor = new Monitor();
	public int getSlotsMemoria() {
		return slotsMemoria;
	}
	public void setSlotsMemoria(int slotsMemoria) {
		this.slotsMemoria = slotsMemoria;
	}
	public int getNumeroSlotsMemoria() {
		return numeroSlotsMemoria;
	}
	public void setNumeroSlotsMemoria(int numeroSlotsMemoria) {
		this.numeroSlotsMemoria = numeroSlotsMemoria;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Notebook () { }
	public Notebook(int slotsMemoria) {		
		setSlotsMemoria(slotsMemoria);	
	}
	public Notebook(int slotsMemoria, int numeroSlotsMemoria) {		
		setSlotsMemoria(slotsMemoria);
		setNumeroSlotsMemoria(numeroSlotsMemoria);	
	}	
	public Notebook(int numeroSlotsMemoria, Monitor monitor) {	
		setNumeroSlotsMemoria(numeroSlotsMemoria);	
		setMonitor(monitor);
	}	
	public Notebook(int slotsMemoria, int numeroSlotsMemoria, Monitor monitor) {		
		setSlotsMemoria(slotsMemoria);
		setNumeroSlotsMemoria(numeroSlotsMemoria);	
		setMonitor(monitor);
	}	
	// Reaproveitamento do método construtor da Superclasse
	public Notebook(String modelo, String marca, double preco, int quantidade, HD hd, Fonte fonte, Memoria memoria, int slotsMemoria, int numeroSlotsMemoria, Monitor monitor) {
		super(modelo, marca, preco, quantidade, hd, fonte, memoria);
		cadastrar(slotsMemoria, numeroSlotsMemoria, monitor);
	}
	public void cadastrar(int slotsMemoria, int numeroSlotsMemoria, Monitor monitor) {		
		setSlotsMemoria(slotsMemoria);
		setNumeroSlotsMemoria(numeroSlotsMemoria);	
		setMonitor(monitor);
	}	
	public void imprimir() {
		// Reaproveitamento do método da SuperClasse
		super.imprimir();
		System.out.println("::: Notebook :::");
		System.out.println("slotsMemoria: " + getSlotsMemoria());	
		System.out.println("numeroSlotsMemoria: " + getNumeroSlotsMemoria());	
		//Reaproveitamento do método da classe agregada
		monitor.imprimir();
	}
	public void entrada() {
		Scanner ent = new Scanner(System.in);
		// Reaproveitamento do método da SuperClasse
		super.entrada();
		System.out.println("::: Notebook :::");
		System.out.println("slotsMemoria: ");
		setSlotsMemoria(Integer.parseInt(ent.nextLine()));
		System.out.println("numeroSlotsMemoria: ");
		setNumeroSlotsMemoria(Integer.parseInt(ent.nextLine()));
		//Reaproveitamento do método da classe agregada
		monitor.entrada();
	}
}
