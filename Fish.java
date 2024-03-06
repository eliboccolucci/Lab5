/**
 * class to implement IFish Interface
 *
 * @invariant ((commonName AND genus AND  species) != NULL) AND finCount >= 0
 *
 * @corresponds numFins = finCount
 *
 *
 */
public class Fish implements IFish {

    private String commonName;
    private String genus;
    private String species;
    private int finCount;

    /**
     * @param aCommonName for of fish, a string
     * @param aGenus genus of fish, a string
     * @param aSpecies, species of fish, a string
     * @param aFinCount number of fins of fish, an int
     *
     * @pre commonName AND genus AND species != NULL AND finCount >= 0
     *
     * @post commonName = aCommonName AND genus = AGenus AND species = aSpecies AND finCount = aFinCount
     *
     *
     */
    public Fish(String aCommonName, String aGenus, String aSpecies, int aFinCount)
    {
        commonName = aCommonName;
        genus = aGenus;
        species = aSpecies;
        finCount = aFinCount;
    }

    /**
     * getter function that returns genus
     *
     * @return The genus as a string
     *
     * @pre none
     *
     * @post getGenus = genus AND commonName = #commonName AND genus = #genus AND species = #species
     *       AND finCount = #finCount
     */
    public String getGenus()
    {
        return genus;
    }

    /**
     * getter function that returns species
     *
     * @return The species as a string
     *
     * @pre none
     *
     * @post getSpecies = species AND commonName = #commonName AND genus = #genus AND species = #species
     *       AND finCount = #finCount
     */
    public String getSpecies()
    {
        return species;
    }

    /**
     * getter function that returns commonName
     *
     * @return The common name as a string
     *
     * @pre none
     *
     * @post getCommonName = commonName AND commonName = #commonName AND genus = #genus AND species = #species
     *       AND finCount = #finCount
     */

    public String getCommonName()
    {
        return commonName;
    }

    public int getFinCount()
    {
        return finCount;
    }
}
