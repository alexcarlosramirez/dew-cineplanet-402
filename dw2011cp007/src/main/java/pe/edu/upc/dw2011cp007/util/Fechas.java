/*
 * @(#) Fechas.java 25/08/2009
 */

package pe.edu.upc.dw2011cp007.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * <span class="clase public">
 * Utilitario para acelerar el trabajo con fechas.
 * Provee de metodos para converci&oacute;n de cadena a fecha y obtener fecha
 * del sistema en cadena con formato. seg&uacute;n un formato obtenido desde los
 * archivos properties. Adem&aacute;s, posee m&eacute;todos para restar fechas
 * en las aproximaciones de d&iacute;a, hora y minutos.
 * </span>
 * 
 * @author Alexander Ramirez Ruiz
 */
@SuppressWarnings("serial")
public class Fechas extends Date {

	/**
	 * <span class="variable public static final">
	 * Bandera para usar aproxima&oacute;n a d&iacute;as.
	 * </span>
	 */
	public static final int d = 2;

	/**
	 * <span class="variable public static final">
	 * Bandera para usar aproxima&oacute;n a horas.
	 * </span>
	 */
	public static final int H = 1;

	/**
	 * <span class="variable public static final">
	 * Bandera para usar aproxima&oacute;n a minutos.
	 * </span>
	 */
	public static final int mm = 0;

	public Fechas() {
		super();
	}

	public Fechas(Date date) {
		this(date.getTime());
	}

	public Fechas(long time) {
		super(time);
	}

	public Fechas(String fecha) {
		this(parseDate(fecha));
	}

	public Fechas(String fecha, String formato) {
		this(parseDate(formato, fecha));
	}

	//METODOS PARA LA FECHA PROPIA =============================================
	/**
	 * <span class="funcion public">
	 * Retorna la cadena de la fecha con el formato especificado.
	 * </span>
	 * @return fecha del sistema
	 */
	public String getFormato(String format) {
		SimpleDateFormat formatoFecha = new SimpleDateFormat(format);
		return formatoFecha.format(this);
	}

	/**
	 * <span class="funcion public">
	 * Aumenta var según modo (constantes de la clase {@link Calendar}).
	 * </span>
	 * 
	 * @param var - Cantidad a agregar
	 * @param modo - El campo del calendario ({@link Calendar})
	 * @return
	 */
	public Fechas agregar(int modo, int var) {
		Calendar cal = new GregorianCalendar();
		cal.setTimeInMillis(this.getTime());
		cal.add(modo, var);
		setTime(cal.getTimeInMillis());
		return this;
	}

	public int get (int field) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(this);
		return calendar.get(field);
	}

	//METODOS PARA LA FECHAS EXTERNAS / OPERACIONES CON FECHAS =================
	/**
	 * <span class="funcion public">
	 * Retorna la cadena de la fecha con el formato especificado.
	 * </span>
	 * @return fecha del sistema
	 */
	public String getFormato(Date fecha, String format) {
		SimpleDateFormat formatoFecha = new SimpleDateFormat(format);
		return formatoFecha.format(fecha);
	}

	/**
	 * <span class="funcion public">
	 * TODO agregar documentación
	 * </span>
	 * @param sFechaMayor
	 * @param sFechaMenor
	 * @param formato
	 * @return
	 */
	public boolean esFechaMayor (Date sFechaMayor, Date sFechaMenor) {
		double diferencia = restarFecha(sFechaMayor, sFechaMenor, -1);
		return (diferencia >= 0)?true:false;
	}

	/**
	 * <span class="funcion public">
	 * TODO agregar documentación
	 * </span>
	 * @param sFechaMayor
	 * @param sFechaMenor
	 * @param formato
	 * @return
	 */
	public boolean esFechaMayor (String sFechaMayor, String sFechaMenor, String formato) {
		return esFechaMayorPor(sFechaMayor, sFechaMenor, 0, Fechas.mm, formato);
	}

	/**
	 * <span class="funcion public">
	 * TODO agregar documentación
	 * </span>
	 * @param sFechaMayor
	 * @param sFechaMenor
	 * @param tipo
	 * @param formato
	 * @return
	 */
	public boolean esFechaMayor (String sFechaMayor, String sFechaMenor, int tipo, String formato) {
		return esFechaMayorPor(sFechaMayor, sFechaMenor, 0, tipo, formato);
	}

	/**
	 * <span class="funcion public">
	 * TODO agregar documentación
	 * </span>
	 * @param sFechaMenor
	 * @param sFechaMayor
	 * @param formato
	 * @return
	 */
	public boolean esFechaMenor (String sFechaMenor, String sFechaMayor, String formato) {
		return esFechaMenorPor(sFechaMenor, sFechaMayor, 0, Fechas.mm, formato);
	}

	/**
	 * <span class="funcion public">
	 * TODO agregar documentación
	 * </span>
	 * @param sFechaMenor
	 * @param sFechaMayor
	 * @param tipo
	 * @param formato
	 * @return
	 */
	public boolean esFechaMenor (String sFechaMenor, String sFechaMayor, int tipo, String formato) {
		return esFechaMenorPor(sFechaMenor, sFechaMayor, 0, tipo, formato);
	}

	/**
	 * <span class="funcion public static">
	 * TODO agregar documentación
	 * </span>
	 * @param sFechaMayor
	 * @param sFechaMenor
	 * @param diferencia
	 * @param tipo
	 * @param formato
	 * @return
	 */
	public boolean esFechaMayorPor (String sFechaMayor, String sFechaMenor, int diferencia, int tipo, String formato) {
		Date dFechaInicio = parseDate(formato, sFechaMayor);
		Date dFechaFin = parseDate(formato, sFechaMenor);

		double dias = restarFecha(dFechaInicio, dFechaFin, tipo);

		return (dias >= diferencia)?true:false;
	}

	/**
	 * <span class="funcion public">
	 * TODO agregar documentación
	 * </span>
	 * @param sFechaMenor
	 * @param sFechaMayor
	 * @param diferencia
	 * @param tipo
	 * @param formato
	 * @return
	 */
	public boolean esFechaMenorPor (String sFechaMenor, String sFechaMayor, int diferencia, int tipo, String formato) {
		Date dFechaInicio = parseDate(formato, sFechaMenor);
		Date dFechaFin = parseDate(formato, sFechaMayor);

		double dias = restarFecha(dFechaInicio, dFechaFin, tipo);

		return (dias <= diferencia)?true:false;
	}

	/**
	 * <span class="funcion private">
	 * TODO agregar documentación
	 * </span>
	 * @param dFechaInicio
	 * @param dFechaFin
	 * @param tipo
	 * @return
	 */
	public double restarFecha(Date dFechaInicio, Date dFechaFin) {
		return restarFecha(dFechaInicio, dFechaFin, -1);
	}

	/**
	 * <span class="funcion private">
	 * TODO agregar documentación
	 * </span>
	 * @param dFechaInicio
	 * @param dFechaFin
	 * @param tipo
	 * @return
	 */
	public double restarFecha(Date dFechaInicio, Date dFechaFin, int tipo) {
		long fechaInicialMs = dFechaInicio.getTime();
		long fechaFinalMs = dFechaFin.getTime();

		long fechaDiferenciaMs = fechaInicialMs - fechaFinalMs;

		switch (tipo) {
			case d:
				return (fechaDiferenciaMs*1.0) / (1000 * 60 * 60 * 24);
			case H:
				return (fechaDiferenciaMs*1.0) / (1000 * 60 * 60);
			case mm:
				return (fechaDiferenciaMs*1.0) / (1000 * 60);
			default:
				return fechaDiferenciaMs;
		}
	}

	public Fechas sumar(int modo, int var) {
		return sumar(this, modo, var);
	}

	public Fechas sumar(Date fechafin, int modo, int var) {
		Calendar cal = new GregorianCalendar();
		cal.setTimeInMillis(this.getTime());
		cal.add(modo, var);
		Fechas fechaSiguiente = new Fechas(cal.getTimeInMillis());
		return fechaSiguiente;
	}

	public long convertir(int tipo, double tiempo) {
		if (tiempo < 0) {
			tiempo = tiempo * -1;
		}

		long var = 0;
		switch (tipo) {
			case d:
				var = (86400000);
				break;
			case H:
				var = (3600000);
				break;
			case mm:
				var = (60000);
				break;
		}
		Calendar calendar = new GregorianCalendar();
		calendar.set(0, 1, 1, 0, 0, 0);
		calendar.add(Calendar.MILLISECOND, (int) (tiempo * var));
		return calendar.getTimeInMillis();
	}

	//METODOS ESTATICOS ========================================================
	/**
	 * <span class="funcion public static">
	 * Convierte una cadena con formato, ubicado en los
	 * archivos properties, a fecha.
	 * </span>
	 * 
	 * @param formato
	 * @param fecha
	 * @return
	 */
	public static Date parseDate(String fecha){
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		try {
			return dateFormat.parse(fecha);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * <span class="funcion public static">
	 * Convierte una cadena con formato, ubicado en los
	 * archivos properties, a fecha.
	 * </span>
	 * 
	 * @param formato
	 * @param fecha
	 * @return
	 */
	public static Date parseDate(String formato, String fecha){
		SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
		try {
			return dateFormat.parse(fecha);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * <span class="funcion public static">
	 * Convierte una cadena con formato, ubicado en los
	 * archivos properties, a fecha.
	 * </span>
	 * 
	 * @param formato
	 * @param fecha
	 * @return
	 */
	public static java.sql.Date parseSqlDate(String formato, String fecha){
		SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
		try {
			Date fechaJava = dateFormat.parse(fecha);
			java.sql.Date fechaSql = new java.sql.Date(fechaJava.getTime());
			return fechaSql;
		} catch (ParseException e) {
			return null;
		}
	}

	public static String aFormato(String formato) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
		return dateFormat.format(new Fechas());
	}
}
