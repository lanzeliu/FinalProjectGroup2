package finalprojectgroup2test1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class InventorySearch extends InventorySearchBuild {

	public InventorySearch() {
		super();
		this.buildUI();
	}
	
	private void buildUI() {
		this.defineWestPanelComonents();
		this.buildWestPanel();
		
		this.buildCentralPanel();
		
		this.defineSouthPanelComonents();
		this.buildSouthPanel();
		
	}

	public void defineWestPanelComonents() {
		
        labelCategory = new JLabel("Category");
        labelEmpty = new JLabel("");
		bottonNew = new JCheckBox("New");
		bottonUsed = new JCheckBox("Used");
        labelYear = new JLabel("Year");
        JCBYear1 = new JComboBox(new String[] { "--Please choose the start year", "2019", "2018", "2017", "2016" });
        labelTo = new JLabel("to");
        labelTo2 = new JLabel("to");
        JCBYear2 = new JComboBox(new String[] { "--Please choose the end year", "2019", "2018", "2017", "2016" });
        labelMileage = new JLabel("Mileage");
        JCBMileage1 = new JComboBox(new String[] { "--Please choose the prefered mileage", "10,000 or less", "50,000 or less", "100,000 or less", "200,000 or less", "300,000 or less" });
        labelPrice = new JLabel("Price");
        JCBPrice1 = new JComboBox(new String[] { "--Please choose the start price", "5,000", "10,000", "20,000", "30,000", "50,000", "100,000" });
        JCBPrice2 = new JComboBox(new String[] { "--Please choose the end price", "5,000", "10,000", "20,000", "30,000", "50,000", "100,000" });
        labelLocation = new JLabel("Location");
        labelZipcode = new JLabel("Zipcode");
        JTFZipcode = new JTextField("");
        JTFZipcode.setToolTipText("Please type the zipcode here");
		labelMake = new JLabel("Make");
		JCBMake = new JComboBox(new String[] { "--Please choose the prefered make", "Audi", "BMW", "Jeep", "Tesla", "Nissan" });
	}
	
	public void buildWestPanel() {
		westLayout = new BoxLayout(westPanel, BoxLayout.Y_AXIS);
        westPanel.setLayout(westLayout);
        
		westPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        westPanel.add(labelCategory);
        westPanel.add(bottonNew);
        westPanel.add(bottonUsed);
        
    	westPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        westPanel.add(labelYear);
        westPanel.add(JCBYear1);
        westPanel.add(labelTo2);
        westPanel.add(JCBYear2);
        
    	westPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        westPanel.add(labelMileage);
        westPanel.add(JCBMileage1);

    	westPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        westPanel.add(labelPrice);
        westPanel.add(JCBPrice1);
        westPanel.add(labelTo);
        westPanel.add(JCBPrice2);
        
    	westPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        westPanel.add(labelLocation);
        westPanel.add(labelZipcode);
        westPanel.add(JTFZipcode);

    	westPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        westPanel.add(labelMake);

    	westPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        westPanel.add(JCBMake);
        
        westPanel.setBorder(BorderFactory.createTitledBorder("Filter Results"));
        westPanel.setPreferredSize(new Dimension(150, 300));
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
		InventorySearch is = new InventorySearch();
		is.setVisible(true);
	}

}
