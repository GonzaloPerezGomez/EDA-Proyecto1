import java.util.*;

public class ActoresyPeliculas {

	public static void main(String[] args) {
		
		int opcion;
		static Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("---ELIJA UNA FUNCIONALIDAD---")
			System.out.println("1.Cargar los datos desde los archivos");
			System.out.println("2.Buscar un actor/actriz");
			System.out.println("3.Insertar un nuevo actor/actriz");
			System.out.println("4.Modificar el año de estreno de una película");
			System.out.println("5.Borrar un actor/actriz");
			System.out.println("6.Guardar la lista en un fichero");
			System.out.println("7.Obtener una lista ordenada de actores");
			System.out.println("8.Salir");

			
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
			}while(opcion != 8);
			
		}

	}

}
