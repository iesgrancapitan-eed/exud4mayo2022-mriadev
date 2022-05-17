package com.mca.examen.OptimizacionYDocumentacion;

/**
 * Lanza la excepción si la edad es incorrecta con un mensaje
 * 
 * @author Maria Cervilla Alcalde
 *
 */
public class EdadErroneaException extends Exception {

	/**
	 * Contruye la excepción EdadErroneaException
	 * @param message nuevo mensaje de la excepción
	 */
	public EdadErroneaException(String message) {
		super(message);
	}
}
