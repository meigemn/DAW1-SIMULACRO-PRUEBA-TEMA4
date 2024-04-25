package zoo;

/**
 * Clase Gallina de zoo
 * @author carloscc
 */
public class Gallina extends Ave {
 
    private String cacareo = "GRRRRR";
    
    /**
     * Constructor de la clase Gallina por defecto
     */
    public Gallina () {}
    
    /**
     * Constructor de la clase Gallina parametrizado
     * @param habitat Ecosistema donde vive el animal
     * @param comida  Alimento que consume el animal
     * @param longevidad Cuanto vive expresado en años el animal
     * @param periodoIncubacion Dias de incubación
     */
    public Gallina (Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
        super(habitat, comida, longevidad, periodoIncubacion);
    }
    
    /**
     * Método vacío que designa el Cacareo de la gallina
     * @param cacareo string de mensaje cacareo
     */
    public void setCacareo (String cacareo) { this.cacareo = cacareo; }
    
    /**
     * Método para obtener el String Cacareo
     * @return cacareo string de mensaje de cacareo
     */
    public String getCacareo () { return cacareo; }
    
    /**
     * Método vacío que imprime cacareo
     */
    public void rugir () { System.out.println(cacareo); }
    
    /**
     * Método vacío qque imprime lo que esta comiendo la gallina
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     * Método vacío que imprime un string.
     */
    public void desplazar () { System.out.println("Estoy volando con mucha dificultad"); }
}
