// item class

public class Item {
	private int stock;
  
  /**
	 * constructor
	 * pre: none
	 * post: item object created, stock set to 0
	 */
	public Item() {
		this.stock = 0;
	}
	
  /**
	 * gets the stock
	 * pre: none
	 * post: returns the stock.
	 */
  public int getStock() {
	 	return(this.stock);
	}

  /**
	 * adds to the stock
	 * pre: int added
	 * post: stock updated.
	 */
  public void addToStock(int added){
	 	this.stock = this.stock + added;
	}

  /**
	 * removes from the stock
	 * pre: int removed
	 * post: stock updated.
	 */
  public void removeFromStock(int removed){
    this.stock = this.stock - removed;
  }

}