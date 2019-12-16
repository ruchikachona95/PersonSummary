import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.util.Observer;
import java.util.Observable;


public class PersonSummaryView extends JPanel implements Observer{
	private JLabel personJLabel = new JLabel();

	public PersonSummaryView() {
		this.setLayout(new BorderLayout());
		this.add(personJLabel,BorderLayout.CENTER);
	}
	
	@Override
	public void update (Observable o, Object args){
		personJLabel.setText(o.toString());
	}

}
