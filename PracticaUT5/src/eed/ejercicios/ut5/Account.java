/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eed.ejercicios.ut5;

/**
 * Esta clase sirve para...
 * @author Nayra Deniz
 * @version 1.0.1
 * 
 */
public class Account {

	
    public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public String getCcc() {
		return ccc;
	}


	public void setCcc(String ccc) {
		this.ccc = ccc;
	}



	// Atributos de la clase Account
    private String titular;
    private String ccc;
    private double balance = 0;

 
    // Constructor
    public Account (String nom, String cuenta)
    {
        this.titular = nom;
        this.ccc = cuenta;
    }
    
 
    // Método que me devuelve el saldo disponible en cada momento
     public double disponible()
    {
        return balance;
    }

    /** Metodo para ingresar cantidades en la cuenta. Modifica el saldo.
     * Lanza una excepcion cuando intentas retirar un importe negativo
     * @params cantidad: importe a ingresar con dos decimales
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        balance = balance + cantidad;
    }



	public void setBalance(double balance) {
		this.balance = balance;
	}


	/** Metodo para retirar cantidades en la cuenta. Modifica el saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad < 0)
            throw new Exception ("No se puede retirar una cantidad negativa.");
        if (disponible()< cantidad)
            throw new Exception ("No hay suficiente saldo para retirar la cantidad solicitada.");
        balance = balance - cantidad;
    }

 
}
