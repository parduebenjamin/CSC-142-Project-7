// Write your short report here (-2 if there is no report)
/**Benjamin Pardue - Programming Assignment 7 Report
 * 
 * For an additional filter, I applied the Gaussian filter to a 5x5 grid. Since the Gaussian filter appears to work by (starting with 1
 * in the corner) doubling each weight as it approaches the center, I used a weight grid that looks like:
 * 
 *  1	2	4	2	1
 *	2	4	8	4	2
 *	4	8	16	8	4
 *	2	4	8	4	2
 *  1	2	4	2	1
 *  
 *  This sums to 100, so I divided the weighted total of each color value by 100.
 *  I was initially surprised that the program didn't work, but then realized that, instead of starting one pixel from each edge, I would
 *  need to start two pixels from each edge. I used the same catcher for values above 255 or below 0 as I did for the Laplacian Filter
*
 * 
 * I was surprised initially that I couldn't create a horizontal flip by replacing [row] and [col] in the 'FlipHorizontalFilter' class.
 * It then occurred to me that the placement of the [] [] boxes (for the arrays) were important, and once I understood how the program worked
 * it was a matter of reversing the process of mirroring the rows and columns.
 * 
 * When creating the 'negative' filter, I was initially surprised that only half of my image was affected. I then realized that I was using
 * similar for statements as the horizontal / vertical flip filters, and for "(int row = 0; row < pi.getHeight() / 2; row++)" needed to
 * be changed to for "(int row = 0; row < pi.getHeight(); row++)"
 * 
 * I was lucky with this project because the directions to apply weighted filters were explained well in lecture, so I knew how to do this 
 * and didn't encounter any additional surprises or pitfalls. 
 * 
 * 
 * 
 * 
 */


/**
 * A class to configure the SnapShop application
 *
 * @author Benjamin Pardue
 * @version 05-31-2018
 */
public class SnapShopConfiguration
{
  /**
   * Method to configure the SnapShop.  Call methods like addFilter
   * and setDefaultFilename here.
   * @param theShop A pointer to the application
   */
  public static void configure(SnapShop theShop)
  {

    theShop.setDefaultFilename("C:/Users/u23s57/Downloads/PA7/PA7/billg.jpg");
    theShop.addFilter(new FlipHorizontalFilter(), "Flip Horizontal");
    theShop.addFilter(new FlipVerticalFilter(), "Flip Vertical");
    theShop.addFilter(new NegativeFilter(), "Negative");
    theShop.addFilter(new GaussianFilter(), "Gaussian");
    theShop.addFilter(new LaplacianFilter(), "Laplacian");
    theShop.addFilter(new UnsharpMaskingFilter(), "Unsharp Masking");
    theShop.addFilter(new EdgyFilter(), "Edgy");
    theShop.addFilter(new GaussianFiveByFive(), "Gaussian 5x5 Grid");
    
    
    // add your other filters below
  }
}
