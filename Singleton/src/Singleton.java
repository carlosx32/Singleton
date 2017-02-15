
public  class Singleton {
	
	static private Singleton singleton=null; //objeto de tipo singletos
	private static int contador;
	
	private Singleton()
	{
		Creado();
	}// el constructor es privado para no poder crear objetos del tipo singleton
	
	static public Singleton getSingleton(){
		if(singleton==null){//este if se encarga de crear una unica instancia para el objeto singleton
			singleton=new Singleton();
		}
		contador++;
		return singleton;
	}
	private void Creado(){
		System.out.println("Se ha creado una instancia");
		
	};
	public void Llamados(){
		System.out.println("Se ha llamado "+contador+" Veces el singleton");
	}
	
	
	

}
