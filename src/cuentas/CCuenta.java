package cuentas;
/**
 * @author Ruben
 * @version 2
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    private Coche coche;

    /**
     * Constructor por defecto que no recibe parámetros.
     * Permite crear un objeto CCuenta vacío
     */
    public CCuenta(Coche coche)
    {
    	this.coche = coche;
    	this.nombre = "Juan";
    }

    /**
     * Constructor que recibe como parámetros todos los atributos del objeto
     * @param nom	Nombre del titular de la cuenta
     * @param cue	Código identificativo de la cuenta bancaria
     * @param sal	Saldo que contiene la cuenta
     * @param tipo	Interés de la cuenta. No se define con la creación del objeto
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /** 
     * @return Retorna el saldo actual de la cuenta bancaria
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * 
     * @param cantidad Cantidad de dinero a ingresar
     * @throws Exception Salta una excepción si se intenta ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * 
     * @param cantidad Cantidad de dinero a retirar de la cuenta
     * @throws Exception Salta una excepción si se intenta retirar una cantidad menor o igual a cero y si la cantidad es mayor que el saldo disponible
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * 
     * @return Retorna el nombre del dueño de la cuenta
     */
	@SuppressWarnings("unused")
	private String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre Método para modificar el nombre del dueño de la cuenta
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return Retorna el código de la cuenta bancaria
	 */
	@SuppressWarnings("unused")
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * 
	 * @param cuenta Método para modificar el código de la cuenta bancaria
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * 
	 * @return Retorna el saldo actual de la cuenta bancaria
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * 
	 * @param saldo Método para modificar el saldo actual de la cuenta bancaria
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * 
	 * @return Retrona el tipo de interés de la cuenta bancaria
	 */
	@SuppressWarnings("unused")
	private double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * 
	 * @param tipoInterés Método para modificar el tipo de interés de la cuenta bancaria
	 */
	@SuppressWarnings("unused")
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
