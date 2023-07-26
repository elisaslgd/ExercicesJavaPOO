package org.example.exo4;

public class ApplicationWaterTank {

    public static void main(String[] args) {

        WaterTank watertank1 = new WaterTank();
        WaterTank watertank2 = new WaterTank();

        watertank1.setVolumeDepart(10.0f);
        watertank2.setVolumeDepart(25.0f);
        watertank1.setNumWaterTank(1);
        watertank2.setNumWaterTank(2);

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




    }
}
