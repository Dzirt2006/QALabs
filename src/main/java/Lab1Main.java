
public class Lab1Main {
	private String str;

//	public Lab1Main(String inpt) {
//		// TODO Auto-generated constructor stub
//		this.str = inpt;
//	}

	public Lab1Main() {
		// TODO Auto-generated constructor stub
	}

	public String getStr() {
		return str;
	}

	/**
	 * throws error if input string length<3
	 * @param str
	 * @throws StringIndexOutOfBoundsException
	 */
	public void setStr(String str) throws StringIndexOutOfBoundsException {
		if (str.length() < 3) {
			throw new StringIndexOutOfBoundsException(
					"Input string has to has length > 2 your lenght is " + str.length());
		} else {
			this.str = str;
		}
	}
}
