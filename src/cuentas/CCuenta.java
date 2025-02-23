package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * Permite realizar operaciones básicas como ingresar y retirar dinero.
 */
public class CCuenta {

	private String nombre;	// Nombre del titular de la cuenta
    private String cuenta;	// Número de cuenta
    private double saldo;	// Saldo actual de la cuenta
    private double tipoInterés;	// Tipo de interés aplicado a la cuenta

    /**
     * Constructor por defecto de la clase CCuenta.
     */
	public CCuenta() {
	}

    /**
     * Constructor con parámetros para inicializar una cuenta.
     *
     * @param nom  Nombre del titular de la cuenta.
     * @param cue  Número de cuenta.
     * @param sal  Saldo inicial de la cuenta.
     * @param tipo Tipo de interés aplicado.
     */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		this.nombre = nom;
		this.cuenta = cue;
		this.saldo = sal;
	}

	// Setters
	/**
     * Fija el valor del atributo
     *
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
     * Fija el valor del atributo
     *
     */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
     * Fija el valor del atributo
     *
     */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
     * Fija el valor del atributo
     *
     */
	public void settipoInteres(double tipo) {
		this.tipoInterés = tipo;
	}

	// Getters
	/**
	 * Obtiene el valor del atributo
	 * 
	 * @return el atributo
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Obtiene el valor del atributo
	 * 
	 * @return el atributo
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * Obtiene el valor del atributo
	 * 
	 * @return el atributo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Obtiene el valor del atributo
	 * 
	 * @return el atributo
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}
	
	/**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return Saldo actual de la cuenta.
     */
	public double estado() {
		return saldo;
	}

	/**
     * Ingresa una cantidad de dinero en la cuenta.
     *
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
     * Retira una cantidad de dinero de la cuenta.
     *
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo.
     */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
}
