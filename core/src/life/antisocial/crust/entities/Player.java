package life.antisocial.crust.entities;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.*;
import life.antisocial.crust.enums.ItemType;
import life.antisocial.crust.items.Inventory;
import life.antisocial.crust.items.Item;
import life.antisocial.crust.quests.Journal;
import life.antisocial.crust.quests.Quest;

public class Player extends Entity {

    protected Body body;
    protected Sprite sprite;
    protected float speed;
    protected Inventory inventory;
    protected Journal journal;

    public Player(float x, float y, World world) {
        super(x, y);
        speed = 0.5f;
        inventory = new Inventory(12);
        journal = new Journal();
        sprite = new Sprite(new Texture("core/assets/sprites/test_player.png"));
        sprite.setPosition(pos.x, pos.y);

        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(pos);
        body = world.createBody(bodyDef);
        PolygonShape shape = new PolygonShape();
        shape.setAsBox(sprite.getWidth() / 2, sprite.getHeight() / 2);
        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = shape;
        fixtureDef.density = 1.0f;
        body.createFixture(fixtureDef);

        shape.dispose();

        testStuff();
    }

    public Sprite getSprite() {
        return sprite;
    }

    public Body getBody() {
        return body;
    }

    private void testStuff() {
        inventory.addItem(new Item("test item", ItemType.WEAPON, "Some kind of test item"));
        journal.addQuest(new Quest("Test quest", "You should do something the quest says", "You got given a quest by some dude."));
    }
}
