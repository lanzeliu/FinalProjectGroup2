package finalprojectgroup2test2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;



public class InventorySearch extends InventorySearchBuild {
	String dealerName;
	
	public InventorySearch(String dealerName) {
		super();
		this.dealerName = dealerName;
		
		this.buildUI();
	}
	
	public void buildUI() {
		this.buildNorthPanel();
		
		this.defineWestPanelComonents();
		this.buildWestPanel();
		
		this.buildCentralPanel();
		
		this.defineSouthPanelComonents();
		this.buildSouthPanel();
	}

	public void buildNorthPanel() {
        //northPanel.setPreferredSize(new Dimension(500, 500));
		northPanel = new JPanel() {
			public void paintComponent(Graphics g) {
				ImageIcon backImage = new ImageIcon("//users/liulanze/Downloads/2019 Spring NEU Seattle/JAVA OOP/Final Project/cover1.jpeg");
				g.drawImage(backImage.getImage(), 0, 0, this.getSize().width, this.getSize().height, this);
			}
		};
		
		labelSortBy = new JLabel("Sort by:");
		JCBSortBy = new JComboBox(new String[] {"Distance: Nearest(Default)", "Price: Lowest", "Price: Highest", "Year: Newest", "Year: Oldest", "Mileage: Lowest", "Mileage: Highest"});
		
		northPanel.setOpaque(true);
        northPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        northPanel.add(labelSortBy, BorderLayout.EAST);
        northPanel.add(JCBSortBy, BorderLayout.EAST);
        
        northPanel.add(Box.createRigidArea(new Dimension(100, 250)));
	northPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        getContentPane().add(northPanel, BorderLayout.NORTH);
        getContentPane().setVisible(true);
	}
	
	
	public void defineWestPanelComonents() {
		
        labelCategory = new JLabel("Category");
        labelEmpty = new JLabel("");
		bottonNew = new JCheckBox("New");
		bottonUsed = new JCheckBox("Used");
        labelYear = new JLabel("Year");
        JCBYear1 = new JComboBox(new String[] { "--Please choose a start year", "2019", "2018", "2017", "2016" });
        labelTo = new JLabel("to");
        labelTo2 = new JLabel("to");
        JCBYear2 = new JComboBox(new String[] { "--Please choose an end year", "2019", "2018", "2017", "2016" });
        labelMileage = new JLabel("Mileage");
        JCBMileage1 = new JComboBox(new String[] { "--Please choose a prefered mileage", "10,000 or less", "50,000 or less", "100,000 or less", "200,000 or less", "300,000 or less" });
        labelPrice = new JLabel("Price");
        JCBPrice1 = new JComboBox(new String[] { "--Please choose a start price", "5,000", "10,000", "20,000", "30,000", "50,000", "100,000" });
        JCBPrice2 = new JComboBox(new String[] { "--Please choose an end price", "5,000", "10,000", "20,000", "30,000", "50,000", "100,000" });
        JTFZipcode = new JTextField("");
        JTFZipcode.setToolTipText("Please type the zipcode here");
		labelMake = new JLabel("Make");
		JCBMake = new JComboBox(new String[] { "--Please choose a prefered make", "Audi", "BMW", "Jeep", "Tesla", "Nissan" });
		labelModel = new JLabel("Model");
		JCBModel = new JComboBox(new String[] {"--Please choose a prefered model"});
		labelType = new JLabel("Type");
		JCBType = new JComboBox(new String[] {"--Please choose a prefered type"});
		labelSeatCount = new JLabel("Seat Count");
		JCBSeatCount = new JComboBox(new String[] {"--Please choose a prefered seat count"});
		JBSearch = new JButton("Search");
	}
	
	public void buildWestPanel() {
		westLayout = new BoxLayout(westPanel, BoxLayout.Y_AXIS);
        westPanel.setLayout(westLayout);
        
		westPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        westPanel.add(labelCategory);
        westPanel.add(bottonNew);
        westPanel.add(bottonUsed);
        
    	westPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        westPanel.add(labelYear);
        westPanel.add(JCBYear1);
        westPanel.add(labelTo2);
        westPanel.add(JCBYear2);
        
    	westPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        westPanel.add(labelMileage);
        westPanel.add(JCBMileage1);

    	westPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        westPanel.add(labelPrice);
        westPanel.add(JCBPrice1);
        westPanel.add(labelTo);
        westPanel.add(JCBPrice2);

    	westPanel.add(Box.createRigidArea(new Dimension(0, 10)));
    	westPanel.add(labelModel);
    	westPanel.add(JCBModel);
    	
    	westPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        westPanel.add(labelMake);
        westPanel.add(JCBMake);
        
        westPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        westPanel.add(labelType);
        westPanel.add(JCBType);
        
        westPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        westPanel.add(labelSeatCount);
        westPanel.add(JCBSeatCount);
        
        westPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        westPanel.add(JBSearch);
        
        westPanel.setBorder(BorderFactory.createTitledBorder("Filter Results"));
        westPanel.setPreferredSize(new Dimension(300, 100));
        westScrollPane = new JScrollPane(westPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        westScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        getContentPane().add(westPanel, BorderLayout.WEST);
        getContentPane().setVisible(true);

	}
	
	public void buildCentralPanel() {
		centerPanel.setBorder(BorderFactory.createTitledBorder("Results"));
        centerLayout = new GridBagLayout();
        centerPanel.setLayout(centerLayout);

        getContentPane().add(centerPanel, BorderLayout.CENTER);
        getContentPane().setVisible(true);
	}
	
	public void defineSouthPanelComonents() {
		JBBack = new JButton("Back");
		JBPreviousPage = new JButton("Previous Page");
		JBNextPage = new JButton("Next Page");
	}
	
	public void buildSouthPanel() {
        southPanel.add(JBBack);
        southPanel.add(JBPreviousPage);
        southPanel.add(JBNextPage);
        getContentPane().add(southPanel, BorderLayout.SOUTH);
        getContentPane().setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		InventorySearch is = new InventorySearch("dealer1");
		is.setVisible(true);
	}

}
