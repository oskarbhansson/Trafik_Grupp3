import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class timeTableLogic {

	

	public timeTableLogic() {
		

	}

	public class getSegevang extends Thread {
		@Override
		public void run() {
			String searchURL = Constants.getURL("80000", "80200", 3);
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
	
	public class getBernstorp extends Thread {
		@Override
		public void run() {
			String searchURL = Constants.getURL("80000", "31033", 3);
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
