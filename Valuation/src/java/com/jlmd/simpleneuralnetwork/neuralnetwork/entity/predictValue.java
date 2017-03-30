/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jlmd.simpleneuralnetwork.neuralnetwork.entity;
import com.jlmd.simpleneuralnetwork.neuralnetwork.Analyzer;
import com.jlmd.simpleneuralnetwork.neuralnetwork.parser.result.IResultParser;


/**
 *
 * @author Karthi
 */
public class predictValue {
    private float successPercentage;
    private float quadraticError;
    private Analyzer analyzer;
    private IResultParser resultParser;
    
    
  //  public float predictValue(float[] element){
    //    return (analyzer.getFOut(element));
  //  }
}
