package life.antisocial.crust.entities;

import com.badlogic.gdx.math.Vector2;

public class Entity {

    protected Vector2 pos;

    public Entity(float _x, float _y) {
        pos = new Vector2(_x, _y);
    }

    public float getX() {
        return pos.x;
    }

    public float getY() {
        return pos.y;
    }

    public Vector2 getPos() {
        return pos;
    }

    public void setPos(Vector2 _pos) {
        pos = _pos;
    }

}
