import java.util.Observer;

public class PersonController {

	private PersonModel model;

	public PersonController() {
		model = new PersonModel();
	}

	public void addObserver(Observer observer){
		model.addObserver(observer);
	}
	public void	setFirstName(String	firstName){
		model.setFirstName(firstName);
	}
	public void	setLastName(String lastName){
		model.setLastName(lastName);
	}


}
