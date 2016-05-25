package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Mobile  implements IMobile {
	private Direction direction;
	private Image[] images;
private int speed;
public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
}
	
	private void buildAllimages(final String imageName) throws IOException {
        this.images = new Image[4];
        this.images[Direction.UP.ordinal()] = ImageIO.read(new File("images/" + imageName + "_UP.png"));
        this.images[Direction.RIGHT.ordinal()] = ImageIO.read(new File("images/" + imageName + "_RIGHT.png"));
        this.images[Direction.DOWN.ordinal()] = ImageIO.read(new File("images/" + imageName + "_DOWN.png"));
        this.images[Direction.LEFT.ordinal()] = ImageIO.read(new File("images/" + imageName + "_LEFT.png"));
}

@Override
public Image getImage() {
        return this.images[this.direction.ordinal()];
}

@Override
public Direction getDirection() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void setDirection(Direction direction) {
	// TODO Auto-generated method stub
	
}

@Override
public Point getPosition() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Dimension getDimension() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int getWidth() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void getHeight() {
	// TODO Auto-generated method stub
	
}

@Override
public int getSpeed() {
	// TODO Auto-generated method stub
	return 0;
}


@Override
public void move() {
	// TODO Auto-generated method stub
	
}

@Override
public void placeInArea(IArea area) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean isPlayer(int player) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void setDogfightModel(DogfightModel dogfightModel) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean hit() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isWeapon() {
	// TODO Auto-generated method stub
	return false;
}

}
