package stock.java;

public class StockManagement {

	// instance variables
	private String stockNames;
	private int numOfShare;
	private double sharePrice;

	public String getStockNames() {
		return stockNames;
	}

	public void setStockNames(String stockNames) {
		this.stockNames = stockNames;
	}

	public int getNumOfShare() {
		return numOfShare;
	}

	public void setNumOfShare(int numOfShare) {
		this.numOfShare = numOfShare;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "StockManagement {\nstockNames=" + stockNames + ", numOfShare=" + numOfShare + ", sharePrice="
				+ sharePrice + "\n};";
	}

	public void Stock(String stockNames, int numOfShare, double sharePrice, double totalSharePrice) {
		this.stockNames = stockNames;
		this.numOfShare = numOfShare;
		this.sharePrice = sharePrice;

	}
}