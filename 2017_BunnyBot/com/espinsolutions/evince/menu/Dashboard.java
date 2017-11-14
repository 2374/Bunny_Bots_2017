package com.espinsolutions.evince.menu;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

public class Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	
	// Information Squares
	private JLabel usersSquare = new JLabel();
	private JLabel hoursSquare = new JLabel();
	private JLabel daysSquare = new JLabel();
	
	private JButton usersButton = new JButton();
	private JButton hoursButton = new JButton();
	private JButton daysButton = new JButton();
	
	// Leaderboards Bar
	private JLabel leaderboardsBar = new JLabel();
	private JLabel leaderboardsText = new JLabel();
	
	// Fonts
	private Font number = new Font("Futura", Font.BOLD, 60);
	private Font heading = new Font("Futura", Font.PLAIN, 20);
	private Font leaderboards = new Font("Futura", Font.PLAIN, 18);
	
	// Navigation
//	private JLabel logo = new JLabel();
//	private JButton dashboard = new JButton();
//	private JButton leaderboards = new JButton();
//	private JButton search = new JButton();
//	private JButton about = new JButton();
//	private JButton admin = new JButton();
//	private JButton create = new JButton(); // This Button could be green/yellow to stand out.
	
	// Text
	private JLabel usersText = new JLabel();
	private JLabel hoursText = new JLabel();
	private JLabel daysText = new JLabel();
	
	private JLabel subUsersText = new JLabel();
	private JLabel subHoursText = new JLabel();
	private JLabel subDaysText = new JLabel();
	
	public Dashboard() {
		
		// General
		setTitle("Evince | Dashboard");
		setName("Evince | Dashboard");
		setSize(1000, 750);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(227, 228, 232));
		
		// Users
		usersText.setFont(number);
		usersText.setForeground(Color.WHITE);
		usersText.setBounds(135, 120, 100, 100);
		usersText.setText("12");
		
		subUsersText.setFont(heading);
		subUsersText.setForeground(Color.WHITE);
		subUsersText.setBounds(115, 170, 300, 100);
		subUsersText.setText("users registered");		
		
		usersSquare.setIcon(new ImageIcon(getClass().getResource("/resources/Users Registered.png")));
		usersSquare.setBounds(57, 120, 250, 200);
		
		usersButton.setIcon(new ImageIcon(getClass().getResource("/resources/Users Registered Button.png")));
		usersButton.setBounds(95, 265, 175, 37);
	
		// Hours
		hoursText.setFont(number);
		hoursText.setForeground(Color.WHITE);
		hoursText.setBounds(460, 120, 200, 100);
		hoursText.setText("10");
		
		subHoursText.setFont(heading);
		subHoursText.setForeground(Color.WHITE);
		subHoursText.setBounds(440, 170, 300, 100);
		subHoursText.setText("hours tracked");
		
		hoursSquare.setIcon(new ImageIcon(getClass().getResource("/resources/Hours Recorded.png")));
		hoursSquare.setBounds(377, 120, 250, 200);
		
		hoursButton.setIcon(new ImageIcon(getClass().getResource("/resources/Hours Recorded Button.png")));
		hoursButton.setBounds(415, 265, 175, 37);
		
		// Days
		daysText.setFont(number);
		daysText.setForeground(Color.WHITE);
		daysText.setBounds(780, 120, 200, 100);
		daysText.setText("83");
		
		subDaysText.setFont(heading);
		subDaysText.setForeground(Color.WHITE);
		subDaysText.setBounds(780, 170, 100, 100);
		subDaysText.setText("days left");
		
		daysSquare.setIcon(new ImageIcon(getClass().getResource("/resources/Days Left.png")));
		daysSquare.setBounds(697, 120, 250, 200);
		
		daysButton.setIcon(new ImageIcon(getClass().getResource("/resources/Days Left Button.png")));
		daysButton.setBounds(735, 265, 175, 37);
		
		// Leaderboards
		leaderboardsBar.setIcon(new ImageIcon(getClass().getResource("/resources/Leaderboards Bar.png")));
		leaderboardsBar.setBounds(57, 350, 890, 350);
		
		leaderboardsText.setFont(leaderboards);
		leaderboardsText.setForeground(Color.BLACK);
		leaderboardsText.setBounds(67, 200, 880, 340);
		leaderboardsText.setText("Leaderboards");
		
		add(usersText);
		add(subUsersText);
		add(usersButton);
		add(usersSquare);
		
		add(hoursText);
		add(subHoursText);
		add(hoursButton);
		add(hoursSquare);
		
		add(daysText);
		add(subDaysText);
		add(daysButton);
		add(daysSquare);
		
		add(leaderboardsText);
		add(leaderboardsBar);
		
		setVisible(true);
		
	}
	
}
