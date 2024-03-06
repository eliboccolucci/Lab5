/**
 * Defines the general properties and behaviors of an animal.
 *
 * @defines
 * commonName: a String that = the common name of the animal.
 * genus: a String that = the genus part of the scientific name for an animal.
 * species: a String that = a certain species of animal.
 *
 * @constraints
 * commonName, genus, and species != NULL
 * species and genus should follow the binomial nomenclature naming system.
 *
 * @initialization_ensures
 *  The animal's common name, genus, and species are initialized correctly based on
 *  the constraints given.
 */
public interface IAnimal
{
    /**
     * Returns the common name of the animal.
     *
     * @return a String representing the animal's common name.
     *
     * @pre none
     *
     * @post returns != Null
     */
    public String getCommonName();

    /**
     * Returns the genus of the animal.
     *
     * @return a String representing the animal's genus
     *
     * @pre none
     *
     * @post returns != Null
     */
    public String getGenus();

    /**
     * Returns the Species of the animal.
     *
     * @return a String representing the specific name of species for the animal
     *
     * @pre none
     *
     * @post returns != Null
     */
    public String getSpecies();

    /**
     * Default method that gives the full description of the animal including its common name,
     * genus, and species in proper formatting.
     *
     * @return a String representing the full description of the animal.
     *
     * @pre commonName != NULL AND genus != NULL AND species != NULL
     *
     * @post returns a non-null String that combines commonName, genus, and species into a single formatted description.
     */
    public default String getDescription(){
        String properGenusFormatting = getGenus().substring(0,1).toUpperCase() + getGenus().substring(1).toLowerCase();
        return getCommonName() + " (" + properGenusFormatting + " " + getSpecies().toLowerCase() + ")";
    }


}
