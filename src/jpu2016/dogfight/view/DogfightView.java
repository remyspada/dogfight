package jpu2016.dogfight.view;

import java.util.Observable;

import javafx.event.Event;
import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;

public class DogfightView implements IViewSystem {
	
	private EventPerformer myEventPerformer;
	private GraphicsBuilder myGraphicsBuilder;
	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
	this.myEventPerformer = new EventPerformer(orderPerformer);	
	this.myGraphicsBuilder = new GraphicsBuilder(dogfightModel);
	}
	
	private void run() {
		
	}
	
	public void displayMessage(String message){
		
	}
	
	public void closeAll() {
		
	}
	
}
