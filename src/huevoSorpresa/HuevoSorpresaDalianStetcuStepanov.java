package huevoSorpresa;

/**
 * Clase que sirve para la creación de instancias de tipo HuevoSorpresa
 *
 * @author Dalian Stetcu Stepanov
 * @version 1
 */
public class HuevoSorpresaDalianStetcuStepanov {

	private int unidades;//número de huevos que quedan 
	private double precio;//precio actual de un huevo sorpresa
	private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
	private double precio_max;//precio máximo que puede tener un huevo sorpresa

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getSorpresa() {
		return sorpresa;
	}

	public void setSorpresa(String sorpresa) {
		this.sorpresa = sorpresa;
	}

	public double getPrecio_max() {
		return precio_max;
	}

	public void setPrecio_max(double precio_max) {
		this.precio_max = precio_max;
	}

	/**
	 * Constructor sin parametros que crea una instancia de HuevoSorpresa sin
	 * variables
	 */
	public HuevoSorpresaDalianStetcuStepanov() {
	}

	/**
	 * Constructor que crea una instancia de HuevoSorpresa con los parámetros
	 * que se pasan
	 *
	 * @param unidades Introducción como parámetro de las unidades de
	 * HuevoSorpresa
	 * @param precio Introducción como parámetro del precio del HuevoSorpresa
	 * @param sorpresa Introducción como parámetro de la sorpresa que lleva el
	 * HuevoSorpresa
	 * @param precio_max Introducción como parámetro del precio máximo que puede
	 * valer un HuevoSorpresa
	 */
	public HuevoSorpresaDalianStetcuStepanov(int unidades, double precio, String sorpresa, double precio_max) {
		this.unidades = unidades;
		this.precio = precio;
		this.sorpresa = sorpresa;
		this.precio_max = precio_max;
	}

	/**
	 * Método devuelve las unidades que hay
	 *
	 * @return Devuelve las unidades de HuevoSorpresa
	 */
	public int obtenerUnidades() {
		return this.unidades;
	}

	/**
	 * Método que devuelve el precio
	 *
	 * @return Devuelve el precio del HuevoSorpresa
	 */
	public double obtenerPrecio() {
		return this.precio;
	}

	/**
	 * Método que sirve para modificar las unidades que hay de HuevoSorpresa
	 *
	 * @param unidades Introducción como parámetro de las unidades de
	 * HuevoSorpresa
	 */
	public void modificarUnidades(int unidades) {
		this.unidades = unidades;
	}

	/**
	 * Método que sirve para sacar HuevosSorpresa,
	 *
	 * @param unidades Introducción como parámetro de las unidades que queremos
	 * sacar
	 * @param dinero Introducción como parámetro del dinero que tenemos para
	 * sacar HuevosSorpresa
	 * @param sorpresa Introducción como parámetro de la sorpresa
	 * @throws Exception Se lanzan excepciones de tipo "Exception" si la
	 * cantidad de dinero es negativa, el dinero no es suficiente, la cantidad
	 * de HuevosSorpresa es negativa o si no hay suficientes HuevosSorpresa en
	 * la tienda
	 */
	public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresa) throws Exception {
		if (dinero <= 0) {
			throw new Exception("Se necesita una cantidad de dinero positiva");
		}
		if (dinero < (unidades * precio)) {
			throw new Exception("No tiene suficiente dinero");
		}
		if (unidades <= 0) {
			throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
		}
		if (this.unidades < unidades) {
			throw new Exception("No hay suficientes huevos sorpresa en la tienda");
		}
		this.modificarUnidades(this.obtenerUnidades() - unidades);
	}

	public void aumentarPrecio(double aumento) throws Exception {
		if (aumento <= 0) {
			throw new Exception("El aumento debe ser positivo");
		}
		if (precio_max < precio + aumento) {
			throw new Exception("No se puede superar el precio máximo");
		}
		precio = precio + aumento;
	}
}
