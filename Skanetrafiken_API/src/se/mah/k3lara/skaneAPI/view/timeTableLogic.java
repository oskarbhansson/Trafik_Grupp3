package se.mah.k3lara.skaneAPI.view;

import java.util.Calendar;

import javax.swing.JTextField;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.view.SkanetrafikenGUI;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class timeTableLogic {

	private SkanetrafikenGUI trafikGUI;
	private String from;
	private String to;
	private int lineNr;
	private JTextField timetodep;
	private JTextField timetodep2;
	private JTextField timetodep3;
	private JTextField line;
	private JTextField endStation;
	
	
	
	

	public timeTableLogic(int lineNr, String from, String to, JTextField line, JTextField endStation, JTextField timetodep, JTextField timetodep2, JTextField timetodep3) {
		
		this.lineNr = lineNr;
		this.from = from;
		this.to = to;
		this.timetodep = timetodep;
		this.timetodep2 = timetodep2;
		this.timetodep3 = timetodep3;
		this.line = line;
		this.endStation = endStation;


		
		String searchURL = Constants.getURL(from, to, 10);
		
		Journeys journeys = Parser.getJourneys(searchURL);
		
		
		for (Journey journey : journeys.getJourneys()) {


			try {
				
				if (Integer.parseInt(journey.getLineOnFirstJourney()) == lineNr) {
					line.setText(journey.getLineOnFirstJourney());
					endStation.setText(journey.getEndStation().toString());

					timetodep.setText(journeys.getJourneys().get(0).getTimeToDeparture()+ " min");
					timetodep2.setText(journeys.getJourneys().get(1).getTimeToDeparture()+ " min");
					timetodep3.setText(journeys.getJourneys().get(2).getTimeToDeparture()+ " min");
					

				}
				
				
			} catch (java.lang.NumberFormatException e) {
				System.out.println("error with: " + to);

			}
			
		}
		
		
	}
		


}
