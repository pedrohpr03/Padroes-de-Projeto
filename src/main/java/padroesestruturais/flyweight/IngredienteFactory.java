package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class IngredienteFactory {

    private final Map<String, Ingrediente> cache = new HashMap<>();

    public Ingrediente getIngrediente(String nome) {
        return cache.computeIfAbsent(nome, Ingrediente::new);
    }

    public int getQuantidadeCriada() {
        return cache.size();
    }
}
