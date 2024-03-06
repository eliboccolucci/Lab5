
/**
 * A class that implements the IMammal interface
 *
 * @invariant commonName != null && !commonName.isEmpty()
 *            genus != null && !genus.isEmpty()
 *            species != null && !species.isEmpty()
 *            legCount > 0
 *
 * @corresponds legCount == IMammal.legCount
 *              description == commonName + "(" + genus + " " + species +")"
 *              numberOfLegs == legCount
 */
public class Mammal implements IMammal{

    private String commonName;
    private String genus;
    private String species;
    private int legCount;

    /**
     * Constrcuts a Mammal object with the given parameters
     *
     * @param  aCommonName the common mammal name
     * @param aGenus The genus of the mammal
     * @param aSpecies The species of the mammal
     * @param aLegCount The amount of legs the mammal has
     *
     * @requires aCommonName != null && !aCommonName.isEmpty()
     *         aGenus != null && !aGenus.isEmpty()
     *         aSpecies != null && !aSpecies.isEmpty()
     *         aLegCount > 0
     *
     */
    public Mammal(String aCommonName, String aGenus, String aSpecies, int aLegCount)
    {
        commonName = aCommonName;
        genus = aGenus;
        species = aSpecies;
        legCount = aLegCount;
    }

    public String getGenus()
    {
        return genus;
    }

    public String getSpecies()
    {
        return species;
    }

    public String getCommonName()
    {
        return commonName;
    }

    public int getLegCount()
    {
        return legCount;
    }
}
