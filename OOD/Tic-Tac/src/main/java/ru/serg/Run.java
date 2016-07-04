package ru.serg;

import ru.serg.InterractInput.Console;
import ru.serg.model.Figure;
import ru.serg.model.Game;
import ru.serg.InterractInput.UserInput;
import ru.serg.model.Player;

/**
 * Created by Serg on 08.06.2016.
 */
public class Run {

    private UserInput input;

    public Run(UserInput input) {
        this.input = input;
    }

    /**
     * Инициализация игры
     *
     */
    public void init(Game game){
        int fieldSize = game.getFieldSize();
        do {
            if (game.getNextPlayer().getIsRobot()){
                game.makeMove(game.getFreeCells());
                game.printGameField();
            }else {
                game.makeMove(this.input.askUser("ты ходи", fieldSize));
            }
        }while (!game.isStep());
        System.out.println("Конец всему");
    }

    public static void main(String[] args) {
        Game game = new Game(4);
        game.gameInitialize();

        Player comp = new Player();
        Player man = new Player();

        comp.setRobot(true);

        comp.setAi(game.getAiByFigure(Figure.X));
        man.setAi(game.getAiByFigure(Figure.O));

        game.setPlayr(comp);
        game.setPlayr(man);

        UserInput input = new Console();

        new Run(input).init(game);
    }

}