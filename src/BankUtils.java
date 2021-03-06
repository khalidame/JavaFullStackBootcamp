
public class BankUtils {
	private BankAccount[] arr;

	public BankUtils(int size) {
		arr = new BankAccount[size];
	}

	public boolean newCustomer(BankAccount ba) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = ba;
				return true;
			}
		}
		return false;
	}
	
	public boolean modifyCustomer(int accNo, BankAccount acc) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getAccNo() == accNo) {
				arr[i] = acc;
				return true;
			}
		}
		return false;
	}
	
	public boolean getCustomer(int accNo) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getAccNo() == accNo) {
				return true;
			}
		}
		return false;
	}
	
	public boolean getCustomers(int accNo) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				return true;
			}
		}
		return false;
	}

}

