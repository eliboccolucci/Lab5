/**
 * Interface that extends the IAnimal inteface and adds methods specific to mammals
 *
 * @defines
 *      #LegCount       // Counts the amount of legs the mammal has
 *
 * @constraints
 *      legCount > 0k
 *
 * @initialization_ensures
 *
 */
public interface IMammal extends IAnimal
{
    /**
     * @return The number of legs the mammal has
     */
    public int getLegCount();
}
