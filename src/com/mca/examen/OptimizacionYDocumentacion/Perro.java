package com.mca.examen.OptimizacionYDocumentacion;

/**
 * La clase Perro representa a un perro con un nombre y edad que ladra
 * 
 * @author Maria Cervilla Alcalde
 *
 */
public class Perro extends Mascota {
	/**
	 * Ladrido del perro
	 */
	private static final String GUAUUUUUUUUUU = "GUAUUUUUUUUUU";
	/**
	 * Edad del perro
	 */
	private int age;
	/**
	 * Crea un perro nuevo
	 * @param name nuevo nombre del perro
	 * @param age nueva edad del perro
	 * @throws EdadErroneaException si la edad del perro es incorrecta
	 */
	public Perro(String name, int age) throws EdadErroneaException {
		super();
		setAge(age);
		this.name = name;
	}

	public void setAge(int age) throws EdadErroneaException {
		if (age < 0)
			throw new EdadErroneaException("La edad no puede ser negativa");
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public String ladrar() {
		return GUAUUUUUUUUUU;
	}

}
