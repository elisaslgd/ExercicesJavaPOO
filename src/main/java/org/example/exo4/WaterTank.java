package org.example.exo4;

import org.w3c.dom.ls.LSOutput;

public class WaterTank {

    private float poidsVide;
    private float capaciteMax;
    private float nivRemplissage;
    public static float totalVolume;

    private float tot;
    private float volumeDepart;
    private int numWaterTank;

    public WaterTank(float volumeDepart) {
        this.volumeDepart = volumeDepart;
        totalVolume = totalVolume + volumeDepart;
        numWaterTank++;
    }

    public String getVolumeDepart() {
        return
        "WaterTank " + numWaterTank + " volume de départ : "+volumeDepart;
    }

    public void setVolumeDepart(float volumeDepart) {
        this.volumeDepart = volumeDepart;
        totalVolume += volumeDepart;
    }

    public float getTot() {
        return tot = volumeDepart;
    }

    public void setTot(float tot) {
        this.tot = tot;
    }

    public int getNumWaterTank() {
        return numWaterTank;
    }

    public void setNumWaterTank(int numWaterTank) {
        this.numWaterTank = numWaterTank;
    }

    public float getPoidsVide() {
        return poidsVide;
    }

    public void setPoidsVide(float poidsVide) {
        this.poidsVide = poidsVide;
    }

    public float getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(float capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public float getNivRemplissage() {
        return nivRemplissage;
    }

    public void setNivRemplissage(float nivRemplissage) {
        this.nivRemplissage = nivRemplissage;
    }

    public static String getTotalVolume() {
        return "Volume total des WaterTank : " + totalVolume;
    }

    public static void setTotalVolume(float totalVolume) {
        WaterTank.totalVolume = totalVolume;
    }



    public void remplir(float volume) {
        totalVolume += volume;
    }


    public void vider(float volume){
        totalVolume -= volume;
    }

}
