package sample.paint.model;

import sample.paint.Board;
import sample.paint.DisplayDriver;

public class Oval extends AbstractShape {

    public Oval(DisplayDriver driver, Board board, int x, int y, int size) {
        super(driver, board, x, y, size);
    }

    @Override
    public void draw() {
        driver.drawOval(x, y, size, active);
    }

    @Override
    public Shape copy() {
        return new Oval(driver, board, x, y, size);
    }

}
