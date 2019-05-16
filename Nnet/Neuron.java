/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nnet;
import AlphaDeployment.*;
import BetaDeployment.*;

/**
 *
 * @author José Robles Bastidas
 */
public class Neuron {

    public double[] weights;
    public double bias;
    public Lambda act;

    public Neuron(double[] weights, double bias, Lambda act) {
        this.weights = weights;
        this.bias = bias;
        this.act = act;
    }

    public double[] getWeights() {
        return weights;
    }

    public void setWeights(double[] weights) {
        this.weights = weights;
    }

    public double getBias() {
        return bias;
    }

    public void setBias(double bias) {
        this.bias = bias;
    }

    public Lambda getAct() {
        return act;
    }

    public void setAct(Lambda act) {
        this.act = act;
    }
    
    public double forward(double[] feed){
        double sum = 0;
        for(int i = 0; i < this.weights.length; i++){
            //multiply and add bias
            //add all together
            sum += (feed[i]*this.weights[i]);
        }
        sum += this.bias;
        //activation
        return ((double)Math.round((this.act.get(sum)) * 100000000000d) / 100000000000d);
    }
    
    

}
