package life.antisocial.crust.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import life.antisocial.crust.CrustGame;
import life.antisocial.crust.conf.Config;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.vSyncEnabled = true;
		config.width = Config.WIDTH;
		config.height = Config.HEIGHT;
		config.title = Config.TITLE;
		new LwjglApplication(new CrustGame(), config);
	}
}
