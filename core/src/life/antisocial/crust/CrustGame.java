package life.antisocial.crust;

import com.badlogic.gdx.Game;
import life.antisocial.crust.screens.MenuScreen;
import life.antisocial.crust.screens.PlayScreen;

public class CrustGame extends Game {

	public MenuScreen menuScreen;
	public PlayScreen playScreen;

	@Override
	public void create() {
		menuScreen = new MenuScreen(this);
		playScreen = new PlayScreen(this);
		setScreen(menuScreen);
	}
}
