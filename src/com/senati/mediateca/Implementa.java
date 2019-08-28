package com.senati.mediateca;
import java.util.Set;
import java.util.HashSet;
public class Implementa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socio socio1 = new Socio();
		socio1.id=100;
		socio1.nombre="Jorge Antonio";
		socio1.apellidos="Luque Chambi";
		socio1.distrito="Los Olivos";
		
		Socio socio2 = new Socio();
		socio2.id=102;
		socio2.nombre="Esther";
		socio2.apellidos="Aquino";
		socio2.distrito="Los Olivos";
		
		System.out.println(socio1.toString());
		System.out.println(socio2.toString());
		
		Socio socio3 = new Socio(103,"Alicia","Gomez Avalos","Comas");
		System.out.println(socio3.toString());
		
		System.out.println("Lista de Socios");
		
		Socio soc1 = new Socio(104,"Jorge","Luque","Comas");
		Socio soc2 = new Socio(105,"Maria"," Luna","Comas");
		Socio soc3 = new Socio(106,"Gerardo"," Luque","Comas");
		Socio soc4 = new Socio(107,"Alex","Lopez","Comas");
		Socio soc5 = new Socio(108,"Alex","Lopez","Comas");
		
		Set <Socio> sociosinscritos = new HashSet<Socio>();
		
		sociosinscritos.add(soc1);
		sociosinscritos.add(soc2);
		sociosinscritos.add(soc3);
		sociosinscritos.add(soc4);
		sociosinscritos.add(soc5);
		
		for (Socio socio : sociosinscritos) {
			System.out.println(socio.id + " " + socio.nombre + " " + socio.apellidos + " " + socio.distrito);
		}
		
		////////////////
		
		Libros libros1 = new Libros(10,"matalache", "mario vargas", 100, 150,122);
		System.out.println(libros1.toString());
		
		Libros libros2 = new Libros(11,"sangre de campeon", "paulo", 10, 200,992);
		System.out.println(libros2.toString());
		
		System.out.println("Lista de Libros");
		
		Libros lib1 = new Libros(12,"sangre de campeon", "paulo", 10, 200,992);
		Libros lib2 = new Libros(13,"sangre de campeon", "paulo", 10, 200,992);
		Libros lib3 = new Libros(14,"sangre de campeon", "paulo", 10, 200,992);
		Libros lib4 = new Libros(15,"sangre de campeon", "paulo", 10, 200,992);
		Libros lib5 = new Libros(16,"sangre de campeon", "paulo", 10, 200,992);
		
		Set <Libros> librosvendidos = new HashSet<Libros>();
		
		librosvendidos.add(lib1);
		librosvendidos.add(lib2);
		librosvendidos.add(lib3);
		librosvendidos.add(lib4);
		librosvendidos.add(lib5);
		
		byte contador=0;
		float preciototal=0f;
		for (Libros libros : librosvendidos) {
			System.out.println(libros.id + " " + libros.titulo + " " + libros.autor + " " + libros.precio + " " + libros.nropag + " " + libros.nroisbn);
			contador++;
			preciototal = preciototal + libros.precio;
		}
		System.out.println("Libros prestados" + contador);
		System.out.println("Monto acumulado" + preciototal);
		
		////////////////
		
		Cintavideo cintavideo1 = new Cintavideo(02,"poseidon", "juan", 80, "gerardo", 98);
		System.out.println(cintavideo1.toString());
		
		Cintavideo cintavideo2 = new Cintavideo(03,"poseidon", "juan", 80, "gerardo", 99);
		System.out.println(cintavideo2.toString());
		
		////////////////
		
		System.out.println("Lista de Cintavideo");
		
		Cintavideo cint1 = new Cintavideo(04,"poseidon", "juan", 80, "gerardo", 992);
		Cintavideo cint2 = new Cintavideo(05,"poseidon", "luis", 80, "gerardo", 992);
		Cintavideo cint3 = new Cintavideo(06,"poseidon", "carlos", 80, "gerardo", 992);
		Cintavideo cint4 = new Cintavideo(07,"poseidon", "lolo", 80, "gerardo", 992);

		Set <Cintavideo> cintavideovistas = new HashSet<Cintavideo>();
		
		cintavideovistas.add(cint1);
		cintavideovistas.add(cint2);
		cintavideovistas.add(cint3);
		cintavideovistas.add(cint4);
		
		for (Cintavideo cintavideo : cintavideovistas) {
			System.out.println(cintavideo.id + " " + cintavideo.titulo + " " + cintavideo.autor + " " + cintavideo.precio + " " + cintavideo.actores + " " + cintavideo.duracion);
		}
		
}
}
