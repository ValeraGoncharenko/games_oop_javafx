package ru.job4j.chess.ex;

public class FigureNotFoundException extends RuntimeException{
    public FigureNotFoundException (String message){
        super(message);
    }
}
