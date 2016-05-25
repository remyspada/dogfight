package jpu2016.dogfight.view;

import java.util.Observable;

import javafx.event.Event;
import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;
import jpu2016.gameframe.IEventPerformer;
import jpu2016.gameframe.IGraphicsBuilder;


public class DogfightView extends Observable implements IViewSystem, Runnable{
	
	private EventPerformer myeventPerformer;
	private GraphicsBuilder mygraphicsBuilder;
	private GameFrame mygameFrame;
	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
	this.myeventPerformer = new EventPerformer(orderPerformer);	
	this.mygraphicsBuilder = new GraphicsBuilder(dogfightModel);
	this.mygameFrame = new GameFrame("Ceci est un String", myeventPerformer, mygraphicsBuilder, observable); 
	}
	
	
	public void displayMessage(String message){
		
	}
	
	public void closeAll() {
		
	}

	@Override //utilisé pour adapter une fonction existante dans une bibliothèque
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
