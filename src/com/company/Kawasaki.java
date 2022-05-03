package com.company;

public class Kawasaki extends Moto{
    private int year;

    public int getYear() {
        return year;
    }
public void makeVoice(){
    System.out.println("Uuuuuuuuu");

}
public final void makeVoice(String voice){
    System.out.println(voice);
}


}
