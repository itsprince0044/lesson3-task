package Abstractioin;

abstract class Bird{
   public abstract void fly();
}
class Eagle extends Bird{
    @Override
    public void fly(){
        System.out.println("Eagle can fly.");
    }
}
class Penguin extends Bird{
    @Override
    public void fly(){
        System.out.println("Penguin can't fly.");
    }
}
public class Birds {
    public static void main(String[]args){
        Eagle eagle=new Eagle();
        eagle.fly();
        Penguin penguin =new Penguin();
        penguin.fly();
    }
}
