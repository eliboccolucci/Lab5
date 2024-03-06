/**
 * Interface that extends IFish and adds methods for Fish
 *
 * @defines numFins, the number of fins
 *
 * @constraints numFins >= 0
 *
 * @initialization_ensures a fish is created with fins, genus, species, and commonName
 */
public interface IFish extends IAnimal
{
    /**
     * getter function that returns fin count
     *
     * @return The fin count as an int
     *
     * @pre none
     *
     * @post getFinCount = finCount AND commonName = #commonName AND genus = #genus AND species = #species
     *       AND finCount = #finCount
     */
    public int getFinCount();
}
