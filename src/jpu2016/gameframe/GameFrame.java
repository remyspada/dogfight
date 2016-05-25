package jpu2016.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener {
	private IEventPerformer eventPerformer;
	private Object GamePanel;
	
	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable){
		this.eventPerformer = performer;
		this.GamePanel = GamePanel;
		
	}
	public void keyPressed(KeyEvent keyEvent){
		
	}
	public void keyRealeased(KeyEvent keyEvent){
		
	}
	public void keyTyped(KeyEvent keyEvent){
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
