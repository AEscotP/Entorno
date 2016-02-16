
public class Lagarto extends Reptil implements InterfazExamen
{
	static private int numLagartos;
	
	static
	{
		numLagartos = 0;
	}
	
	public Lagarto(String nombre, int edad, int talla)
	{
		super(nombre, edad,4);
		this.setTalla(talla);
		numLagartos ++;
	}

	public static int getNumLagartos() 
	{
		return numLagartos;
	}
	
	@Override
	public int precio()
	{
		return (super.precio() + (3*super.getTalla()));
	}
	
	@Override
	public boolean equals(Object o)
	{
		boolean res = false;
		
		if(o instanceof Lagarto)
		{
			if(super.equals(o))
				res = true;
		}
		
		return res;
	}
	
}
