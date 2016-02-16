
public class Mamifero extends Animal implements InterfazExamen
{
	static private int suplemento;
	private String nombreMadre;
	private boolean pelo;
	
	static
	{
		suplemento = 5;
	}
	
	public Mamifero(String nombre, int edad, int talla , String nombreMadre) 
	{
		super(nombre, edad);
		this.setTalla(talla);
		this.nombreMadre = nombreMadre;
	}

	public static int getSuplemento() 
	{
		return suplemento;
	}

	public static void setSuplemento(int suplemento) 
	{
		Mamifero.suplemento = suplemento;
	}

	public String getNombreMadre() 
	{
		return nombreMadre;
	}

	public void setNombreMadre(String nombreMadre) 
	{
		this.nombreMadre = nombreMadre;
	}

	public boolean getPelo() 
	{
		return pelo;
	}

	public void setPelo(boolean pelo) 
	{
		this.pelo = pelo;
	}
	
	@Override
	public int precio()
	{
		return super.precio()+suplemento;
	}
	
	@Override
	public boolean equals(Object o)
	{
		boolean res = false;
		
		if(o instanceof Mamifero)
		{
			if((super.equals(o)) && (this.getNombreMadre().compareTo(((Mamifero)o).getNombreMadre())==0) && (this.getPelo()==((Mamifero)o).getPelo()))
			{
				res = true;
			}
		}
		
		return res;
	}

	@Override
	public String toString() {
		return super.toString() + "Mamifero [nombreMadre=" + nombreMadre + ", pelo=" + pelo + "]";
	}
	
}
