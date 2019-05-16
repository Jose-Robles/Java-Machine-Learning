/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import AlphaDeployment.*;
import BetaDeployment.*;

import Nnet.Lambda;
import Nnet.Neuron;
import Nnet.Layer;
import Nnet.NNet;

/**
 *
 * @author José Robles Bastidas
 */
public class ForwardCheck {
    
    public NNet nNet;

    public ForwardCheck() {
        double[] weights1 = new double[]{1.0};
        double[] weights21 = new double[]{1.0};
        double[] weights22 = new double[]{2.0};
        double[] weights23 = new double[]{3.0};
        double[] weights3 = new double[]{3.0, 2.0, 1.0};
        Neuron iNeuron = new Neuron(weights1, 0.0, new Lambda("relu"));
        Neuron hNeuron1 = new Neuron(weights21, 3.0, new Lambda("sigmoid"));
        Neuron hNeuron2 = new Neuron(weights22, 2.0, new Lambda("sigmoid"));
        Neuron hNeuron3 = new Neuron(weights23, 1.0, new Lambda("sigmoid"));
        Neuron oNeuron = new Neuron(weights3, -3, new Lambda("tanh"));
        Neuron[] iLayer = new Neuron[]{iNeuron};
        Neuron[] hLayer = new Neuron[]{hNeuron1,hNeuron2, hNeuron3};
        Neuron[] oLayer = new Neuron[]{oNeuron};
        Layer inputLayer = new Layer(iLayer, 1, "i");
        Layer hiddenLayer = new Layer(hLayer, 1, "h");
        Layer outputLayer = new Layer(oLayer, 3, "o");
        Layer[] topology = new Layer[]{inputLayer, hiddenLayer, outputLayer};
        this.nNet = new NNet(topology);
    }
    public ForwardCheck(boolean debuggable) {
        double[] weights1 = new double[]{1.0};
        double[] weights21 = new double[]{1.0};
        double[] weights22 = new double[]{2.0};
        double[] weights23 = new double[]{3.0};
        double[] weights3 = new double[]{3.0, 2.0, 1.0};
        Neuron iNeuron = new Neuron(weights1, 0.0, new Lambda("relu"));
        Neuron hNeuron1 = new Neuron(weights21, 3.0, new Lambda("sigmoid"));
        Neuron hNeuron2 = new Neuron(weights22, 2.0, new Lambda("sigmoid"));
        Neuron hNeuron3 = new Neuron(weights23, 1.0, new Lambda("sigmoid"));
        Neuron oNeuron = new Neuron(weights3, -3, new Lambda("tanh"));
        Neuron[] iLayer = new Neuron[]{iNeuron};
        Neuron[] hLayer = new Neuron[]{hNeuron1,hNeuron2, hNeuron3};
        Neuron[] oLayer = new Neuron[]{oNeuron};
        Layer inputLayer = new Layer(iLayer, 1, "i");
        Layer hiddenLayer = new Layer(hLayer, 1, "h");
        Layer outputLayer = new Layer(oLayer, 3, "o");
        Layer[] topology = new Layer[]{inputLayer, hiddenLayer, outputLayer};
        this.nNet = new NNet(topology, debuggable);
    }
    
    public boolean check(){
        double output = this.nNet.forward(new double[]{1.1})[0];
        System.out.println("The output of the created Neural Network is --> " + output + " .");
        return (output == 0.99406056932);
    }

}
