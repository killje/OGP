package hexagonwars.entities;

/**
 *
 * @author Patrick Beuks (s2288842), Floris Huizinga (s2397617) and
 * @author Timo Smit (s2337789)
 */
public abstract class Wizard extends Infantry {

    public Wizard() {
        this.type = hexagonwars.HexagonWars.ENTITY_UNIT_MAGIC;
    }
}