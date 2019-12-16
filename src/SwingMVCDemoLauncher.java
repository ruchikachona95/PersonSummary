import javax.swing.JFrame;

public class SwingMVCDemoLauncher {

	public static void main(String[] args) {
		
		PersonController controller = new PersonController();
		PersonDetailsView detailsView = new PersonDetailsView(controller);
		PersonSummaryView summaryView = new PersonSummaryView(); //just an observer 
		
		controller.addObserver(detailsView);
		controller.addObserver(summaryView);
		
		JFrame detailsJFrame = new JFrame("Persons Details");
		detailsJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		detailsJFrame.setSize(300, 200);
		detailsJFrame.add(detailsView);
		
		JFrame summaryJFrame = new JFrame("Person Summary");
		summaryJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		summaryJFrame.setSize(300, 100);
		summaryJFrame.add(summaryView);
		
		detailsJFrame.setVisible(true);
		summaryJFrame.setVisible(true);
		
	}

}
