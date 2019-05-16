/**
 *
 * @author José Robles Bastidas
 */
package Nnet;

public class Lambda {

    public String act;

    public Lambda(String activation) {
        if(activation.toLowerCase().contains("sigmoid")){
            this.act = "sigmoid";
        }else if(activation.toLowerCase().contains("relu")){
            this.act = "relu";
        }else if(activation.toLowerCase().contains("tanh")){
            this.act = "tanh";
        }else{
            throw new IllegalArgumentException("\nCan not understand activation function, please choose between: SIGMOID, TANH AND RELU.\n");
        }
    }

    public double get(double number) {
        double out = 0.0;
        switch(this.act){
            case "sigmoid":
                return(1.0/(1.0+Math.exp(-number)));
            case "tanh":
                return((1.0-Math.exp((-2)*number))/(1 + Math.exp((-2)*number)));
            case "relu":
                return(Math.max(0.0, number));
        }
        return out;
    }

    public int[] getSteps(String function) {
        boolean isParenthesis = true;
        while (isParenthesis) {

        }
        return new int[0];
    }
}
