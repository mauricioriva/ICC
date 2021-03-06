/*
 * Código utilizado para el curso de Introducción a las Ciencias de la
 * Computación.
 * Se permite consultarlo para fines didácticos en forma personal.
 */
package sistemasolar;

/**
 * Clase que describe astros que giran alrededor de otro.
 * @author blackzafiro
 */
public class Satelite extends Astro {
	
	// Escala para dibujar a los planetas
	private static final double ESCALA_RADIO = 10.0;
	private static final double ESCALA_ORBITA = 400.0;
	private static final double ESCALA_ORBITA_SATELITE = ESCALA_RADIO * 2;
	private static final double ESCALA_TIEMPO = 15.0;
	private static final double ESCALA_ANGULO = Math.PI / 180;
	
	/**
	 * Datos de cada planeta y satélite.
	 * Deben ser ficticios, pues de otro modo la simulación no cabe en pantalla.
	 */
	public enum DatosSatelite {
		TIERRA(1.2, 0.487, 0.48293739, 0.5),
		LUNA(0.273, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.0739),
		MERCURIO(0.4, 0.277, 0.27293739, 0.3),
		VENUS(1.1, 0.377, 0.37293739, 0.4),
		MARTE(0.6, 0.587, 0.58293739, 0.6),
		JUPITER(3.0, 0.877, 0.87293739, 0.8),
		SATURNO(2.5, 1.077, 1.07293739, 1.0),
		URANO(2.1, 1.277, 1.27293739, 1.2),
		NEPTUNO(2.0, 1.427, 1.42293739, 1.3),
		PLUTON(0.5, 1.377, -1.37293739, 1.5, 17.0),

		EUROPA(0.273, ESCALA_ORBITA_SATELITE * 0.005, ESCALA_ORBITA_SATELITE * 0.005, 0.2973),
		GANIMIDES(0.273, ESCALA_ORBITA_SATELITE * 0.005, ESCALA_ORBITA_SATELITE * 0.005, 0.1934),
		IO(0.273, ESCALA_ORBITA_SATELITE * 0.005, ESCALA_ORBITA_SATELITE * 0.005, 0.4733),
		CALISTO(0.273, ESCALA_ORBITA_SATELITE * 0.005, ESCALA_ORBITA_SATELITE * 0.005, 0.4187);;
		//LUNA_LUNA(0.17, (ESCALA_ORBITA_SATELITE * 0.00257)/2.1, (ESCALA_ORBITA_SATELITE * 0.002566)/2.1, 0.036);;
		
		private final double diametroEcuatorial;
		private final double semiejeMayor;
		private final double semiejeMenor;
		private final double periodoOrbital;
		private final double angulo;
		
		DatosSatelite(double diametroEcuatorial,double semiejeMayor, double semiejeMenor,double periodoOrbital,double angulo) {
			this.diametroEcuatorial = diametroEcuatorial;
			this.semiejeMayor = semiejeMayor;
			this.semiejeMenor = semiejeMenor;
			this.periodoOrbital = periodoOrbital;
			this.angulo = angulo;
		}

		DatosSatelite(double diametroEcuatorial,double semiejeMayor, double semiejeMenor,double periodoOrbital) {
			this.diametroEcuatorial = diametroEcuatorial;
			this.semiejeMayor = semiejeMayor;
			this.semiejeMenor = semiejeMenor;
			this.periodoOrbital = periodoOrbital;
			this.angulo = 0.0;
		}
	}
	
	/// Inician atributos
	
	private final DatosSatelite datos;
	private OrbitaTransition orbita;
	private Astro foco;
	
	
	/// Inician métodos
        
	/**
	 * Astro alrededor del cual gira este satélite.
	 * @return astro alrededor del cual girar este satélite.
	 */
	public Astro getFoco() {
		return foco;
	}
	
	/**
	 * Crea la órbita de este planea y lo pone a girar alrededor del foco.
	 */
	private void creaOrbita(Astro foco) {
		foco.getNodo().getChildren().add(this.nodo);
		this.foco = foco;
		
		orbita = new OrbitaTransition(this,
						datos.semiejeMayor * ESCALA_ORBITA,
						datos.semiejeMenor * ESCALA_ORBITA,
						datos.periodoOrbital * ESCALA_TIEMPO,
						datos.angulo * ESCALA_ANGULO
		);
		orbita.play();
	}
	
	/**
	 * Constructor.
	 * @param datos información del astro y su órbita.
	 * @param foco astro alrededor del cual gira este satélite.
	 */
	public Satelite(DatosSatelite datos, Astro foco) {
		super(datos.diametroEcuatorial * ESCALA_RADIO);
		this.datos = datos;
		creaOrbita(foco);
	}
	
	/**
	 * Devuelve el nombre de este satélite.
	 * @return nombre
	 */
	public String getNombre() {
		return this.datos.toString();
	}
}
