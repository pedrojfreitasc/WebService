/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.business;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import weka.core.Attribute;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;

/**
 *
 * @author PedroJosé
 */
public class MyRecord implements Serializable {

    private String username;
    private GregorianCalendar dateTime;
    private int age, height, weight;
    private boolean hasSportHistoric, hasWalkingHistoric;
    private char gender;
    private double startLat, startLon, startAlt, endLat, endLon, endAlt;
    private float distance;
    private double altDiff;
    private float currSpeed, avgSpeed;
    private int accumSub, accumDesc, totDist;
    private String modal;
    private int load;
    private String diffic;

    public MyRecord() {

    }

    public MyRecord(String username, GregorianCalendar dateTime, int age, int height, int weight, boolean hasSportHistoric, boolean hasWalkingHistoric, char gender, double startLat, double startLon, double startAlt, double endLat, double endLon, double endAlt, float distance, double altDiff, float currSpeed, float avgSpeed, int accumSub, int accumDesc, int totDist, String modal, int load, String diffic) {
        this.username = username;
        this.dateTime = dateTime;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.hasSportHistoric = hasSportHistoric;
        this.hasWalkingHistoric = hasWalkingHistoric;
        this.gender = gender;
        this.startLat = startLat;
        this.startLon = startLon;
        this.startAlt = startAlt;
        this.endLat = endLat;
        this.endLon = endLon;
        this.endAlt = endAlt;
        this.distance = distance;
        this.altDiff = altDiff;
        this.currSpeed = currSpeed;
        this.avgSpeed = avgSpeed;
        this.accumSub = accumSub;
        this.accumDesc = accumDesc;
        this.totDist = totDist;
        this.modal = modal;
        this.load = load;
        this.diffic = diffic;
    }

    public MyRecord(String username, int dateTime, int age, int height, int weight, boolean hasSportHistoric, boolean hasWalkingHistoric, char gender, double startLat, double startLon, double startAlt, double endLat, double endLon, double endAlt, float distance, double altDiff, float currSpeed, float avgSpeed, int accumSub, int accumDesc, int totDist, String modal, int load, String diffic) {
        this.username = username;
        this.dateTime = new GregorianCalendar();
        this.dateTime.setTimeInMillis(dateTime);
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.hasSportHistoric = hasSportHistoric;
        this.hasWalkingHistoric = hasWalkingHistoric;
        this.gender = gender;
        this.startLat = startLat;
        this.startLon = startLon;
        this.startAlt = startAlt;
        this.endLat = endLat;
        this.endLon = endLon;
        this.endAlt = endAlt;
        this.distance = distance;
        this.altDiff = altDiff;
        this.currSpeed = currSpeed;
        this.avgSpeed = avgSpeed;
        this.accumSub = accumSub;
        this.accumDesc = accumDesc;
        this.totDist = totDist;
        this.modal = modal;
        this.load = load;
        this.diffic = diffic;

    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the dateTime
     */
    public GregorianCalendar getDateTime() {
        return (GregorianCalendar) dateTime.clone();
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @return the hasSportHistoric
     */
    public boolean isHasSportHistoric() {
        return hasSportHistoric;
    }

    /**
     * @return the hasWalkingHistoric
     */
    public boolean isHasWalkingHistoric() {
        return hasWalkingHistoric;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @return the startLat
     */
    public double getStartLat() {
        return startLat;
    }

    /**
     * @return the startLon
     */
    public double getStartLon() {
        return startLon;
    }

    /**
     * @return the startAlt
     */
    public double getStartAlt() {
        return startAlt;
    }

    /**
     * @return the endLat
     */
    public double getEndLat() {
        return endLat;
    }

    /**
     * @return the endLon
     */
    public double getEndLon() {
        return endLon;
    }

    /**
     * @return the endAlt
     */
    public double getEndAlt() {
        return endAlt;
    }

    /**
     * @return the distance
     */
    public float getDistance() {
        return distance;
    }

    /**
     * @return the altDiff
     */
    public double getAltDiff() {
        return altDiff;
    }

    /**
     * @return the currSpeed
     */
    public float getCurrSpeed() {
        return currSpeed;
    }

    /**
     * @return the avgSpeed
     */
    public float getAvgSpeed() {
        return avgSpeed;
    }

    /**
     * @return the accumSub
     */
    public int getAccumSub() {
        return accumSub;
    }

    /**
     * @return the accumDesc
     */
    public int getAccumDesc() {
        return accumDesc;
    }

    /**
     * @return the totDist
     */
    public int getTotDist() {
        return totDist;
    }

    /**
     * @return the modal
     */
    public String getModal() {
        return modal;
    }

    /**
     * @return the load
     */
    public int getLoad() {
        return load;
    }

    /**
     * @return the diffic
     */
    public String getDiffic() {
        return diffic;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param dateTime the dateTime to set
     */
    public void setDateTime(GregorianCalendar dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @param hasSportHistoric the hasSportHistoric to set
     */
    public void setHasSportHistoric(boolean hasSportHistoric) {
        this.hasSportHistoric = hasSportHistoric;
    }

    /**
     * @param hasWalkingHistoric the hasWalkingHistoric to set
     */
    public void setHasWalkingHistoric(boolean hasWalkingHistoric) {
        this.hasWalkingHistoric = hasWalkingHistoric;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @param startLat the startLat to set
     */
    public void setStartLat(double startLat) {
        this.startLat = startLat;
    }

    /**
     * @param startLon the startLon to set
     */
    public void setStartLon(double startLon) {
        this.startLon = startLon;
    }

    /**
     * @param startAlt the startAlt to set
     */
    public void setStartAlt(double startAlt) {
        this.startAlt = startAlt;
    }

    /**
     * @param endLat the endLat to set
     */
    public void setEndLat(double endLat) {
        this.endLat = endLat;
    }

    /**
     * @param endLon the endLon to set
     */
    public void setEndLon(double endLon) {
        this.endLon = endLon;
    }

    /**
     * @param endAlt the endAlt to set
     */
    public void setEndAlt(double endAlt) {
        this.endAlt = endAlt;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(float distance) {
        this.distance = distance;
    }

    /**
     * @param altDiff the altDiff to set
     */
    public void setAltDiff(double altDiff) {
        this.altDiff = altDiff;
    }

    /**
     * @param currSpeed the currSpeed to set
     */
    public void setCurrSpeed(float currSpeed) {
        this.currSpeed = currSpeed;
    }

    /**
     * @param avgSpeed the avgSpeed to set
     */
    public void setAvgSpeed(float avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    /**
     * @param accumSub the accumSub to set
     */
    public void setAccumSub(int accumSub) {
        this.accumSub = accumSub;
    }

    /**
     * @param accumDesc the accumDesc to set
     */
    public void setAccumDesc(int accumDesc) {
        this.accumDesc = accumDesc;
    }

    /**
     * @param totDist the totDist to set
     */
    public void setTotDist(int totDist) {
        this.totDist = totDist;
    }

    /**
     * @param modal the modal to set
     */
    public void setModal(String modal) {
        this.modal = modal;
    }

    /**
     * @param load the load to set
     */
    public void setLoad(int load) {
        this.load = load;
    }

    /**
     * @param diffic the diffic to set
     */
    public void setDiffic(String diffic) {
        this.diffic = diffic;
    }

    public int getSportHistAsInt() {
        return (hasSportHistoric) ? 1 : 0;
    }

    public int getWalkingHistAsInt() {
        return (hasWalkingHistoric) ? 1 : 0;
    }

    public static MyRecord parseMyRecord(String str) {
        String[] aux = str.split(",");
        String[] fields = new String[aux.length];
        for (int i = 0; i < aux.length; i++) {
            fields[i] = aux[i].trim();
        }
        String username = fields[0];
        GregorianCalendar dateFormat = parseGC(fields[1]);
        int age = Integer.parseInt(fields[2]);
        int height = Integer.parseInt(fields[3]);
        int weight = Integer.parseInt(fields[4]);
        boolean sportHist = Boolean.parseBoolean(fields[5]);
        boolean walkHist = Boolean.parseBoolean(fields[6]);
        char gender = fields[7].charAt(0);
        double startLat = Double.parseDouble(fields[8]);
        double startLon = Double.parseDouble(fields[9]);
        double startAlt = Double.parseDouble(fields[10]);
        double endLat = Double.parseDouble(fields[11]);
        double endLon = Double.parseDouble(fields[12]);
        double endAlt = Double.parseDouble(fields[13]);
        float distance = Float.parseFloat(fields[14]);
        double heightDiff = Double.parseDouble(fields[15]);
        float currSpeed = Float.parseFloat(fields[16]);
        float avgSpeed = Float.parseFloat(fields[17]);
        int accumSub = Integer.parseInt(fields[18]);
        int accumDesc = Integer.parseInt(fields[19]);
        int totDistanc = Integer.parseInt(fields[20]);
        String modal = fields[21];
        int carga = (int) Float.parseFloat(fields[22]);
        String diffic = fields[23];
        return new MyRecord(username, dateFormat, age, height, weight, sportHist, walkHist, gender, startLat, startLon, startAlt, endLat, endLon, endAlt, distance, heightDiff, currSpeed, avgSpeed, accumSub, accumDesc, totDistanc, modal, carga, diffic);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (!(this.getClass().getSimpleName()).equals(other.getClass().getSimpleName())) {
            return false;
        } else {
            MyRecord mr = (MyRecord) other;
            return (username.equals(mr.getUsername()) && dateTime.equals(mr.getDateTime())
                    && age == mr.getAge() && height == mr.getHeight() && weight == mr.getWeight()
                    && hasSportHistoric == mr.isHasSportHistoric() && hasWalkingHistoric == mr.isHasWalkingHistoric()
                    && gender == mr.getGender() && startLat == mr.getStartLat() && startLon == mr.getStartLon()
                    && startAlt == mr.getStartAlt() && endLat == mr.getEndLat() && endLon == mr.getEndLon()
                    && endAlt == mr.getEndAlt() && distance == mr.getDistance() && altDiff == mr.getAltDiff()
                    && currSpeed == mr.getCurrSpeed() && avgSpeed == mr.getAvgSpeed() && accumSub == mr.getAccumSub()
                    && accumDesc == mr.getAccumDesc() && totDist == mr.getTotDist() && modal.equals(mr.getModal())
                    && load == mr.getLoad() && diffic.equals(mr.getDiffic()));
        }
    }

    private static GregorianCalendar parseGC(String line) {
        String[] firstSplit = line.split(" ");
        String[] date = firstSplit[0].split("-");
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        int year = Integer.parseInt(date[0]);
        String[] time = firstSplit[1].split(":");
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);
        int seconds = Integer.parseInt(time[2]);
        return new GregorianCalendar(year, month - 1, day, hour, minute, seconds);
    }

    private int ageBand() {
        if (age < 18) {
            return 0;
        } else if (age >= 18 && age < 24) {
            return 1;
        } else if (age >= 24 && age < 35) {
            return 2;
        } else if (age >= 35 && age < 45) {
            return 3;
        } else if (age >= 45 && age < 54) {
            return 4;
        } else if (age >= 54 && age < 65) {
            return 5;
        } else {
            return 6;
        }
    }

    private double imc() {
        double metHeight = height / 100;
        double sqMH = metHeight * metHeight;
        return weight / sqMH;
    }

    private int intSH() {
        return (hasSportHistoric) ? 1 : 0;
    }

    private int intWH() {
        return (hasWalkingHistoric) ? 1 : 0;
    }

    private int intGender() {
        return (gender == 'M') ? 0 : 1;
    }

    private double avgAlt() {
        return (startAlt + endAlt) / 2;
    }

    private int modalToInt() {
        return (modal.equalsIgnoreCase("Caminhada")) ? 0 : 1;
    }

    private int region() {
        double avgLat = (startLat + endLat) / 2;
        double avgLon = (startLon + endLon) / 2;
        if (between(avgLat, 36.965003, 37.408667) && between(avgLon, -9.000971, -7.395594)) {
            return 5;
        } else if (between(avgLat, 37.408667, 38.374813) && between(avgLon, -8.883119, -6.935792)) {
            return 4;
        } else if (between(avgLat, 38.374813, 39.754828) && between(avgLon, -9.500805, -6.867947)) {
            return 3;
        } else if (between(avgLat, 39.754828, 40.96941) && between(avgLon, -9.059689, -6.796250)) {
            return 2;
        } else if (between(avgLat, 40.96941, 42.154295) && between(avgLon, -8.875645, -7.804478)) {
            return 0;
        } else if (between(avgLat, 40.96941, 42.154295) && between(avgLon, -7.804478, -6.189488)) {
            return 1;
        } else {
            return -1;
        }
    }

    private boolean between(double val, double llim, double ulim) {
        return (val >= llim && val <= ulim);
    }
    
    private double percentUphill(){
        return (accumSub/totDist)*100;
    }
    
    private double percentDownhill(){
        return (accumDesc/totDist)*100;
    }

    private int hour(){
        return this.dateTime.get(Calendar.HOUR_OF_DAY);
    }
    
    private int minute(){
        return this.dateTime.get(Calendar.MINUTE);
    }
    
    private int month(){
        return this.dateTime.get(Calendar.MONTH)+1;
    }
    
    private int day(){
        return this.dateTime.get(Calendar.DAY_OF_MONTH);
    }
    
    public Instance toWekaInstance(Instances instas) {
        Instance inst = new Instance(24);
        inst.setDataset(instas);
        inst.setValue(0, ageBand());
        inst.setValue(1, imc());
        inst.setValue(2, height);
        inst.setValue(3, weight);
        inst.setValue(4, intSH());
        inst.setValue(5, intWH());
        inst.setValue(6, intGender());
        inst.setValue(7, avgAlt());
        inst.setValue(8, distance);
        inst.setValue(9, altDiff);
        inst.setValue(10, currSpeed);
        inst.setValue(11, avgSpeed);
        inst.setValue(12, accumSub);
        inst.setValue(13, accumDesc);
        inst.setValue(14, modalToInt());
        inst.setValue(15, load);
        inst.setValue(16, region());
        inst.setValue(17, percentUphill());
        inst.setValue(18, percentDownhill());
        inst.setValue(19, day());
        inst.setValue(20, month());
        inst.setValue(21, hour());
        inst.setValue(22, minute());
        inst.setValue(23, diffic);
        //percentUphill,percentDownhill,day,month,hour,minute,diffic
        return inst;
    }
}
