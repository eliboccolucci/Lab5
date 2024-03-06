
/**
 * A class that implements the IMammal interface that contains leg count
 *
 * @invariant commonName != null 
 *            genus != null 
 *            species != null 
 *            legCount >= 0
 *
 * @corresponds legs = legCount
 *              common = commonName 
 *              genusName = genus
 *              speciesName = species
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
     * @pre commonName != null 
     *        genus != null 
     *        aSpecies != null 
     *        legCount >= 0     
     * 
     * @post 
     *       commonName = aCommonName AND species = aSpecies AND genus = aGenus AND legCoutn = aLegCount   
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
