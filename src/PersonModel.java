import java.util.Observable;

public class PersonModel extends Observable{
	
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		this.setChanged();
		this.notifyObservers();
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
		this.setChanged();
		this.notifyObservers();
	}
	
	public String getFullName(){
		return firstName + " " + lastName;
	}
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append(" ")
		.append(firstName).append(",")
		.append(lastName).append(" (")
		.append(getFullName()).append(")")
		.append(" ");
		
		return builder.toString();
		}
}
