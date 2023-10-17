
public class CheckProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sellingPrice=1000;
		int buyingPrice=900;
		if(sellingPrice>buyingPrice) {
			System.out.println("Profit is "+(sellingPrice-buyingPrice));
		}else
		{
			System.out.println("Loss is "+(buyingPrice-sellingPrice));
		}

	}

}
