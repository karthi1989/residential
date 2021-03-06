package com.jlmd.simpleneuralnetwork.example;

import com.jlmd.simpleneuralnetwork.neuralnetwork.entity.Result;
import com.jlmd.simpleneuralnetwork.neuralnetwork.utils.DataUtils;
import com.jlmd.simpleneuralnetwork.neuralnetwork.NeuralNetwork;
import com.jlmd.simpleneuralnetwork.neuralnetwork.entity.Error;
import com.jlmd.simpleneuralnetwork.neuralnetwork.callback.INeuralNetworkCallback;


/**
 * @author jlmd
 */
public class Main2 {
    
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

    public void setArea(int area) {
        this.area = area;
    }

    public int getLsize() {
        return lsize;
    }

    public void setLsize(int lsize) {
        this.lsize = lsize;
    }

    public int getLvalue() {
        return lvalue;
    }

    public void setLvalue(int lvalue) {
        this.lvalue = lvalue;
    }

    public int getHsize() {
        return hsize;
    }

    public void setHsize(int hsize) {
        this.hsize = hsize;
    }

    public int getStories() {
        return stories;
    }

    public void setStories(int stories) {
        this.stories = stories;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getBath() {
        return bath;
    }

    public void setBath(int bath) {
        this.bath = bath;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getReno() {
        return reno;
    }

    public void setReno(int reno) {
        this.reno = reno;
    }

    public int getHighway() {
        return highway;
    }

    public void setHighway(int highway) {
        this.highway = highway;
    }

    public int getMainrd() {
        return mainrd;
    }

    public void setMainrd(int mainrd) {
        this.mainrd = mainrd;
    }

    public int getHos() {
        return hos;
    }

    public void setHos(int hos) {
        this.hos = hos;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getSupermarket() {
        return supermarket;
    }

    public void setSupermarket(int supermarket) {
        this.supermarket = supermarket;
    }

    public int getScl() {
        return scl;
    }

    public void setScl(int scl) {
        this.scl = scl;
    }

    public int getBus() {
        return bus;
    }

    public void setBus(int bus) {
        this.bus = bus;
    }

    public int getWne() {
        return wne;
    }

    public void setWne(int wne) {
        this.wne = wne;
    }

    public int getGar() {
        return gar;
    }

    public void setGar(int gar) {
        this.gar = gar;
    }

    public int getCashcr() {
        return cashcr;
    }

    public void setCashcr(int cashcr) {
        this.cashcr = cashcr;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getGarage() {
        return garage;
    }

    public void setGarage(int garage) {
        this.garage = garage;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getTiled() {
        return tiled;
    }

    public void setTiled(int tiled) {
        this.tiled = tiled;
    }

    public int getCitypoint() {
        return citypoint;
    }

    public void setCitypoint(int citypoint) {
        this.citypoint = citypoint;
    }

    public int getFrontal() {
        return frontal;
    }

    public void setFrontal(int frontal) {
        this.frontal = frontal;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public int getKitchen() {
        return kitchen;
    }

    public void setKitchen(int kitchen) {
        this.kitchen = kitchen;
    }
    
    float price;
     
    
     public float estValue(){
        
        System.out.println("Starting neural network sample... ");

        int[][] x = DataUtils.readInputsFromFile("E:\\Final Project\\House\\info18.txt");
        float[] t = DataUtils.readOutputsFromFile("E:\\Final Project\\House\\price9.txt");
                  

        NeuralNetwork neuralNetwork = new NeuralNetwork(x, t, new INeuralNetworkCallback() {
            @Override
            public float success(Result result) {
                int[] valueToPredict = new int[] {getArea(),getLsize(),getLvalue(),getHsize(),getStories(),getBed(),getBath(),getYear(),getReno(),getHighway(),getMainrd(),getHos(),getCol(),getSupermarket(),getScl(),getBus(),getWne(),getGar(),getCashcr(),getSec(),getGarage(),getAc(),getTiled(),getCitypoint(),getFrontal(),getBedroom(),getBathroom(),getKitchen()}; 
                System.out.println("Success percentage: " + result.getSuccessPercentage());
                System.out.println("Predicted result: " + result.predictValue(valueToPredict));
                System.out.println("Predicted price: " + result.predictValue(valueToPredict)*280);
                return price = result.predictValue(valueToPredict)*280;
            }

            
            @Override
            public void failure(Error error) {
                System.out.println("Error: " + error.getDescription());
            }

            @Override
             public float returning(){
                
                return 0;           
            }
        });

        neuralNetwork.startLearning();
        System.out.println("The Estimated Price is: " + price);
        return price;
        
}

}
