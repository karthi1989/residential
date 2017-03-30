package com.jlmd.simpleneuralnetwork.example;

import com.jlmd.simpleneuralnetwork.neuralnetwork.entity.Result;
import com.jlmd.simpleneuralnetwork.neuralnetwork.utils.DataUtils;
import com.jlmd.simpleneuralnetwork.neuralnetwork.NeuralNetwork;
import com.jlmd.simpleneuralnetwork.neuralnetwork.entity.Error;
import com.jlmd.simpleneuralnetwork.neuralnetwork.callback.INeuralNetworkCallback;


import property.*;
/**
 * @author jlmd
 */
public class findValue {
    
    int area;
    int lsize;
    int lvalue;
    int hsize;
    int stories;
    int bed;
    int bath;
    int year;
    int reno;
    int highway;
    int mainrd;
    int hos;
    int col;
    int supermarket;
    int scl;
    int bus;
    int wne;
    int gar;
    int cashcr;
    int sec;
    int garage;
    int ac;
    int tiled;
    int citypoint;
    int frontal;
    int bedroom;
    int bathroom;
    int kitchen;

    public int getArea() {
        return area;
    }

    public void setArea(int value) {
        area = value;
    }

    public int getLsize() {
        return lsize;
    }

    public void setLsize(int value) {
        lsize = value;
    }

    public int getLvalue() {
        return lvalue;
    }

    public void setLvalue(int value) {
        lvalue = value;
    }

    public int getHsize() {
        return hsize;
    }

    public void setHsize(int value) {
        hsize = value;
    }

    public int getStories() {
        return stories;
    }

    public void setStories(int value) {
        stories = value;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int value) {
        bed = value;
    }

    public int getBath() {
        return bath;
    }

    public void setBath(int value) {
        bath = value;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int value) {
        year = value;
    }

    public int getReno() {
        return reno;
    }

    public void setReno(int value) {
        reno = value;
    }

    public int getHighway() {
        return highway;
    }

    public void setHighway(int value) {
        highway = value;
    }

    public int getMainrd() {
        return mainrd;
    }

    public void setMainrd(int value) {
        mainrd = value;
    }

    public int getHos() {
        return hos;
    }

    public void setHos(int value) {
        hos = value;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int value) {
        col = value;
    }

    public int getSupermarket() {
        return supermarket;
    }

    public void setSupermarket(int value) {
        supermarket = value;
    }

    public int getScl() {
        return scl;
    }

    public void setScl(int value) {
        scl = value;
    }

    public int getBus() {
        return bus;
    }

    public void setBus(int value) {
        bus = value;
    }

    public int getWne() {
        return wne;
    }

    public void setWne(int value) {
        wne = value;
    }

    public int getGar() {
        return gar;
    }

    public void setGar(int value) {
        gar = value;
    }

    public int getCashcr() {
        return cashcr;
    }

    public void setCashcr(int value) {
        cashcr = value;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int value) {
        sec = value;
    }

    public int getGarage() {
        return garage;
    }

    public void setGarage(int value) {
        garage = value;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int value) {
        ac = value;
    }

    public int getTiled() {
        return tiled;
    }

    public void setTiled(int value) {
        tiled = value;
    }

    public int getCitypoint() {
        return citypoint;
    }

    public void setCitypoint(int value) {
        citypoint = value;
    }

    public int getFrontal() {
        return frontal;
    }

    public void setFrontal(int value) {
        frontal = value;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int value) {
        bedroom = value;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int value) {
        bathroom = value;
    }

    public int getKitchen() {
        return kitchen;
    }

    public void setKitchen(int value) {
        kitchen = value;
    }
    
    float percent = 0;
    float price = 0;
    
    public static void main(String[] args){
     new findValue().findValue();
    }

    public float findValue(){
        
        System.out.println("Starting neural network sample... ");

        int[][] x = DataUtils.readInputsFromFile("E:\\Final Project\\House\\info15.txt");
        float[] t = DataUtils.readOutputsFromFile("E:\\Final Project\\House\\price8.txt");
               

        NeuralNetwork neuralNetwork = new NeuralNetwork(x, t, new INeuralNetworkCallback() {
            
            public float returning(){
                
                return price;           
            }
            
             public float returningPercent(){
                
                return percent;           
            }
             
            @Override
            public float success(Result result) {
                int[] valueToPredict = new int[] {area,lsize,lvalue,hsize,stories,bed,bath,year,reno,highway,mainrd,hos,col,supermarket,scl,bus,wne,gar,cashcr,sec,garage,ac,tiled,citypoint,frontal,bedroom,bathroom,kitchen};         
                float percent2 = result.getSuccessPercentage();
                float price2 = result.predictValue(valueToPredict)*280;
                float price3 = price2;
                float percent3 = percent2;
                
                System.out.println("Success percentage: " + result.getSuccessPercentage());
                System.out.println("Predicted result: " + result.predictValue(valueToPredict));
                System.out.println("Predicted price: " + result.predictValue(valueToPredict)*280);  
                
                return price = price3;
            } 
            
            @Override
            public void failure(Error error) {
                System.out.println("Error: " + error.getDescription());
            }

        });

        neuralNetwork.startLearning();
        System.out.println("The Estimated Price is: " + price);
        System.out.println("Success percentage: " + this.percent);
        return this.price;

}          
    
}
