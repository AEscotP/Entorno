
public class Oveja extends Mamifero implements InterfazExamen
{
	static private int numOvejas;
	private String lana;
	
	static
	{
		numOvejas = 0;
	}

	public Oveja(String nombre, int edad, int talla, String nombreMadre, String lana) 
	{
		super(nombre, edad, talla, nombreMadre);
		this.lana = lana;
		numOvejas ++;
	}
	
	public Oveja(Oveja ov)
	{
		super(ov.getNombre(),ov.getEdad(),ov.getTalla(),ov.getNombreMadre());
		this.lana = ov.lana;
		numOvejas ++;
	}

	public String getLana() 
	{
		return lana;
	}

	public void setLana(String lana) 
	{
		this.lana = lana;
	}

	public static int getNumOvejas() 
	{
		return numOvejas;
	}
	
	@Override
	public int precio()
	{
		return (super.precio()+(2*super.getTalla()));
	}
	
	@Override
	public boolean equals(Object o)
	{
		boolean res = false;
		
		if(o instanceof Oveja)
		{
			if((super.equals(o)) && (this.getLana().compareTo(((Oveja)o).getLana())==0))
				res = true;
		}
		
		return res;
	}

	@Override
	public String toString() {
		return super.toString() + "Oveja [lana=" + lana + "]";
	}
	
}
