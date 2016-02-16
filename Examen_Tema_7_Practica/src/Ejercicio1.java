public class Ejercicio1
{
	public static void main(String[] args)
	{
		// Creación de Ovejas
		
		Oveja ov1 = new Oveja("Pepa",3,30,"Juanita","Rizada");
		ov1.setPelo(true);
		
		Oveja ov2 = new Oveja(ov1);
		ov2.setNombre("Dolly");
		ov2.setNombreMadre("Pepa");
		
		Oveja ov3 = new Oveja("Ana",4,32,"Juanita","Lisa");
		
		// Mostrar información de las Ovejas
		
		System.out.print(ov1.toString());
		System.out.printf("El precio de la oveja 1 es: %d\n\n", ov1.precio());
		
		System.out.print(ov2.toString());
		System.out.printf("El precio de la oveja 2 es: %d\n\n", ov2.precio());
		
		System.out.print(ov3.toString());
		System.out.printf("El precio de la oveja 3 es: %d\n\n", ov3.precio());
		
		System.out.printf("SE HAN CREADO %d OVEJAS\n", Oveja.getNumOvejas());
		System.out.printf("SE HAN CREADO %d ANIMALES\n\n", Oveja.getNumAnimales());
		
		
		// Creación de Lagartos
		
		Lagarto lag1 = new Lagarto("Juancho",1,4);
		Lagarto lag2 = new Lagarto("Julian",2,3);
		lag2.setNumPatas(12);  // FALLO DEL PROGRAMADOR. Las patas de un lagarto (no mutante) son 4
		
		// Mostrar informacion de los Lagartos
		System.out.print(lag1.toString());
		System.out.printf("El precio del lagarto 1 es: %d\n\n", lag1.precio());
		
		System.out.print(lag2.toString());
		System.out.printf("El precio del lagarto 2 es: %d\n\n", lag2.precio());
		
		System.out.printf("SE HAN CREADO %d LAGARTOS\n", Lagarto.getNumLagartos());
		System.out.printf("SE HAN CREADO %d ANIMALES\n\n", Lagarto.getNumAnimales());
	}
}
