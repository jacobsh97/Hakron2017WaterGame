
import java.*;
import java.util.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
		
		otherint happiness = new otherint();
		int week;
		otherint extra = new otherint();
		otherint resources = new otherint();
		otherint helpincrement = new otherint();
		int algaeintensity;
		int algaelocation;
		otherboolean researchcompleted = new otherboolean(false);
		boolean win;
		boolean lose;
		
		Location loc1 = new Location(1);
		Location loc2 = new Location(2);
		Location loc3 = new Location(3);
		Location loc4 = new Location(4);
		Location loc5 = new Location(5);
		Location loc6 = new Location(6);
		Location loc7 = new Location(7);
		Location loc8 = new Location(8);
		ArrayList<Location> list = new ArrayList<Location>();
		list.add(loc1);
		list.add(loc2);
		list.add(loc3);
		list.add(loc4);
		list.add(loc5);
		list.add(loc6);
		list.add(loc7);
		list.add(loc8);
		
		
		JLabel firsttext;
		JLabel totalhappiness;
		JLabel maintext;
		JLabel statscounter;
		JLabel loc1stats;
		JLabel loc2stats;
		JLabel loc3stats;
		JLabel loc4stats;
		JLabel loc5stats;
		JLabel loc6stats;
		JLabel loc7stats;
		JLabel loc8stats;
		JSpinner textinput;
		JButton firstbutton;
		JButton buildresearch;
		JButton attemptresearch;
		JButton sendwater;
		JButton buildpurification;
		JButton increasehappiness;
		JButton help;
		JButton getresources;
		JButton nextweek;
		JButton next;
		JProgressBar happinessprogress = new JProgressBar();
		otherboolean halter = new otherboolean(true);
		otherboolean weekhalter = new otherboolean(true);
		
		//creates the frame
		JFrame frame = new JFrame("Water Game 2017");
		frame.setBounds(0, 0, 1080, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//creates and sets up the main text display
		firsttext = new JLabel("<html>"+"Cyanobacteria in Lake Erie"+"</html>");
		firsttext.setBounds(0,0,1000,700);
		firsttext.setFont(new Font("Tahoma", Font.BOLD, 72));
		firsttext.setVerticalAlignment(SwingConstants.TOP);
		firsttext.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(firsttext);
		
		//creates and sets up the location 1 stats
		loc1stats = new JLabel("<html>"+"Location " + loc1.getLocationNumber() + "<br>Algae Level:" + loc1.getAlgaeLevel() + "<br>Water Ammount: " + loc1.getAmmountOfWater() + "<br>Research Station: " + loc1.hasResearchStationString() + "<br>Purification Plant: " + loc1.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc1.phosphorousConcentration() + "</html>");
		loc1stats.setBounds(0,100,200,200);
		loc1stats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		loc1stats.setVerticalAlignment(SwingConstants.TOP);
		loc1stats.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(loc1stats);
		loc1stats.setVisible(false);
		
		//creates and sets up the location 2 stats
		loc2stats = new JLabel("<html>"+"Location " + loc2.getLocationNumber() + "<br>Algae Level:" + loc2.getAlgaeLevel() + "<br>Water Ammount: " + loc2.getAmmountOfWater() + "<br>Research Station: " + loc2.hasResearchStationString() + "<br>Purification Plant: " + loc2.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc2.phosphorousConcentration() + "</html>");
		loc2stats.setBounds(200,100,200,200);
		loc2stats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		loc2stats.setVerticalAlignment(SwingConstants.TOP);
		loc2stats.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(loc2stats);
		loc2stats.setVisible(false);
		
		//creates and sets up the location 3 stats
		loc3stats = new JLabel("<html>"+"Location " + loc3.getLocationNumber() + "<br>Algae Level:" + loc3.getAlgaeLevel() + "<br>Water Ammount: " + loc3.getAmmountOfWater() + "<br>Research Station: " + loc3.hasResearchStationString() + "<br>Purification Plant: " + loc3.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc3.phosphorousConcentration() + "</html>");
		loc3stats.setBounds(400,100,200,200);
		loc3stats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		loc3stats.setVerticalAlignment(SwingConstants.TOP);
		loc3stats.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(loc3stats);
		loc3stats.setVisible(false);
		
		//creates and sets up the location 4 stats
		loc4stats = new JLabel("<html>"+"Location " + loc4.getLocationNumber() + "<br>Algae Level:" + loc4.getAlgaeLevel() + "<br>Water Ammount: " + loc4.getAmmountOfWater() + "<br>Research Station: " + loc4.hasResearchStationString() + "<br>Purification Plant: " + loc4.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc4.phosphorousConcentration() + "</html>");
		loc4stats.setBounds(600,100,200,200);
		loc4stats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		loc4stats.setVerticalAlignment(SwingConstants.TOP);
		loc4stats.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(loc4stats);
		loc4stats.setVisible(false);
		
		//creates and sets up the location 5 stats
		loc5stats = new JLabel("<html>"+"Location " + loc5.getLocationNumber() + "<br>Algae Level:" + loc5.getAlgaeLevel() + "<br>Water Ammount: " + loc5.getAmmountOfWater() + "<br>Research Station: " + loc5.hasResearchStationString() + "<br>Purification Plant: " + loc5.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc5.phosphorousConcentration() + "</html>");
		loc5stats.setBounds(0,300,200,200);
		loc5stats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		loc5stats.setVerticalAlignment(SwingConstants.TOP);
		loc5stats.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(loc5stats);
		loc5stats.setVisible(false);
		
		//creates and sets up the location 6 stats
		loc6stats = new JLabel("<html>"+"Location " + loc6.getLocationNumber() + "<br>Algae Level:" + loc6.getAlgaeLevel() + "<br>Water Ammount: " + loc6.getAmmountOfWater() + "<br>Research Station: " + loc6.hasResearchStationString() + "<br>Purification Plant: " + loc6.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc6.phosphorousConcentration() + "</html>");
		loc6stats.setBounds(200,300,200,200);
		loc6stats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		loc6stats.setVerticalAlignment(SwingConstants.TOP);
		loc6stats.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(loc6stats);
		loc6stats.setVisible(false);
		
		//creates and sets up the location 7 stats
		loc7stats = new JLabel("<html>"+"Location " + loc7.getLocationNumber() + "<br>Algae Level:" + loc7.getAlgaeLevel() + "<br>Water Ammount: " + loc7.getAmmountOfWater() + "<br>Research Station: " + loc7.hasResearchStationString() + "<br>Purification Plant: " + loc7.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc7.phosphorousConcentration() + "</html>");
		loc7stats.setBounds(400,300,200,200);
		loc7stats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		loc7stats.setVerticalAlignment(SwingConstants.TOP);
		loc7stats.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(loc7stats);
		loc7stats.setVisible(false);
		
		//creates and sets up the location 8 stats
		loc8stats = new JLabel("<html>"+"Location " + loc8.getLocationNumber() + "<br>Algae Level:" + loc8.getAlgaeLevel() + "<br>Water Ammount: " + loc8.getAmmountOfWater() + "<br>Research Station: " + loc8.hasResearchStationString() + "<br>Purification Plant: " + loc8.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc8.phosphorousConcentration() + "</html>");
		loc8stats.setBounds(600,300,200,200);
		loc8stats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		loc8stats.setVerticalAlignment(SwingConstants.TOP);
		loc8stats.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(loc8stats);
		loc8stats.setVisible(false);
		
		//creates and sets up the first button
		firstbutton = new JButton("Next");
		firstbutton.setBounds(500,450,200,35);
		frame.getContentPane().add(firstbutton);
		firstbutton.setVisible(true);
		
		//creates and sets up the build research station button
		buildresearch = new JButton("<html>"+"Build data collection station"+"</html>");
		buildresearch.setBounds(300,600,100,50);
		frame.getContentPane().add(buildresearch);
		buildresearch.setVisible(false);
		
		//creates and sets up the attempt research button
		attemptresearch = new JButton("<html>"+"Attempt research"+"</html>");
		attemptresearch.setBounds(400,600,100,50);
		frame.getContentPane().add(attemptresearch);
		attemptresearch.setVisible(false);
		
		//creates and sets up the deliver water button
		sendwater = new JButton("<html>"+"Send water"+"</html>");
		sendwater.setBounds(500,600,100,50);
		frame.getContentPane().add(sendwater);
		sendwater.setVisible(false);
		
		//creates and sets up the build purification plant button
		buildpurification = new JButton("<html>"+"Build purification plant"+"</html>");
		buildpurification.setBounds(600,600,100,50);
		frame.getContentPane().add(buildpurification);
		buildpurification.setVisible(false);
		
		//creates and sets up the increase happiness button
		increasehappiness = new JButton("<html>"+"Increase happiness"+"</html>");
		increasehappiness.setBounds(700,600,100,50);
		frame.getContentPane().add(increasehappiness);
		increasehappiness.setVisible(false);
		
		//creates and sets up the get resources button
		getresources = new JButton("<html>"+"Get resources"+"</html>");
		getresources.setBounds(800,600,100,50);
		frame.getContentPane().add(getresources);
		getresources.setVisible(false);
		
		//creates and sets up the next week button
		nextweek = new JButton("<html>"+"Next week"+"</html>");
		nextweek.setBounds(900,600,100,50);
		frame.getContentPane().add(nextweek);
		nextweek.setVisible(false);
		
		//creates and sets up the next button
		next = new JButton("<html>"+"Next"+"</html>");
		next.setBounds(900,400,100,50);
		frame.getContentPane().add(next);
		next.setVisible(false);
		
		//creates and sets up the happiness progress bar
		happinessprogress.setStringPainted(true);
		happinessprogress.setBounds(50, 50, 950, 20);
		happinessprogress.setMaximum(50);
		frame.getContentPane().add(happinessprogress);
		happinessprogress.setVisible(false);
		
		//creates and sets up the total happiness text
		totalhappiness = new JLabel("<html>"+"Total Happiness"+"</hinctml>");
		totalhappiness.setBounds(30,25,1000,700);
		totalhappiness.setFont(new Font("Tahoma", Font.PLAIN, 20));
		totalhappiness.setVerticalAlignment(SwingConstants.TOP);
		totalhappiness.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(totalhappiness);
		totalhappiness.setVisible(false);
		
		//creates and sets up the main text
		maintext = new JLabel("<html>"+""+"</html>");
		maintext.setBounds(30,500,1000,100);
		maintext.setFont(new Font("Tahoma", Font.PLAIN, 15));
		maintext.setVerticalAlignment(SwingConstants.TOP);
		maintext.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(maintext);
		maintext.setVisible(false);
		
		//creates and sets up the main text input
		textinput = new JSpinner();
		textinput.setBounds(30, 470, 1000, 30);
		frame.getContentPane().add(textinput);
		textinput.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textinput.setVisible(false);
		
		//creates and sets up the help button
		help = new JButton("<html>"+"?"+"</html>");
		help.setBounds(1012,0,50,50);
		frame.getContentPane().add(help);
		help.setVisible(false);
		
		//sets to value of week and resources to 0
		week = 0;
		resources.set(0);
		
		//creates and sets up the stats counter text
		statscounter = new JLabel("<html>"+"Week: "+ week + " Resources: " + resources.get() +"</html>");
		statscounter.setBounds(0,0,1000,700);
		statscounter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		statscounter.setVerticalAlignment(SwingConstants.TOP);
		statscounter.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(statscounter);
		statscounter.setVisible(false);
		
		//sets what the first button does
		firstbutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
					halter.setFalse();
			}
			});
		
		//sets what the build research station button does
		buildresearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				
				if (resources.get() < 4){
					maintext.setText("You do not have the funds to build a research station");
				}
				else if((int) textinput.getValue()-1 < 0 || (int) textinput.getValue()-1 > 7){
					maintext.setText("<html>" + "That is not a valid location" + "</html>");
				}
				else if(list.get((int) textinput.getValue()-1).hasResearchStation()){
					maintext.setText("<html>" + "There is already a research station in this location, you can't build another one there" + "</html>");
				}
				else{
					list.get((int) textinput.getValue()-1).addResearchStation();
					resources.subtract(4);
					maintext.setText("<html>" + "Research station sucessfully built" + "</html>");
				}
			}
			});
		
		//sets what the attempt research button does
		attemptresearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if((int) (textinput.getValue()) > resources.get()){
					maintext.setText("<html>" + "You don't have the funds to atempt research at this level right now" + "</html>");
				}
				else if((int) textinput.getValue() < 1){
					maintext.setText("<html>" + "You can't research with less than one resource point" + "</html>");
				}
				else if(researchcompleted.get()){
					maintext.setText("<html>" + "You have already completed this research, you can't research it again" + "</html>");
				}
				else{
					if((int) (Math.random()*20 + 1) <= (int) (textinput.getValue())){
						maintext.setText("<html>" + "You have successfully completed this research, you can now bulid purification plants" + "</html>");
						researchcompleted.setTrue();
						resources.subtract((int) (textinput.getValue()));
					}
					else{
						maintext.setText("<html>" + "You have failed to complete the research this time, but you can try again later" + "</html>");
						resources.subtract((int) (textinput.getValue()));
					}
				}
			}
			});
		
		//sets what the send water button does
		sendwater.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				int waterammount;
				waterammount = ((int) (textinput.getValue())/10);
				if(((int) textinput.getValue())%10-1 <= 0 || ((int) textinput.getValue())%10-1 >= 9 || waterammount > 0){
					maintext.setText("<html>" + "That is not a valid location or water ammount." + "</html>");
				}
				else if(waterammount <= resources.get()){
					list.get(((int) textinput.getValue())%10-1).addWater(waterammount);
					resources.subtract(waterammount);
					maintext.setText("<html>" + waterammount + " water sucessfully transfered to location " + ((int) textinput.getValue())%10 + "</html>");
				}
				else{
					maintext.setText("<html>" + "You don't have the funds to to send this much water right now" + "</html>");
				}
			}
			});
		
		//sets what the build purification plant button does
		buildpurification.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
					if(researchcompleted.get() == false){
						maintext.setText("<html>" + "You haven't completed the required research to build this yet" + "</html>");
					}
					else if(resources.get() < 7){
						maintext.setText("<html>" + "You don't have the funds to build this purification plant right now" + "</html>");
					}
					else if((int) textinput.getValue()-1 < 0 || (int) textinput.getValue()-1 > 7){
						maintext.setText("<html>" + "That is not a valid location" + "</html>");
					}
					else if(list.get((int) textinput.getValue()-1).hasWaterPurification()){
						maintext.setText("<html>" + "There is already a purification plant at this location, you can't build another one here" + "</html>");
					}
					else{
						list.get((int) textinput.getValue()-1).addWaterPurification();
						resources.subtract(7);
						maintext.setText("<html>" + "Water purification plat sucessfully built" + "</html>");	
					}
			}
			});
		
		//sets what the increase happiness button does
		increasehappiness.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(resources.get() <= (int) textinput.getValue()){
					happiness.add((int) textinput.getValue());
					resources.subtract((int) textinput.getValue());
					maintext.setText("<html>" + "PR campaign sucessfully lauched" + "</html>");
				}
				else{
					maintext.setText("<html>" + "You don't have the funds to lauch this big of a campaign right now." + "</html>");
				}
			}
			});
		
		//sets what the get resources button does
		getresources.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(resources.get() < 9){
					maintext.setText("<html>" + "You don't have the funds to launh an eduction campaign right now" + "</html>");
				}
				else{
					resources.subtract(9);
					extra.add(1);
					maintext.setText("<html>" + "Education campaign sucessfully launched" + "</html>");
				}
			}
			});
		
		//sets what the help button does
		help.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				helpincrement.add(1);
				maintext.setFont(new Font("Tahoma", Font.PLAIN, 15));
				if(helpincrement.get() == 1){
					maintext.setText("<html>" + "You can scroll through the rules by hitting the ? button." + "</html>");
				}
				else if(helpincrement.get() == 2){
					maintext.setText("<html>" + "Build Data Collection Station: (cost 4) Put the number of the location where you would like to build the Data Collection Station in the box and click the Build Data Collection Station button to build one.  A Data Collection Station uses spectroscopy, the measuring of light wavelengths, to determine the amomout of phosphorous in different locations at the lake." + "</html>");
				}
				else if(helpincrement.get() == 3){
					maintext.setText("<html>" + "Attempt Research: (cost variable) By studying the natural filtration of some of the organisms in the lake, like the zebra muscle, you think you will be able to develop better water purification plants.  However, this won't be easy, you are able to spend money to atempt to research the better water purification plants, the more you spend the better chances you have of completing the research.  To attempt to research put the number of points you would like to spend on research into the box and click the Atempt Research button.  If you do complete the research, you will be able to build Water Purification Plants" + "</html>");
				}
				else if(helpincrement.get() == 4){
					maintext.setText("<html>" + "Send Water: (cost 1/water sent) When the harmful algae blooms in certian locations they can be left without water for periods of time.  If algae blooms in a location and there is no exteral water delivered people will get sick and happiness will drop.  Water in a location when algae blooms will be used up to decrease the affects of the cyanobacteria and less happiness will be lost.  In order to send water to a location put a two digit number into the box where the first digit is the ammount of water you want to send and the second digit is the location you would like to send it to, then click the Send Water button.  For example if you wanted to send 3 water to location 4 you would type 34 into the box." + "</html>");
				}
				else if(helpincrement.get() == 5){
					maintext.setText("<html>" + "Build Water Purification Plant: (cost 7) Once you have completed the research you are able to start buliding water purification plants.  If all eight locations contain water purification plants you win the game.  Not only are water purification plants needed for one of the victory conditions, they are also very useful for dealing with algae blooms when they happen.  Any algae bloom in a location with a water treatment plant will be half as effective and take half as much water to prevent people from getting sick.  In order to build a Water Treatment Plant put the number of the location where you would like to build the Water Treatment Plant in the box and click the Buld Purification Plant button." + "</html>");
				}
				else if(helpincrement.get() == 6){
					maintext.setText("<html>" + "Increase Happiness: (cost variable) If you think that your happiness has dropped too low you are able to launch a PR campaign to try to increase it.  The more resources that you spend on the campaign the more your happiness will increase.  In order to increase happiness put the ammount you would like to spend into the box and then click the Increase Happiness button." + "</html>");
				}
				else if(helpincrement.get() == 7){
					maintext.setText("<html>" + "Get More Resources: (cost 9) You are also able to increase the ammount of resources you get per round, by educating the public about the algae problem.  If you would like to increase the ammount of resourses that you get each round click on the Get Resources button to increase your resourses per round by one." + "</html>");
				}
				else if(helpincrement.get() == 8){
					maintext.setText("<html>" + "Next Week: When you have taken all of the actions that you want/are able to in a week click on the Next Week button to advance to the next week." + "</html>");
					helpincrement.set(0);
				}
			}
			});
		
		//sets what the next week button does
		nextweek.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				weekhalter.setFalse();
			}
			});
		//sets what the next button does
		nextweek.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				halter.setFalse();
			}
			});
		
		//makes hitting enter set the halter to false
				textinput.addKeyListener(new KeyAdapter() {
					@Override
					 public void keyPressed(KeyEvent evt)
			        {
			            if(evt.getKeyCode() == KeyEvent.VK_ENTER)
			            {
			                halter.setFalse();
			            }
			        }
				});
				
				
				
		//makes the frame visible
		frame.setVisible(true);
		
		
		//MAIN CODE STARTS HERE
		
		
		//Waits for user to start the game
		halter.setTrue();
		while(halter.get()){
			firsttext.setText("<html>"+"Cyanobacteria in Lake Erie"+"</html>");
		}
		halter.setTrue();
		
		//changes the size of the text
		firsttext.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		// tells the player the problem and their role in the game Waits for user to continue the game
		halter.setTrue();
		while(halter.get()){
			firsttext.setText("<html>"+"In this game you play as the head of the Ohio Department of Health.  You have been given the task of dealing with the harmful algae blooms that have been happening in Lake Erie in recent years.  These harmful algae, which are different than noramal algae, release harmful cyanobacteria into the water.  It seems that the reason that so many harmful algae have been appering is due to an increase in phosphorous and nitrogen in the water.  These are both major components in many fertilizers and have been entering the lake via runoff water from farms.  Your goal is to fix this problem which you can do in one of two ways, you can either install better water purification plants in all eight locations along the lake or you can save up 150 resources to launch a campaign to change the type of fertilizers that farmers use.  However, as problems with the algae come up the happiness of the population decreases, if happiness ever hits zero you are kicked out of office and lose the game.  You have a few actions that you are able to take to deal with this problem and reach your goal which are listed on the next page."+"</html>");
		}
		halter.setTrue();
		
		//changes the size of the text
		firsttext.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		while(halter.get()){
			firsttext.setText("<html>" + "Build Data Collection Station: (cost 4) Put the number of the location where you would like to build the Data Collection Station in the box and click the Build Data Collection Station button to build one.  A Data Collection Station uses spectroscopy, the measuring of light wavelengths, to determine the amomout of phosphorous in different locations at the lake."
					+ "<br><br>Attempt Research: (cost variable) By studying the natural filtration of some of the organisms in the lake, like the zebra muscle, you think you will be able to develop better water purification plants.  However, this won't be easy, you are able to spend money to atempt to research the better water purification plants, the more you spend the better chances you have of completing the research.  To attempt to research put the number of points you would like to spend on research into the box and click the Atempt Research button.  If you do complete the research, you will be able to build Water Purification Plants"
					+ "<br><br>Send Water: (cost 1/water sent) When the harmful algae blooms in certian locations they can be left without water for periods of time.  If algae blooms in a location and there is no exteral water delivered people will get sick and happiness will drop.  Water in a location when algae blooms will be used up to decrease the affects of the cyanobacteria and less happiness will be lost.  In order to send water to a location put a two digit number into the box where the first digit is the ammount of water you want to send and the second digit is the location you would like to send it to, then click the Send Water button.  For example if you wanted to send 3 water to location 4 you would type 34 into the box." + "</html>");
		}
		halter.setTrue();
		while(halter.get()){
			firsttext.setText("<html>" + "Build Water Purification Plant: (cost 7) Once you have completed the research you are able to start buliding water purification plants.  If all eight locations contain water purification plants you win the game.  Not only are water purification plants needed for one of the victory conditions, they are also very useful for dealing with algae blooms when they happen.  Any algae bloom in a location with a water treatment plant will be half as effective and take half as much water to prevent people from getting sick.  In order to build a Water Treatment Plant put the number of the location where you would like to build the Water Treatment Plant in the box and click the Buld Purification Plant button."
					+ "<br><br>Increase Happiness: (cost variable) If you think that your happiness has dropped too low you are able to launch a PR campaign to try to increase it.  The more resources that you spend on the campaign the more your happiness will increase.  In order to increase happiness put the ammount you would like to spend into the box and then click the Increase Happiness button."
					+ "<br><br>Get More Resources: (cost 9) You are also able to increase the ammount of resources you get per round, by educating the public about the algae problem.  If you would like to increase the ammount of resourses that you get each round click on the Get Resources button to increase your resourses per round by one."
					+ "<br><br>Next Week: When you have taken all of the actions that you want/are able to in a week click on the Next Week button to advance to the next week." + "</html>");
		}
		
		//clears the frame
		firstbutton.setVisible(false);
		firsttext.setVisible(false);
		
		//sets up the frame for the main game
		buildresearch.setVisible(true);
		attemptresearch.setVisible(true);
		sendwater.setVisible(true);
		buildpurification.setVisible(true);
		increasehappiness.setVisible(true);
		getresources.setVisible(true);
		happinessprogress.setVisible(true);
		totalhappiness.setVisible(true);
		maintext.setVisible(true);
		textinput.setVisible(true);
		help.setVisible(true);
		statscounter.setVisible(true);
		nextweek.setVisible(true);
		loc1stats.setVisible(true);
		loc2stats.setVisible(true);
		loc3stats.setVisible(true);
		loc4stats.setVisible(true);
		loc5stats.setVisible(true);
		loc6stats.setVisible(true);
		loc7stats.setVisible(true);
		loc8stats.setVisible(true);
		
		//sets the value of the happiness to 100
		happiness.set(50);
		happinessprogress.setValue(happiness.get());
		
		//sets the value of win and lose to false
		win = false;
		lose = false;
		
		//sets the value of extra to 0
		extra.set(0);
		
		//sets the value of help increment to 0
		helpincrement.set(0);
		
		//determines the location and intensity for the second weeks algae
		algaeintensity = (int) (Math.random()*6 + 1);
		algaelocation = (int) (Math.random()*8 + 1);
		
		while(win == false && lose == false){
			
			//increaments the week
			week++;
			
			//sets the stats at the top
			statscounter.setText("<html>"+"Week: "+ week + " Resources: " + resources.get() +"</html>");
			
			//gives the player their resources for the turn
			resources.add(10+extra.get());
			
			if(week == 1){
				while(weekhalter.get()){
					statscounter.setText("<html>"+"Week: "+ week + " Resources: " + resources.get() +"</html>");
					happinessprogress.setValue(happiness.get());
					loc1stats.setText("<html>"+"Location " + loc1.getLocationNumber() + "<br>Algae Level:" + loc1.getAlgaeLevel() + "<br>Water Ammount: " + loc1.getAmmountOfWater() + "<br>Research Station: " + loc1.hasResearchStationString() + "<br>Purification Plant: " + loc1.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc1.phosphorousConcentration() + "</html>");
					loc2stats.setText("<html>"+"Location " + loc2.getLocationNumber() + "<br>Algae Level:" + loc2.getAlgaeLevel() + "<br>Water Ammount: " + loc2.getAmmountOfWater() + "<br>Research Station: " + loc2.hasResearchStationString() + "<br>Purification Plant: " + loc2.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc2.phosphorousConcentration() + "</html>");
					loc3stats.setText("<html>"+"Location " + loc3.getLocationNumber() + "<br>Algae Level:" + loc3.getAlgaeLevel() + "<br>Water Ammount: " + loc3.getAmmountOfWater() + "<br>Research Station: " + loc3.hasResearchStationString() + "<br>Purification Plant: " + loc3.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc3.phosphorousConcentration() + "</html>");
					loc4stats.setText("<html>"+"Location " + loc4.getLocationNumber() + "<br>Algae Level:" + loc4.getAlgaeLevel() + "<br>Water Ammount: " + loc4.getAmmountOfWater() + "<br>Research Station: " + loc4.hasResearchStationString() + "<br>Purification Plant: " + loc4.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc4.phosphorousConcentration() + "</html>");
					loc5stats.setText("<html>"+"Location " + loc5.getLocationNumber() + "<br>Algae Level:" + loc5.getAlgaeLevel() + "<br>Water Ammount: " + loc5.getAmmountOfWater() + "<br>Research Station: " + loc5.hasResearchStationString() + "<br>Purification Plant: " + loc5.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc5.phosphorousConcentration() + "</html>");
					loc6stats.setText("<html>"+"Location " + loc6.getLocationNumber() + "<br>Algae Level:" + loc6.getAlgaeLevel() + "<br>Water Ammount: " + loc6.getAmmountOfWater() + "<br>Research Station: " + loc6.hasResearchStationString() + "<br>Purification Plant: " + loc6.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc6.phosphorousConcentration() + "</html>");
					loc7stats.setText("<html>"+"Location " + loc7.getLocationNumber() + "<br>Algae Level:" + loc7.getAlgaeLevel() + "<br>Water Ammount: " + loc7.getAmmountOfWater() + "<br>Research Station: " + loc7.hasResearchStationString() + "<br>Purification Plant: " + loc7.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc7.phosphorousConcentration() + "</html>");
					loc8stats.setText("<html>"+"Location " + loc8.getLocationNumber() + "<br>Algae Level:" + loc8.getAlgaeLevel() + "<br>Water Ammount: " + loc8.getAmmountOfWater() + "<br>Research Station: " + loc8.hasResearchStationString() + "<br>Purification Plant: " + loc8.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc8.phosphorousConcentration() + "</html>");
				}
				weekhalter.setTrue();
			}
			else{
				
				//announces to the player where the algae bloom happened
				maintext.setText("<html>" + "There was an algae bloom of level " + algaeintensity + " in location " + algaelocation + ", there was " + list.get(algaelocation-1).getAmmountOfWater() + " water there before the bloom.");
				
				//puts the algae in the location and removes water and happines as needed
				for(int i = 1; i < 9; i++){
					
					if(algaelocation == i){
						list.get(i-1).setAlgaeLevel(algaeintensity);
						
						if(list.get(i-1).hasWaterPurification() && list.get(i-1).getAmmountOfWater() >= (int) (list.get(i-1).getAlgaeLevel()/2)){
							list.get(i-1).removeWater((int) (list.get(i-1).getAlgaeLevel()/2));
						}
						else if(list.get(i-1).hasWaterPurification() && list.get(i-1).getAmmountOfWater() < (int) (list.get(i-1).getAlgaeLevel()/2)){
							algaeintensity -= list.get(i-1).getAmmountOfWater();
							happiness.subtract((int) (algaeintensity/2));
							list.get(i-1).removeWater(list.get(i-1).getAmmountOfWater());
						}
						else if(list.get(i-1).getAmmountOfWater() >= list.get(i-1).getAlgaeLevel()){
							list.get(i-1).removeWater(list.get(i-1).getAlgaeLevel());
						}
						else if(list.get(i-1).getAmmountOfWater() < (int) (list.get(i-1).getAlgaeLevel())){
							algaeintensity -= list.get(i-1).getAmmountOfWater();
							happiness.subtract(algaeintensity);
							list.get(i-1).removeWater(list.get(i-1).getAmmountOfWater());
						}
					}
				}
				
				//checks to see if the player has lost
				if(happiness.get() <= 0){
					lose = true;
				}
				
				//determines the location and intensity for the next weeks algae
				algaeintensity = (int) (Math.random()*6 + 1);
				algaelocation = (int) (Math.random()*8 + 1);
				
				//updates the phosphorous readings for the next day
				for(int i = 0; i < 8; i++){
					if(list.get(i).hasResearchStation()){
						list.get(i).setPhosphorous(0);
					}
				}
				if(list.get(algaelocation-1).hasResearchStation()){
					list.get(algaelocation-1).setPhosphorous(algaeintensity);
				}
				
				//waits for the player to take actions
				if(!lose){
					while(weekhalter.get()){
						statscounter.setText("<html>"+"Week: "+ week + " Resources: " + resources.get() +"</html>");
						happinessprogress.setValue(happiness.get());
						loc1stats.setText("<html>"+"Location " + loc1.getLocationNumber() + "<br>Algae Level:" + loc1.getAlgaeLevel() + "<br>Water Ammount: " + loc1.getAmmountOfWater() + "<br>Research Station: " + loc1.hasResearchStationString() + "<br>Purification Plant: " + loc1.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc1.phosphorousConcentration() + "</html>");
						loc2stats.setText("<html>"+"Location " + loc2.getLocationNumber() + "<br>Algae Level:" + loc2.getAlgaeLevel() + "<br>Water Ammount: " + loc2.getAmmountOfWater() + "<br>Research Station: " + loc2.hasResearchStationString() + "<br>Purification Plant: " + loc2.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc2.phosphorousConcentration() + "</html>");
						loc3stats.setText("<html>"+"Location " + loc3.getLocationNumber() + "<br>Algae Level:" + loc3.getAlgaeLevel() + "<br>Water Ammount: " + loc3.getAmmountOfWater() + "<br>Research Station: " + loc3.hasResearchStationString() + "<br>Purification Plant: " + loc3.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc3.phosphorousConcentration() + "</html>");
						loc4stats.setText("<html>"+"Location " + loc4.getLocationNumber() + "<br>Algae Level:" + loc4.getAlgaeLevel() + "<br>Water Ammount: " + loc4.getAmmountOfWater() + "<br>Research Station: " + loc4.hasResearchStationString() + "<br>Purification Plant: " + loc4.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc4.phosphorousConcentration() + "</html>");
						loc5stats.setText("<html>"+"Location " + loc5.getLocationNumber() + "<br>Algae Level:" + loc5.getAlgaeLevel() + "<br>Water Ammount: " + loc5.getAmmountOfWater() + "<br>Research Station: " + loc5.hasResearchStationString() + "<br>Purification Plant: " + loc5.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc5.phosphorousConcentration() + "</html>");
						loc6stats.setText("<html>"+"Location " + loc6.getLocationNumber() + "<br>Algae Level:" + loc6.getAlgaeLevel() + "<br>Water Ammount: " + loc6.getAmmountOfWater() + "<br>Research Station: " + loc6.hasResearchStationString() + "<br>Purification Plant: " + loc6.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc6.phosphorousConcentration() + "</html>");
						loc7stats.setText("<html>"+"Location " + loc7.getLocationNumber() + "<br>Algae Level:" + loc7.getAlgaeLevel() + "<br>Water Ammount: " + loc7.getAmmountOfWater() + "<br>Research Station: " + loc7.hasResearchStationString() + "<br>Purification Plant: " + loc7.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc7.phosphorousConcentration() + "</html>");
						loc8stats.setText("<html>"+"Location " + loc8.getLocationNumber() + "<br>Algae Level:" + loc8.getAlgaeLevel() + "<br>Water Ammount: " + loc8.getAmmountOfWater() + "<br>Research Station: " + loc8.hasResearchStationString() + "<br>Purification Plant: " + loc8.hasWaterPurificationString() + "<br>Phosphorous Concentration: " + loc8.phosphorousConcentration() + "</html>");
					}
					for(int i = 0; i < 8; i++){
						list.get(i).setAlgaeLevel(0);
					}
					weekhalter.setTrue();
				
					//checks to see if the player has won the game
					win = true;
					for(int i = 0; i < 8; i++){
						if(list.get(i).hasWaterPurification() != true){
							win = false;
						}
					}
					if(resources.get() >= 150){
						win = true;
					}
				}
			}

		}
		
		buildresearch.setVisible(false);
		attemptresearch.setVisible(false);
		sendwater.setVisible(false);
		buildpurification.setVisible(false);
		increasehappiness.setVisible(false);
		getresources.setVisible(false);
		happinessprogress.setVisible(false);
		totalhappiness.setVisible(false);
		maintext.setVisible(false);
		textinput.setVisible(false);
		help.setVisible(false);
		statscounter.setVisible(false);
		nextweek.setVisible(false);
		next.setVisible(false);
		loc1stats.setVisible(false);
		loc2stats.setVisible(false);
		loc3stats.setVisible(false);
		loc4stats.setVisible(false);
		loc5stats.setVisible(false);
		loc6stats.setVisible(false);
		loc7stats.setVisible(false);
		loc8stats.setVisible(false);
		firsttext.setVisible(true);
		
		if(win){
			firsttext.setText("<html>"+"Congratulations, you have won the game, it took you " + week + " weeks, play again to see if you can do better.  If you want to find out more information about the algal blooms on Lake Erie or other biomimcry you can go to http://lakeeriealgae.com, https://ioos.noaa.gov/regions/glos, or https://asknature.org/" +"</html>");	
		}
		else if(lose){
			firsttext.setText("<html>"+"Happiness has hit 0 and you lost, please try again next time.  If you want to find out more information about the algal blooms on Lake Erie or other biomimcry you can go to http://lakeeriealgae.com, https://ioos.noaa.gov/regions/glos, or https://asknature.org/" +"</html>");	
		}
	}

}
