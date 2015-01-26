package life.antisocial.crust.universe;

import com.badlogic.gdx.math.Vector2;

public class Location {

    protected Vector2 coords;
    protected int seed;

    public Location(int _x, int _y) {
        coords = new Vector2(_x, _y);
    }

    public Vector2 getCoords() {
        return coords;
    }

}
