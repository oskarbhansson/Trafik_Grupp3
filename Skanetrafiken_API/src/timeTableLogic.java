import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.view.SkanetrafikenGUI;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class timeTableLogic {


	public timeTableLogic() {
		
		new getVarnhem().start();


	}

	public class getVarnhem extends Thread {
		@Override
		public void run() {
			String searchURL = Constants.getURL("80000", "80110", 3);
			Journeys journeys = Parser.getJourneys(searchURL);

			for (Journey journey : journeys.getJourneys()) {
				int fyran = 4;
				
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);

				try {
					if (Integer.parseInt(journey.getLineOnFirstJourney()) == fyran) {
						
						SkanetrafikenGUI.textField_4.setText(journey.getLineOnFirstJourney());
						SkanetrafikenGUI.textField_5.setText(journey.getTimeToDeparture());
					

						SkanetrafikenGUI.textField_2.setText(journey.getEndStation().toString());
						
						
						System.out.println(journey.getLineOnFirstJourney());
						System.out.println(journey.getEndStation().toString());
						System.out.println(" Departs " + time + " " + " that is in " + journey.getTimeToDeparture()
								+ " minutes. And it is " + journey.getDepTimeDeviation() + " min late");

					}

				} catch (java.lang.NumberFormatException e) {
					System.out.println("error");

				}
			}
		}

	}

}
