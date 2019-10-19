package kerbonautas.planetaryplaygroundservices;

public class IngDefs {

	// Precisa que se le envia el booleano de si el planeta es gaseoso o no
	public static String explicacionDistancia(Boolean i) {
		StringBuilder str = new StringBuilder();
		if (!i) {
			str.append("Gaseous planets are usually in regions far from their star. \n \n");
			str.append("A gaseous planet could be near the star because: \n");
			str.append("-a giant star that has evolved from the main sequence and has approached during its evolution the planet gas that was far away \n");
			str.append("-the planet was far away but gravitationally interacting with another planet catapulted it to a nearby orbit \n");
			str.append("-It was a wandering planet that was captured by the star's orbit");
		} else {
			str.append("Terrestrial planets are usually in regions near their star. \n \n");
			str.append("A terrestrial planet could be far from the star and / or in orbit of a supergiant or giant because: \n");
			str.append("-a star to evolve a giant destroyed the atmosphere of a gaseous planet and survived its terrestrial nucleus \n");
			str.append("-the planet was close but gravitationally interacting with another planet catapulted it to a distant orbit \n");
			str.append("-It was a wandering planet that was captured by the star's orbit");
		}
		
		return str.toString();
	}

	// Precisa que se le envia el booleano de si el planeta es gaseoso o no
	public static String explicacionGaseosoONo(Boolean i) {
		StringBuilder str = new StringBuilder();
		
		if (!i) {
			str.append("The gaseous planets are formed by a large number of substances that under normal conditions are gaseous and in addition, we call them that because their outer appearance is that of a sea of clouds.\n");
			str.append("It is not known with certainty, but it is suspected that they have a solid core and between it and the clouds, liquid oceans.");
		} else {
			str.append("The terrestrial planets are mostly made up of substances that are not solid in normal conditions.\n");
			str.append("Their surfaces are usually solid and can be covered with liquid oceans and layers of gases that we call atmosphere.");
		}
		
		return str.toString();
	}
	
	// Precisa que se le envia el booleano de si el planeta es gaseoso o no
	public static String explicacionTamanho(Boolean i) {
		StringBuilder str = new StringBuilder();
		
		str.append("The reference size that is usually used, is in reference to Jupiter, talking about super Jupiters when they are many times larger.\n");
		
		if (!i) {
			str.append("Gaseous planets tend to have a large size (several times the size of planet Earth) in part because of being gassed, their atmosphere extends over a much larger region. \n");
		} else {
			str.append("The terrestrial planets are very varied, being able to have the size of the planet Earth, several times less (Mercury) or tens of times greater (Supertierras). \n");
		}
		
		return str.toString();
	}
	
	public static String explicacionTemperatura() {
		StringBuilder str = new StringBuilder();
		
		str.append("The temperature of the planets depends on numerous factors, mainly on:\n");
		str.append("-star distance (hotter when closer)\n");
		str.append("-presence of atmosphere with greenhouse gases\n");
		
		return str.toString();
	}
	
	public static String explicacionMasa() {
		StringBuilder str = new StringBuilder();
		
		str.append("");
		
		return str.toString();
	}
	
	// Precisa que se le envie el booleano de si tiene o no atmósfera
	public static String explicacionTieneAtmosfera(Boolean i) {
		StringBuilder str = new StringBuilder();
		
		if (!i) {
			str.append("Gaseous planets have a very complex and mostly active atmosphere. They are covered by gas clouds hundreds of kilometers high that make it difficult to obtain information from inside.");
		} else {
			str.append("The terrestrial planets may be surrounded by a layer of gases called an atmosphere that can vary greatly from one planet to another and throughout the life of the planet.");
		}
		
		return str.toString();
	}
	
	public static String explicacionNombre() {
		StringBuilder str = new StringBuilder();
		
		str.append("Although some planets have their own name (known as those of the solar system), there is a systematic way of naming extrasolar planets.\n");
		str.append("They are named by the same name as their star, adding a lowercase letter in order from closest to farthest from the star starting with \"b\" and in alphabetical order, reserving the letter \"a\" for the star.");
		
		return str.toString();
	}
	
	public static String explicacionPresion() {
		StringBuilder str = new StringBuilder();
		
		str.append("");
		
		return str.toString();
	}
	
	public static String explicacionCampoMagnetico(Boolean i) {
		StringBuilder str = new StringBuilder();
		
		if (!i) {
			str.append("The magnetic field of the terrestrial planets is generated by the rotation of a metallic nucleus in a liquid state, for which high internal temperatures are usually needed, so it is suspected that small planets usually lack a magnetic field because they have cooled and have Lost its liquid core. The magnetic field protects the planet from the solar wind, a very important characteristic for the existence of atmosphere and life.");
		} else {
			str.append("The magnetic field of the gas planets is usually strange and different in each case.\n");
			str.append("They can become extremely powerful compared to Earth, or have strange geometries difficult to explain.\n");
			str.append("Finding explanations is not easy because of the difficulty of exploring these planets beyond the cloud cover that surrounds them.");
		}
		
		return str.toString();
	}
	
	public static String explicacionDistanciaAEstrella() {
		StringBuilder str = new StringBuilder();
		
		str.append("");
		
		return str.toString();
	}
	
	public static String explicacionPeriodoOrbital() {
		StringBuilder str = new StringBuilder();
		
		str.append("It is the time it takes the planet to make a complete turn around its star.\n");
		str.append("This time is proportional to the distance to the star and its mass (its gravitational attraction) following a common law for all the planets in the universe called Kepler's Third Law.");
		
		return str.toString();
	}
	
	public static String explicacionDuracionDia() {
		StringBuilder str = new StringBuilder();
		
		str.append("It is the time it takes to make a complete turn on himself.\n");
		str.append("The planets usually turn on themselves in the same direction in which they revolve around their star, but there are special situations by which they can acquire anomalous turns.\n");
		str.append("The impacts of meteorites and other larger bodies can accelerate or slow this rotation and even reverse it.\n");
		str.append("If the planet is very close to its star, \"Tidal Coupling\" can occur, whereby a planet always shows the same face to its star (same as the Moon to Earth).");
		
		return str.toString();
	}
}

