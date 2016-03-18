import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class timeTableLogic {

	private String[] lineArray = new String[10];

	public timeTableLogic() {
		lineArray[0] = Constants.getURL("80000", "80110", 3);
		lineArray[1] = Constants.getURL("80000", "80002", 3);

	}

	public class getVarnhem extends Thread {
		@Override
		public void run() {
			String searchURL = lineArray[0];
			Journeys journeys = Parser.getJourneys(searchURL);

			for (Journey journey : journeys.getJourneys()) {
				int fyran = 4;
				
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);

				try {
					if (Integer.parseInt(journey.getLineOnFirstJourney()) == fyran) {
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
