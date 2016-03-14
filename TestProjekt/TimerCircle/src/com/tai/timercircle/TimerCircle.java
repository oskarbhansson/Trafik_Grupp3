package com.tai.timercircle;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.math.Vector2;
import com.tai.timercircle.screen.PlayScreen;

public class TimerCircle  extends Game {

	//design viewport
	public static final Vector2 VIEWPORT = new Vector2(480, 320);
	
	//Quan ly textureAtals va sound
    public AssetManager manager = new AssetManager();
	
	public PlayScreen getPlayScreen()
	{
		return new PlayScreen(this);
	}
	
	
	@Override
	public void create() {

	}

	@Override
    public void resize(
        int width,
        int height )
    {
        super.resize( width, height );
        
        if( getScreen() == null ) {
        	setScreen( getPlayScreen() );
        }
    };

    @Override
    public void render()
    {
        super.render();
    }

    @Override
    public void pause()
    {
        super.pause();

    }

    @Override
    public void resume()
    {
        super.resume();
    }
    
    @Override
    public void setScreen(Screen screen )
    {
        super.setScreen( screen );
    }

    @Override
    public void dispose()
    {
		//giai phong texture
		manager.dispose();
		
        super.dispose();
    }	
}
