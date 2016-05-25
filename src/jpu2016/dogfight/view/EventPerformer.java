package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;
import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer{
	
	private IOrderPerformer orderPerformer;
	
	public EventPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
		
	}
	public void eventPerform(KeyEvent keyCode) {
		
	}
	private UserOrder keyCodeToUserOrder(int keyCode){
		return null;

	}
}
