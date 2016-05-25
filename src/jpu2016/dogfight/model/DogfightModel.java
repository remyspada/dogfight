package jpu2016.dogfight.model;

import java.util.ArrayList;

public class DogfightModel {
	private IArea area;
	private ArrayList<IMobile> Mobiles;
	private IMobile Player;

	public DogfightModel() {
	}

	public IArea getArea() {
		return area;
	}

	public void buildArea(Dimension dimension) {
	}

	public void addMobile(IMobile Mobile) {
	}

	public void removeMobile(IMobile Mobile) {
	}

	public ArrayList<IMobile> getMobiles() {
		return Mobiles;
	}

	public IMobile getMobileByPlayer(int player) {
		return Player;
	}

	public void setMobilesHavesMoved() {
	}

}
