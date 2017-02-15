
public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// creamos una instancia
		Singleton Objeto1 = Singleton.getSingleton();
		Singleton Objeto2 = Singleton.getSingleton();
		Singleton Objeto3 = Singleton.getSingleton();
		Singleton Objeto4 = Singleton.getSingleton();
		Singleton Objeto5 = Singleton.getSingleton();
		Singleton Objeto6 = Singleton.getSingleton();
		Singleton Objeto7 = Singleton.getSingleton();
		Singleton Objeto8 = Singleton.getSingleton();
		Singleton Objeto9 = Singleton.getSingleton();
		Singleton Objeto10 = Singleton.getSingleton();
		if (Objeto1 ==Objeto8 ) {// si esta condicion se cumple
			// significa que el objeto 1 y 8 son el mismo,
			// por lo tanto exite una unica instancia
			Objeto9.Llamados();
		}
		//es mas, todos los objetos son el mismo :D
		if (Objeto1 == Objeto2 && Objeto2 == Objeto3 && Objeto3 == Objeto4 && Objeto4 == Objeto5 && Objeto6 == Objeto7
				&& Objeto7 == Objeto8 && Objeto9 == Objeto10) {
			System.out.println("Todos los objetos de tipo singleton son el mismo :D");
		}
	}
}
