/**
 * Filter that flips the image vertically
 * 05-31-2018 - just subbing out row and col recreates a verticle flip and height/width doesn't work
 * 
 */
public class FlipVerticalFilter implements Filter
{
	  public void filter(PixelImage pi)
	  {
	    Pixel[][] data = pi.getData();

	    for (int col = 0; col < pi.getWidth(); col++)
	    {
	      for (int row = 0; row < pi.getHeight() / 2; row++)
	      {
	        Pixel temp = data[row][col];
	        data[row][col] = data[pi.getHeight() - row - 1][col];
	        data[pi.getHeight() - row - 1][col] = temp;
	      }
	    }

	    pi.setData(data);
	  }
}
