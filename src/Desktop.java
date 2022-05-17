import java.util.Scanner;

public class Desktop extends Computador {
	String marcaPlacaVideo;
	int placasVideo, numeroSlotsMemoria;
	Monitor monitor = new Monitor();
	public String getMarcaPlacaVideo() {
		return marcaPlacaVideo;
	}
	public void setMarcaPlacaVideo(String marcaPlacaVideo) {
		this.marcaPlacaVideo = marcaPlacaVideo;
	}
	public int getPlacasVideo() {
		return placasVideo;
	}
	public void setPlacasVideo(int placasVideo) {
		this.placasVideo = placasVideo;
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
	public Desktop () { }
	public Desktop(String marcaPlacaVideo) {
		setMarcaPlacaVideo(marcaPlacaVideo);
	}
	public Desktop(int placasVideo) {
		setPlacasVideo(placasVideo);
	}
	public Desktop(int placasVideo, int numeroSlotsMemoria) {		
		setPlacasVideo(placasVideo);
		setNumeroSlotsMemoria(numeroSlotsMemoria);		
	}	
	public Desktop(String marcaPlacaVideo, int placasVideo, int numeroSlotsMemoria, Monitor monitor) {
		setMarcaPlacaVideo(marcaPlacaVideo);
		setPlacasVideo(placasVideo);
		setNumeroSlotsMemoria(numeroSlotsMemoria);
		setMonitor(monitor);
	}
	// Reaproveitamento do método construtor da Superclasse
	public Desktop(String modelo, String marca, double preco, int quantidade, HD hd, Fonte fonte, Memoria memoria, String marcaPlacaVideo, int placasVideo, int numeroSlotsMemoria, Monitor monitor) {
		super(modelo, marca, preco, quantidade, hd, fonte, memoria);
		cadastrar(marcaPlacaVideo, placasVideo, numeroSlotsMemoria, monitor);
	}
	public void cadastrar(String marcaPlacaVideo, int placasVideo, int numeroSlotsMemoria, Monitor monitor) {
		setMarcaPlacaVideo(marcaPlacaVideo);
		setPlacasVideo(placasVideo);
		setNumeroSlotsMemoria(numeroSlotsMemoria);	
		setMonitor(monitor);
	}
	public void imprimir() {
		// Reaproveitamento do método da SuperClasse
		super.imprimir();
		System.out.println("::: Desktop :::");
		System.out.println("marcaPlacaVideo: " + getMarcaPlacaVideo());
		System.out.println("placasVideo: " + getPlacasVideo());		
		System.out.println("numeroSlotsMemoria: " + getNumeroSlotsMemoria());
		//Reaproveitamento do método da classe agregada
		monitor.imprimir();
	}
	public void entrada() {
		Scanner ent = new Scanner(System.in);
		// Reaproveitamento do método da SuperClasse
		super.entrada();
		System.out.println("::: Desktop :::");
		System.out.println("marcaPlacaVideo:");
		setMarcaPlacaVideo(ent.nextLine());		
		System.out.println("placasVideo: ");
		setPlacasVideo(Integer.parseInt(ent.nextLine()));
		System.out.println("numeroSlotsMemoria: ");
		setNumeroSlotsMemoria(Integer.parseInt(ent.nextLine()));
		//Reaproveitamento do método da classe agregada
		monitor.entrada();
	}
}
