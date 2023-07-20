package org.example.training.rpssolid;

public class RpsGame implements Game {

    @Override
    public void play() {
        System.out.println("Playing the Game");
    }

    @Override
    public Result getResult() {
        return new StringResult();
    }
}
