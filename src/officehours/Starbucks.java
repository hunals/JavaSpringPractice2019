package officehours;

	public class Starbucks {
		  private double price;
		  private String item;
		  private String[] topings = { "Chocolate", "Sugar", "Caramel", "Coconut milk", "Regular milk", "Whip cream" };
		  private String[] drinks = { "Coffee", "Mocha", "Latte", "Esresso", "Icetea", "Tea" };
		  private String toping;
		  private boolean isMember;
		  private String name;
		  
		  public Starbucks(double price, String item, String toping, boolean isMember, String name) {
		    this.price = price;
		    this.item = item;
		    this.isMember = isMember;
		    this.name = name;
		    this.toping = toping;
		  }
		  public Starbucks() {
		    
		  }
		  
		  public String getToping() {
		    return toping;
		  }
		  public void setToping(String toping) {
		    this.toping = toping;
		  }

		  public String getName() {
		    return name;
		  }

		  public void setName(String name) {
		    this.name = name;
		  }

		  public double getPrice() {
		    return price;
		  }

		  public void setPrice(double price) {
		    this.price = price;
		  }

		  public String getItem() {
		    return item;
		  }

		  public void setItem(String item) {
		    this.item = item;
		  }

		  public String[] getTopings() {
		    return topings;
		  }

		  public String[] getDrinks() {
		    return drinks;
		  }

		  public boolean isMember() {
		    return isMember;
		  }

		  public void setMember(boolean isMember) {
		    this.isMember = isMember;
		  }
		  
		  @Override
		  public String toString() {
		    return "Starbucks [price=" + price + ", item=" + item + ", isMember=" + isMember + ", name="+name+"]";
		  }


		}