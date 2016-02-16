
public class Animal implements InterfazExamen
{
	static private int precio;
	static private int numAnimales;
	private String nombre;
	private int edad, talla;
	
	static
	{
		precio = 15;
	}

	public Animal(String nombre, int edad) 
	{
		this.nombre = nombre;
		this.edad = edad;
		numAnimales ++;
	}

	public static int getPrecio() 
	{
		return precio;
	}

	public static void setPrecio(int precio) 
	{
		Animal.precio = precio;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public int getEdad() 
	{
		return edad;
	}

	public void setEdad(int edad) 
	{
		this.edad = edad;
	}

	public int getTalla() 
	{
		return talla;
	}

	public void setTalla(int talla) 
	{
		this.talla = talla;
	}
	
	public static int getNumAnimales() 
	{
		return numAnimales;
	}

	public int precio()
	{
		return precio;
	}
	
	public boolean equals(Object o)
	{
		boolean res = false;
		
		if(o instanceof Animal)
		{
			if((this.getNombre().compareTo(((Animal)o).getNombre())==0) && (this.getEdad()==((Animal) o).getEdad()) && (this.getTalla()==((Animal)o).getTalla()))
			{
				res = true;
			}
		}
		
		return res;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", edad=" + edad + ", talla=" + talla + "]";
	}
	
}
