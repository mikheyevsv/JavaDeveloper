package ru.serg.model;


/**
 * @author Serg/
 * Класс создает игру.
 */
public class Game {

    /**
     * размер игрового поля
     */
    private int fieldSize;

    /**
     * Игрок ЧЕЛОВЕК.
     */
    private Player [] humans = new Player[2];

    /**
     * Игровое поле.
     */

    private AI[][] field;

    /**
     * Игрок КОМПЬЮТЕР.
     */

    private AI[] comp = new AI[2];

    public Game(int fieldSize)  {
        this.fieldSize = fieldSize;
        this.field = new AI[fieldSize][fieldSize];
    }


    public int getFieldSize() {
        return fieldSize;
    }
    /**
     *  Инициализация игры.
     */

    public void gameInitialize (){
        this.comp[0] = new AI(Figure.X, true);
        this.comp[1] = new AI(Figure.O);
    }


    /**
     * Устанавливаем фигурры.
     */
    public AI getAiByFigure(Figure figure){
        AI res = null;
        for (int i = 0; i < this.comp.length ; i++) {
            if (this.comp[i] != null && this.comp[i].getFigure().equals(figure)) {
                res = this.comp[i];
                break;
            }
        }
        return res;
    }


    /**
     * Печать поля игры
     */

    public void printGameField(){
        for (int i = 0; i < this.fieldSize; i++) {
            for (int j = 0; j < this.fieldSize; j++) {
                System.out.print(field[i][j] == null ? "*" : field[i][j].getFigure());
            }
            System.out.println();
        }
    }

    /**
     * Находим пустые клетки.
     */

    public String getFreeCells(){
        int x = (int) Math.random() * (this.fieldSize);
        int y = (int) Math.random() * (this.fieldSize);
        while (field[x][y] != null) {
            x = (int) (Math.random() * (this.fieldSize));
            y = (int) (Math.random() * (this.fieldSize));
        }
        return String.valueOf(x) + String.valueOf(y);
    }

    /**
     * Устанавливаем игрока.
     */

    public void setComp(Player comp){
        for (int i = 0; i <this.humans.length ; i++) {
            if (this.humans[i] == null ){
                humans[i] = comp;
                break;
            }
        }

    }

    /**
     * Создаем игрока ЧЕЛОВЕК.
     */

    public Player getNextPlayer() {

        Player res = null;

            for (int i = 0; i < this.humans.length; i++) {

                if (this.humans[i] != null && this.humans[i].getAi().getIsActive()) {

                    res = humans[i];
                    break;
                }
            }
            return res;
    }

    /**
     * Создаем игрока КОМПЬЮТЕР
     */

    public AI getNextAI(){
        AI res = null;
        for (int i = 0; i < this.comp.length; i++) {
            if (this.comp[i] != null && this.comp[i].getIsActive() ) {
                res = this.comp[i];
                break;
            }
        }
        return res;
    }

    /**
     * Устанавливаем игрока
     * @param player
     */

    public void setPlayr(Player player){
        for (int i = 0; i < this.humans.length ; i++) {
            if (this.humans[i] == null) {
                this.humans[i] = player;
                break;
            }
        }
    }

    /**
     * Ход игрока.
     */

    public boolean isNextStep(){
        boolean res = isGameover();
        transitionProgress();
        return res;
    }

    /**
     * Делаем ход.
     */

    public void makeMove(String cell){

            int x = Character.getNumericValue(cell.charAt(0));
            int y = Character.getNumericValue(cell.charAt(1));
            try {
                if (field[x][y] == null) {
                    field[x][y] = getNextAI();

                } else {
                    System.out.println("is bussy");

                }
            }catch (ArrayIndexOutOfBoundsException ae){
                System.out.println("MNOGO");
            }
    }

    /**
     * Переход хода.
     */

    private void transitionProgress() {


        for (int i = 0; i < this.comp.length; i++) {

            if (this.humans[i] == null) {
                    this.comp[i].setActive(!this.comp[i].getIsActive());
                    }
                   else if (this.humans[i] != null) {
                    this.comp[i].setActive(!this.humans[i].getIsRobot());
                    }

            }
    }



    /**
     * Проверка на конец игры.
     */

    private boolean isGameover(){
        return fieldIsFull() || isPlayerWin();
    }

    /**
     * Проверка на заполнение всего поля.
     */

    private boolean fieldIsFull(){
        for (int i = 0; i < this.fieldSize ; i++) {
            for (int j = 0; j < this.fieldSize; j++) {
                if (field[i][j] ==null){
                    return false;
                };
            }
        }
        return true;
    }

    /**
     * Проверка на выйгрыш.
     */

    private boolean isPlayerWin(){
        return isHorizontalWins() || isWinsVertical()
                                  || isDiagonalWins();
    }

    /**
     * Проверка выйгрыша по вертикали.
     */

    private boolean isWinsVertical(){

        for (int i = 0; i < this.fieldSize; i++) {
            int count = 0;
            for (int j = 0; j < this.fieldSize; j++) {
                if (field[i][j] != null && field[i][j].equals(getNextAI())) {
                    count++;
                }
            }
            if (count == this.fieldSize){
                return true;
            }
        }
        return false;
    }

    /**
     * Проверка выйгрыша по горизонтали.
     */

    private boolean isHorizontalWins(){

        for (int i = 0; i < this.fieldSize; i++) {
            int count = 0;
            for (int j = 0; j < this.fieldSize; j++) {
                if (field[i][j] != null && field[i][j].equals(getNextAI())) {
                count++;
                }
            }
            if (count == this.fieldSize){
                return true;
            }
        }
        return false;
    }

    /**
     * Проверка выйгрыша по диагонали.
     */

    private boolean isDiagonalWins(){
        int count = 0;
        for (int i = 0; i < this.fieldSize; i++) {
            if (field[i][i] != null && field[i][i].equals(getNextAI())) {
                count++;
            }
        }
        if(count == this.fieldSize) { return true; }

        count = 0;
        for (int i = 0, j = this.fieldSize-1; i < this.fieldSize; i++, j--) {
            if (field[i][j] != null && field[i][j].equals(getNextAI())) {
                count++;
            }
        }
        if(count == this.fieldSize) {
            return true;
        } else {
            return false;
        }
    }
}


