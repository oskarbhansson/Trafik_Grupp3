package com.tai.timercircle.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.tai.timercircle.TimerCircle;
import com.tai.timercircle.actors.ProgressCircle;

public class PlayScreen implements Screen {
	
	private Stage stage;
	private TextureAtlas atlas;
	
	PolygonSpriteBatch pbatch;
	ProgressCircle sprite;
	Image hand;
	float dura = 0;
	
	public PlayScreen(TimerCircle game)
	{
		stage = new Stage(0, 0, true);
		
		game.manager.load("data/timer.txt", TextureAtlas.class);
		game.manager.finishLoading();

		atlas = game.manager.get("data/timer.txt", TextureAtlas.class);
		
		pbatch = new PolygonSpriteBatch();
		
	}
	
	@Override
    public void show()
    {
        // set the stage as the input processor
        Gdx.input.setInputProcessor( stage );
        Gdx.input.setCatchBackKey(true);

        //background
        Image bg = new Image(atlas.findRegion("timer_bg"));
		bg.setPosition(240 - bg.getWidth()/2, 160 - bg.getHeight()/2);
		stage.addActor(bg);
        
		//progress Circle
		sprite = new ProgressCircle(atlas.findRegion("timer_progress"), pbatch);
		sprite.setPosition(240 - bg.getWidth()/2, 160 - bg.getHeight()/2);
		stage.addActor(sprite);
		
		//mặt kính 
        Image grass = new Image(atlas.findRegion("timer_grass"));
        grass.setPosition(240 - bg.getWidth()/2, 160 - bg.getHeight()/2);
		stage.addActor(grass);

		//kim đồng hồ 
        hand = new Image(atlas.findRegion("timer_hand"));
        hand.setOrigin(hand.getWidth()/2, hand.getHeight()/2);
		hand.setPosition(240 - bg.getWidth()/2, 160 - bg.getHeight()/2);
		stage.addActor(hand);

        
    }

    @Override
    public void resize(
        int width,
        int height )
    {
    	// resize the stage
//    	stage.setViewport(width, height, false );
    	stage.setViewport( TimerCircle.VIEWPORT.x, TimerCircle.VIEWPORT.y, false );
    	
    }

    @Override
    public void render(
        float delta )
    {
    	
        // update the action of actors
        stage.act( delta );

        // clear the screen with the given RGB color (black)
        Gdx.gl.glClearColor( 1f, 1f, 1f, 1f );
        Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT );

        //-----------------------------
        //TIMER CHAY TRONG 20 GIAY
        //-----------------------------
        //20 giay = 100
        //dura giay = dura * 100 / 30;
        dura+= delta;
        if (dura <= 20)
        {
        	float percent = dura * 100 / 20;
        	
        	if (percent > 75) sprite.setColor(Color.RED);
        	else if (percent > 50) sprite.setColor(Color.YELLOW);
        	else if (percent > 25) sprite.setColor(Color.GREEN); 
        	else sprite.setColor(Color.BLUE);
        	
    		//100 % = 360 degree
    		//==> percent % => (percent * 360 / 100) degree 
        	hand.setRotation(-percent * 360 / 100);
        	sprite.setPercentage(percent );
        }
        else
        {
        	dura = 0; //loop
        }
        
        // draw the actors
        stage.draw();
    }

    @Override
    public void hide()
    {
        // dispose the resources by default
        dispose();
    }

    @Override
    public void pause()
    {
    }

    @Override
    public void resume()
    {
    }

    @Override
    public void dispose()
    {
    }
}