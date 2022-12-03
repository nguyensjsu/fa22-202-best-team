import java.util.HashMap;

public class PokemonFactory {
    String[] enemies = {"Charmander", "Pikachu", "Articuno", "Mudkip", "Gyarados", "Gengar", "Dragonite", "Jigglypuff", "Snorlax", "Oddish", "Arcanine", "Kyogre", "Golbat", "Arceus", "Tropius", "Mewtwo"};
    HashMap<String, Class> hmap;
    PokemonFactory() {
        hmap = new HashMap<>();
        hmap.put("Charmander", Charmander.class);
        hmap.put("Pikachu", Pikachu.class);
        hmap.put("Articuno",Articuno.class);
        hmap.put("Mudkip",Mudkip.class);
        hmap.put("Gyarados", Gyarados.class);
        hmap.put("Gengar",Gengar.class);
        hmap.put("Dragonite", Dragonite.class);
        hmap.put("Jigglypuff", Jigglypuff.class);
        hmap.put("Snorlax",  Snorlax.class);
        hmap.put("Oddish", Oddish.class);
        hmap.put("Arcanine", Arcanine.class);
        hmap.put("Kyogre", Kyogre.class);
        hmap.put("Golbat", Golbat.class);
        hmap.put("Arceus", Arceus.class);
        hmap.put("Tropius", Tropius.class);
        hmap.put("Mewtwo", Mewtwo.class);
    }

    IPokemon getPokemon(int index, int level)  {
        Class k = hmap.get(enemies[index]);
        try
        {
            return (IPokemon)k.getConstructors()[0].newInstance(level, true);
        }
        catch (IllegalAccessException iae)
        {
            iae.printStackTrace();
        }
        catch (java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
        //return (IPokemon)k.newInstance(level, true);
    }
}