package src.strategy;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AccionHandler {

    private static final AccionHandler instancia = new AccionHandler();

    private Map<Integer, Accion> mapeo = new LinkedHashMap<>();

    private final List<Accion> acciones = List.of(
            AccionCrear.getInstance(),
            AccionClonar.getInstance(),
            AccionEliminarPorId.getInstance(),
            AccionMostrar.getInstance(),
            AccionEliminarPorColor.getInstance()
    );

    private AccionHandler() {
        // 1 -> AccionCrear
        // 2 -> AccionClonar
        // 3 -> AccionElminarPorId
        // 4 -> AccionMostrar ...
        for(Accion accion : acciones) {
            mapeo.put(accion.obtenerOpcion(), accion);
        }
    }

    //Map<Key, Value>
    public Map<Integer, Accion> getMapeo() {
        return mapeo;
    }

    public static AccionHandler getInstance() {
        return instancia;
    }
}
