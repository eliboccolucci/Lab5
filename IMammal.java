/**
 * Interface that extends the IAnimal inteface and adds methods specific to mammals
 *
 * @defines
 *      legs       // Counts the amount of legs the mammal has
 *
 * @constraints
 *      legs > 0
 *
 * @initialization_ensures 
 *                   a species, mammal object will be created with the number of legs, genus, and common name
 *
 */
public interface IMammal extends IAnimal
{
    /**
    * Gets the legs count
    *
    * @return The number of legs the mammal has
    *
    * @pre None
    * 
    * @post getLegCount = legs AND common = #common AND speciesName = #speciesName AND genus = #genus AND legs = #legs
    */
    public int getLegCount();
}
