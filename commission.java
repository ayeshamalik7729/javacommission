package cop2805;


public class commission {
	public static void computeIncome(double salesAmount) {

		if(salesAmount <= 5000) {
			System.out.println("$" + salesAmount + ":" + (salesAmount * .08 + 5000));

		}else if(salesAmount > 5000 && salesAmount <= 10000) {
			System.out.println("$" + salesAmount + ":" + ((5000 * .08) + (salesAmount - 5000)* .10 + 5000));

		}else if (salesAmount > 10000) {
			System.out.println("$" + salesAmount + ":" + ((5000 * .08) + (5000 * .10) + ((salesAmount - 10000) * .12) + 5000));
		}
	}
	public static void main (String args[]) {
		double salesAmount = 1000;
		while (salesAmount <= 20000) {

			computeIncome(salesAmount);
			salesAmount += 1000;
		}
	}

}

			
			
		
	


