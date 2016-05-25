package jpu2016.dogfight.controller;

public class UserOrder {
	
	private int player;
	private Order order;

	public UserOrder (int player, Order order) {
		
		this.player = player;
		this.order = order;
		
		}
	
	public int getPlayer() {
		return 1;
	}
	
	
	
	public Order getOrder () {
		return order;
	}
	
}
