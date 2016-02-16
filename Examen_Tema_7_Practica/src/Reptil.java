
public class Reptil extends Animal implements InterfazExamen
{
	private int numPatas;

	public Reptil(String nombre, int edad, int patas)
	{
		super(nombre, edad);
		this.numPatas = patas;
	}

	public int getNumPatas()
	{
		return numPatas;
	}

	public void setNumPatas(int patas) 
	{
		this.numPatas = patas;
	}
	
	@Override
	public boolean equals(Object o)
	{
		boolean res = false;
		
		if(o instanceof Reptil)
		{
			if((super.equals(o)) && (this.getNumPatas()==((Reptil)o).getNumPatas()))
				res = true;
		}
		
		return res;
	}

	@Override
	public String toString() {
		return super.toString() + "Reptil [patas=" + numPatas + "]";
	}
	
}
