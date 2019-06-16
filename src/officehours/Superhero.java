package officehours;

public class Superhero {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// this method returns encrypted version of name
	//if name is batman, so this method will return ******
	//if name is superman, so this method will return ********
	public String getEncryptName() {
		String encryptedName = "";
		// batman --> ******
		for (int i = 0; i < this.name.length(); i++) {
			// 4 letters -> 4 stars ****
			// 5 letters -> 5 stars *****
			encryptedName += "*";
		}
		//****** : 6 letters.
		//+ " : " + encryptedName.length() + " letters."
		return encryptedName;
	}

}