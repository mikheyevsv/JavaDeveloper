package ru.serg.model;

/**
 * Класс создает игока Компьютера.
 * @author Serg
 */
public class AI {

    private Figure figure;

    /**
     * проверяем является ли игрок активным.
     */
    private boolean isActive;


    public AI(Figure figure, boolean isActive) {
        this.isActive = isActive;
        this.figure = figure;
    }

    public AI(Figure figure) {
        this.figure = figure;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    public Figure getFigure() {
        return figure;
    }
}
