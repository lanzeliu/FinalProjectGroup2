package cn.itcast.accounting.view;

import javax.swing.*;
import java.awt.*;

import cn.itcast.accounting.dto.Vehicle;


public class CarDetailUI {
    private JFrame detailFrame;
    private JPanel imagePanel;
    private JLabel imageLabel;
    private JPanel details;
    private JLabel category, year, make, type, seatCount, milaege, price, zipCode, model;
    private JLabel categoryDetail, yearDetail, makeDetail, typeDetail, seatCountDetail, milaegeDetail, priceDetail, zipCodeDetail, modelDetail;

    public void carDetailFrame(Vehicle vehicle) {
        createComponents(vehicle);
        addDetailComponents();

    }

    void createComponents(Vehicle vehicle) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        detailFrame = new JFrame("Car Detail");
        detailFrame.setSize(700, 400);
        imagePanel = new JPanel();
        details = new JPanel();
//        imageLabel = new JLabel("Picture");

        detailFrame.setLayout(new GridLayout(1, 2));
        details.setLayout(new GridBagLayout());
        imageLabel = new JLabel(new ImageIcon("src/cn/itcast/accounting/view/img/jaguar.png"));
        category = new JLabel("Category: ");
        categoryDetail = new JLabel(vehicle.getCategory());
        year = new JLabel("Year: ");
        yearDetail = new JLabel(vehicle.getYear());
        make = new JLabel("Make: ");
        makeDetail = new JLabel(vehicle.getMake());
        type = new JLabel("Type: ");
        typeDetail = new JLabel(vehicle.getType());
        seatCount = new JLabel("SeatCount: ");
        seatCountDetail = new JLabel(vehicle.getSeatCount());
        milaege = new JLabel("Milaege");
        milaegeDetail = new JLabel(vehicle.getMilaege());
        price = new JLabel("Price: ");
        priceDetail = new JLabel(vehicle.getPrice());
        zipCode = new JLabel("Zipcode: ");
        zipCodeDetail = new JLabel(vehicle.getZipCode());
        model = new JLabel("Model: ");
        modelDetail = new JLabel(vehicle.getModel());
    }

    void addDetailComponents() {
        GridBagConstraints gbc = new GridBagConstraints();
        detailFrame.getContentPane();
        imagePanel.setLayout(new BorderLayout());
        imagePanel.add(imageLabel, BorderLayout.CENTER);
        detailFrame.add(imagePanel);
        detailFrame.add(details);
        gbc.gridx = 0;
        gbc.gridy = 0;
        details.add(category, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        details.add(categoryDetail, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        details.add(year, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        details.add(yearDetail, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        details.add(make, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        details.add(makeDetail, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        details.add(type, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        details.add(typeDetail, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        details.add(seatCount, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        details.add(seatCountDetail, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        details.add(milaege, gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        details.add(milaegeDetail, gbc);
        gbc.gridx = 0;
        gbc.gridy = 6;
        details.add(price, gbc);
        gbc.gridx = 1;
        gbc.gridy = 6;
        details.add(priceDetail, gbc);
        gbc.gridx = 0;
        gbc.gridy = 7;
        details.add(zipCode, gbc);
        gbc.gridx = 1;
        gbc.gridy = 7;
        details.add(zipCodeDetail, gbc);
        gbc.gridx = 0;
        gbc.gridy = 8;
        details.add(model, gbc);
        gbc.gridx = 1;
        gbc.gridy = 8;
        details.add(modelDetail, gbc);
        details.setVisible(true);
        imagePanel.setVisible(true);
        detailFrame.setVisible(true);
    }
}
