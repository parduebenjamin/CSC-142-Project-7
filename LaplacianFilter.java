/**
 * Filter that applies weights
 * need to create a temp image and use the values for weights
 * 05-31-2018 - 
 * 
 */
public class LaplacianFilter implements Filter
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
	    	  data[row][col].red =  ((tempData[row-1][col-1].red*-1)
	    			  				+(tempData[row-1][col].red*-1)
	    			  				+(tempData[row-1][col+1].red*-1)
	    			  				+(tempData[row][col-1].red*-1)
	    			  				+(tempData[row][col].red*8)
	    			  				+(tempData[row][col+1].red*-1)
	    			  				+(tempData[row+1][col-1].red*-1)
	    			  				+(tempData[row+1][col].red*-1)
	    			  				+(tempData[row+1][col+1].red*-1));
	    	  
	    	  
	    	  data[row][col].blue =  ((tempData[row-1][col-1].blue*-1)
		  				+(tempData[row-1][col].blue*-1)
		  				+(tempData[row-1][col+1].blue*-1)
		  				+(tempData[row][col-1].blue*-1)
		  				+(tempData[row][col].blue*8)
		  				+(tempData[row][col+1].blue*-1)
		  				+(tempData[row+1][col-1].blue*-1)
		  				+(tempData[row+1][col].blue*-1)
		  				+(tempData[row+1][col+1].blue*-1));


	    	  data[row][col].green =  ((tempData[row-1][col-1].green*-1)
		  				+(tempData[row-1][col].green*-1)
		  				+(tempData[row-1][col+1].green*-1)
		  				+(tempData[row][col-1].green*-1)
		  				+(tempData[row][col].green*8)
		  				+(tempData[row][col+1].green*-1)
		  				+(tempData[row+1][col-1].green*-1)
		  				+(tempData[row+1][col].green*-1)
		  				+(tempData[row+1][col+1].green*-1));
	    	  for (data[row][col].red = data[row][col].red; data[row][col].red < 0; data[row][col].red = 0) {}
	    	  for (data[row][col].blue = data[row][col].blue; data[row][col].blue < 0; data[row][col].blue = 0) {}
	    	  for (data[row][col].green = data[row][col].green; data[row][col].green < 0; data[row][col].green = 0) {}
	    	  for (data[row][col].red = data[row][col].red; data[row][col].red > 255; data[row][col].red = 255) {}
	    	  for (data[row][col].blue = data[row][col].blue; data[row][col].red > 255; data[row][col].blue = 255) {}
	    	  for (data[row][col].green = data[row][col].green; data[row][col].red > 255; data[row][col].green = 255) {}	
          
	          
	      }
	    }

	    pi.setData(data);
	  }
}

