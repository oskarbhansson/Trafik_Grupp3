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
	private JTextField line;
	private JTextField endStation;
	
	
	
	

	public timeTableLogic(int lineNr, String from, String to, JTextField line, JTextField endStation, JTextField timetodep) {
		
		this.lineNr = lineNr;
		this.from = from;
		this.to = to;
		this.timetodep = timetodep;
		this.line = line;
		this.endStation = endStation;
		
		String searchURL = Constants.getURL(from, to, 2);
		Journeys journeys = Parser.getJourneys(searchURL);

		for (Journey journey : journeys.getJourneys()) {


			try {
				if (Integer.parseInt(journey.getLineOnFirstJourney()) == lineNr) {
					line.setText(journey.getLineOnFirstJourney());
					endStation.setText(journey.getEndStation().toString());
					timetodep.setText(journey.getTimeToDeparture());

				}

			} catch (java.lang.NumberFormatException e) {
				System.out.println("error with: " + lineNr);

			}
		}
	}
		
		

	
	
	SkanetrafikenGUI skanetrafikenGUI = new SkanetrafikenGUI();

}
