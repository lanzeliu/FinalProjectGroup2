package cn.itcast.accounting.view;

import cn.itcast.accounting.dto.Vehicle;

public class CarDetailOpen extends CarDetailUI {
    public static void main(String[] args) {
        CarDetailUI carDetailUI = new CarDetailUI();
        Vehicle vehicle = new Vehicle();
        carDetailUI.carDetailFrame(vehicle);
        vehicle.setCategory("aaaaa");
    }
}
