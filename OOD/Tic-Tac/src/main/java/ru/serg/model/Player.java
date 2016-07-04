package ru.serg.model;

/**
 * @author Serg.
 *  Класс создает игрока.
 */
public class Player {

    /**
     * загружаем искуственный интелект
     */

    private AI ai;

    /**
     * Проверяем является ли игрок роботом
     */

    private boolean isRobot;



    public AI getAi() {
        return ai;
    }

    public void setAi(AI ai) {
        this.ai = ai;
    }

    public void setRobot(boolean isRobot) {
        this.isRobot = isRobot;
    }

    public boolean getIsRobot() {
        return this.isRobot;
    }
}
