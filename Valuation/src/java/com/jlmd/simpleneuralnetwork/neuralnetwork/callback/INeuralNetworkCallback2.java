package com.jlmd.simpleneuralnetwork.neuralnetwork.callback;

import com.jlmd.simpleneuralnetwork.neuralnetwork.entity.Error;
import com.jlmd.simpleneuralnetwork.neuralnetwork.entity.Result;

/**
 * Callback for neural network
 * @author jlmd
 */
public interface INeuralNetworkCallback2 {
    /**
     * This method is called when neural network finish his work and all is good
     * @param result Entity to save obtained values
     */
    public float success(Result result);

    /**
     * This method is called when neural network finish his work and something is not good
     * @param error Entity to save obtained error
     */ 
     
}
