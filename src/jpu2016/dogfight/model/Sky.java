package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

public class Sky implements IArea{


private static final String IMAGE = "Sky.png";
private BufferedImage image;
public Sky(Dimension dimension){
	try {
        this.image = ImageIO.read((ImageInputStream) new File("images/" + IMAGE));
} catch (final IOException e) {
        e.printStackTrace();
}
}

public Image getImage(){
	return image ;

}
@Override
public Dimension getDimension() {
	// TODO Auto-generated method stub
	return null;
}

}
