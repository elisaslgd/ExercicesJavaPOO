package org.example.exo4;

public class ApplicationWaterTank {

    public static void main(String[] args) {

        WaterTank watertank1 = new WaterTank(10.0f);
        WaterTank watertank2 = new WaterTank(25.0f);
        System.out.println(watertank1.getVolumeDepart());
        System.out.println(watertank2.getVolumeDepart());

        System.out.println(WaterTank.getTotalVolume());

        watertank1.remplir(5);
        System.out.println(WaterTank.getTotalVolume());

        watertank1.remplir(60);
        System.out.println(WaterTank.getTotalVolume());

        watertank1.vider(5);
        System.out.println(WaterTank.getTotalVolume());

        watertank1.vider(20);
        System.out.println(WaterTank.getTotalVolume());

        System.out.println(watertank1.getVolumeDepart());
        System.out.println(watertank2.getVolumeDepart());



    }
}
