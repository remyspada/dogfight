package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;
import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer{
	public EventPerformer(IOrderPerformer orderperformer) {
		
	}
	public void eventPerform(KeyEvent keyCode) {
		
	}
	private UserOrder keyCodeToUserOrder(int keyCode){
		return new UserOrder() ;
	}
}
