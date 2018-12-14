import java.awt.image.WritableRaster;
/**
 * Filter that applies weights
 * need to create a temp image and use the values for weights
 * 05-31-2018 - 
 * 
 */
public class GaussianFilter implements Filter
{
	
	
	  public void filter(PixelImage pi)
	  {
	    Pixel[][] data = pi.getData();
	    Pixel[][] tempData = pi.getData();

	    for (int col = 1; col < pi.getWidth()-1; col++)
	    {
	      for (int row = 1; row < (pi.getHeight()-1); row++)
	      {
	          Pixel temp = data[row][col];
	    	  data[row][col].red =  ((tempData[row-1][col-1].red*1)
	    			  				+(tempData[row-1][col].red*2)
	    			  				+(tempData[row-1][col+1].red*1)
	    			  				+(tempData[row][col-1].red*2)
	    			  				+(tempData[row][col].red*4)
	    			  				+(tempData[row][col+1].red*2)
	    			  				+(tempData[row+1][col-1].red*1)
	    			  				+(tempData[row+1][col].red*2)
	    			  				+(tempData[row+1][col+1].red*1))/16;
	    	  
	    	  
	    	  data[row][col].green =  ((tempData[row-1][col-1].green*1)
		  				+(tempData[row-1][col].green*2)
		  				+(tempData[row-1][col+1].green*1)
		  				+(tempData[row][col-1].green*2)
		  				+(tempData[row][col].green*4)
		  				+(tempData[row][col+1].green*2)
		  				+(tempData[row+1][col-1].green*1)
		  				+(tempData[row+1][col].green*2)
		  				+(tempData[row+1][col+1].green*1))/16;

	    	  data[row][col].blue =  ((tempData[row-1][col-1].blue*1)
		  				+(tempData[row-1][col].blue*2)
		  				+(tempData[row-1][col+1].blue*1)
		  				+(tempData[row][col-1].blue*2)
		  				+(tempData[row][col].blue*4)
		  				+(tempData[row][col+1].blue*2)
		  				+(tempData[row+1][col-1].blue*1)
		  				+(tempData[row+1][col].blue*2)
		  				+(tempData[row+1][col+1].blue*1))/16;
          
	          
	      }
	    }

	    pi.setData(data);
	  }
}

