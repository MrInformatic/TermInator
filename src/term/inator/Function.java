/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term.inator;

import term.inator.opperrator.Variable;
import java.util.Map.Entry;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author philipp
 */
public class Function {
    private Term term;
    private Variable[] parameter;
    
    public Function(Variable[] parameter,Term term){
        this.parameter = parameter;
        this.term = term;
    }
    
    public Result[] execute(Task ... task){
        return executeing(0,new double[task.length],task).toArray(Result[]::new);
    }
    
    private Stream<Result> executeing(int i,double[] input,Task[] task){
        if(i<task.length){
            return task[i].getDoubleStream()
                    .mapToObj(n -> {
                        double[] result = input.clone();
                        result[i] = n;
                        return result;
                    })
                    .map(n -> executeing(i+1,n,task))
                    .flatMap(n -> n);
        }else{
            DoubleStream.of(input).parallel();
            return Stream.of(new Result(input,term.opperrate()));
        }
    } 
    
    public class Task{
        private double boundsmin;
        private double boundsmax;
        private double stepsize;
        
        public Task(double boundsmin,double boundsmax,double stepsize){
            this.boundsmin = boundsmin;
            this.boundsmax = boundsmax;
            this.stepsize = stepsize;
        }
        
        public double getStepSize(){
            return stepsize;
        }
        
        public double getBoundsMin(){
            return boundsmin;
        }
        
        public double getBoundsMax(){
            return boundsmax;
        }
        
        public void setStepSize(double value){
            stepsize = value;
        }
        
        public void setBoundsMin(double value){
            boundsmin = value;
        }
        
        public void setBoundsMax(double value){
            boundsmax = value;
        }
        
        public DoubleStream getDoubleStream(){
            return DoubleStream.iterate(boundsmin,i -> i+stepsize).limit(Math.round((boundsmin-boundsmax)/stepsize));
        }
    }
    
    public class Result{
        private double[] input;
        private double output;
        
        public Result(double[] input,double output){
            this.input = input;
            this.output = output;
        }
        
        public double[] getInput(){
            return input;
        }
        
        public double getOutput(){
            return output;
        }
        
        public void setInput(double[] value){
            input = value;
        }
        
        public void setOutput(double value){
            output = value;
        }
    }
}
