/**
 * Filter that applies weights
 * need to create a temp image and use the values for weights
 * 05-31-2018 - 
 * 
 */
public class GaussianFiveByFive implements Filter
{
	
	
	  public void filter(PixelImage pi)
	  {
	    Pixel[][] data = pi.getData();
	    Pixel[][] tempData = pi.getData();

	    for (int col = 2; col < pi.getWidth()-2; col++)
	    {
	      for (int row = 2; row < (pi.getHeight()-2); row++)
	      {
	          Pixel temp = data[row][col];
	    	  data[row][col].red =  (
	    			  				+(tempData[row-2][col-2].red*1)
	    			  				+(tempData[row-2][col-1].red*2)
	    			  				+(tempData[row-2][col].red*4)
					  				+(tempData[row-2][col+1].red*2)
					  				+(tempData[row-2][col+2].red*1)	
	    			  			
	    			  				+(tempData[row-1][col-2].red*2)
	    			  				+(tempData[row-1][col-1].red*4)
	    			  				+(tempData[row-1][col].red*8)
					  				+(tempData[row-1][col+1].red*4)
					  				+(tempData[row-1][col+2].red*2)	

	    			  				+(tempData[row-0][col-2].red*4)
	    			  				+(tempData[row-0][col-1].red*8)
	    			  				+(tempData[row-0][col].red*16)
					  				+(tempData[row-0][col+1].red*8)
					  				+(tempData[row-0][col+2].red*4)	
					  				
	    			  				+(tempData[row+1][col-2].red*2)
	    			  				+(tempData[row+1][col-1].red*4)
	    			  				+(tempData[row+1][col].red*8)
					  				+(tempData[row+1][col+1].red*4)
					  				+(tempData[row+1][col+2].red*2)	
					  				
	    			  				+(tempData[row+2][col-2].red*1)
	    			  				+(tempData[row+2][col-1].red*2)
	    			  				+(tempData[row+2][col].red*4)
					  				+(tempData[row+2][col+1].red*2)
					  				+(tempData[row+2][col+2].red*1)	
	    			  				)/100;
	    	  
	    	  
	    	  data[row][col].green =  (
		  				+(tempData[row-2][col-2].green*1)
		  				+(tempData[row-2][col-1].green*2)
		  				+(tempData[row-2][col].green*4)
		  				+(tempData[row-2][col+1].green*2)
		  				+(tempData[row-2][col+2].green*1)	
		  			
		  				+(tempData[row-1][col-2].green*2)
		  				+(tempData[row-1][col-1].green*4)
		  				+(tempData[row-1][col].green*8)
		  				+(tempData[row-1][col+1].green*4)
		  				+(tempData[row-1][col+2].green*2)	

		  				+(tempData[row-0][col-2].green*4)
		  				+(tempData[row-0][col-1].green*8)
		  				+(tempData[row-0][col].green*16)
		  				+(tempData[row-0][col+1].green*8)
		  				+(tempData[row-0][col+2].green*4)	
		  				
		  				+(tempData[row+1][col-2].green*2)
		  				+(tempData[row+1][col-1].green*4)
		  				+(tempData[row+1][col].green*8)
		  				+(tempData[row+1][col+1].green*4)
		  				+(tempData[row+1][col+2].green*2)	
		  				
		  				+(tempData[row+2][col-2].green*1)
		  				+(tempData[row+2][col-1].green*2)
		  				+(tempData[row+2][col].green*4)
		  				+(tempData[row+2][col+1].green*2)
		  				+(tempData[row+2][col+2].green*1)	
		  				)/100;


	    	  data[row][col].blue =  (
		  				+(tempData[row-2][col-2].blue*1)
		  				+(tempData[row-2][col-1].blue*2)
		  				+(tempData[row-2][col].blue*4)
		  				+(tempData[row-2][col+1].blue*2)
		  				+(tempData[row-2][col+2].blue*1)	
		  			
		  				+(tempData[row-1][col-2].blue*2)
		  				+(tempData[row-1][col-1].blue*4)
		  				+(tempData[row-1][col].blue*8)
		  				+(tempData[row-1][col+1].blue*4)
		  				+(tempData[row-1][col+2].blue*2)	

		  				+(tempData[row-0][col-2].blue*4)
		  				+(tempData[row-0][col-1].blue*8)
		  				+(tempData[row-0][col].blue*16)
		  				+(tempData[row-0][col+1].blue*8)
		  				+(tempData[row-0][col+2].blue*4)	
		  				
		  				+(tempData[row+1][col-2].blue*2)
		  				+(tempData[row+1][col-1].blue*4)
		  				+(tempData[row+1][col].blue*8)
		  				+(tempData[row+1][col+1].blue*4)
		  				+(tempData[row+1][col+2].blue*2)	
		  				
		  				+(tempData[row+2][col-2].blue*1)
		  				+(tempData[row+2][col-1].blue*2)
		  				+(tempData[row+2][col].blue*4)
		  				+(tempData[row+2][col+1].blue*2)
		  				+(tempData[row+2][col+2].blue*1)	
		  				)/100;

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

