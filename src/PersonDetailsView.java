import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Observer;
import java.util.Observable;

public class PersonDetailsView extends JPanel implements Observer {
	
	private JTextField firstNameJTextField;
	private JTextField lastNameJTextField;
	private JLabel fullNameJLabel;
	private PersonController controller;
	
	public PersonDetailsView(PersonController controller){
		this.controller = controller;
		firstNameJTextField = new JTextField();
		lastNameJTextField = new JTextField();
		fullNameJLabel = new JLabel();
		
		registerEvents();
		
		JPanel labelsJPanel	= new JPanel(new GridLayout(3,1));
		labelsJPanel.add(new JLabel("First Name"));
		labelsJPanel.add(new JLabel("Last Name"));
		labelsJPanel.add(new JLabel("Full Name"));
		JPanel fieldsJPanel = new JPanel(new GridLayout(3,1));
		fieldsJPanel.add(firstNameJTextField);
		fieldsJPanel.add(lastNameJTextField);
		fieldsJPanel.add(fullNameJLabel);
		this.setLayout(new BorderLayout());
		this.add(labelsJPanel, BorderLayout.WEST);
		this.add(fieldsJPanel, BorderLayout.CENTER);
	}
	
	@Override
	public void update(Observable o, Object args){
		if(o instanceof PersonModel){
			PersonModel model = (PersonModel) o;
			firstNameJTextField.setText(model.getFirstName());
			lastNameJTextField.setText(model.getLastName());
			fullNameJLabel.setText(model.getFullName());
		
		}
		
	}
	
	private void registerEvents(){
		firstNameJTextField.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
				controller.setFirstName(firstNameJTextField.getText());
			}
			
		});
		
lastNameJTextField.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
				controller.setLastName(lastNameJTextField.getText());
			}
			
		});
	}
	
	
}
