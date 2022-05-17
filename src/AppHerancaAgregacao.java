public class AppHerancaAgregacao {

	public static void main(String[] args) {
		System.out.println("Servidor 1");
		Servidor servidor1 = new Servidor();
		servidor1.entrada();
		servidor1.imprimir();
		
		System.out.println("Notebook 1");
		Notebook notebook1 = new Notebook();
		notebook1.entrada();
		notebook1.imprimir();

		System.out.println("Desktop 1");
		Desktop desktop1 = new Desktop();
		desktop1.entrada();
		desktop1.imprimir();
		
		System.out.println("Servidor 2");
		Servidor servidor2 = new Servidor();
		servidor2.entrada();
		servidor2.imprimir();
		
		System.out.println("Notebook 2");
		Notebook notebook2 = new Notebook();
		notebook2.entrada();
		notebook2.imprimir();

		System.out.println("Desktop 2");
		Desktop desktop2 = new Desktop();
		desktop2.entrada();
		desktop2.imprimir();
		
		System.out.println("Servidor 3");
		Servidor servidor3 = new Servidor();
		servidor3.entrada();
		servidor3.imprimir();
		
		System.out.println("Notebook 3");
		Notebook notebook3 = new Notebook();
		notebook3.entrada();
		notebook3.imprimir();

		System.out.println("Desktop 3");
		Desktop desktop3 = new Desktop();
		desktop3.entrada();
		desktop3.imprimir();
	}

}
