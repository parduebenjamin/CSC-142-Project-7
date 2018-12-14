import java.awt.image.WritableRaster;

/**
 * Filter that flips that creates a negative of each image
 * 05-31-2018 - 
 * 
 */
public class NegativeFilter implements Filter
{
	  public void filter(PixelImage pi)
	  {
	    Pixel[][] data = pi.getData();

	    for (int col = 0; col < pi.getWidth(); col++)
	    {
	      for (int row = 0; row < pi.getHeight(); row++)
	      {
	          Pixel temp = data[row][col];
	    	  data[row][col].red = 255 - data[row][col].red;
	          data[row][col].green = 255 - data[row][col].green;
	          data[row][col].blue = 255 - data[row][col].blue;          
	          
	      }
	    }

	    pi.setData(data);
	  }
}

