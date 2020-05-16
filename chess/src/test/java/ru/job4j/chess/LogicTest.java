package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.ex.FigureNotFoundException;
import ru.job4j.chess.ex.FigurePathNotBusy;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LogicTest {

    @Test
    @Ignore
    public void moveFindObject() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        boolean indexCreate = logic.move(Cell.C1, Cell.G5);
        assertThat(indexCreate, is(true));

    }

    @Test(expected = FigurePathNotBusy.class)
    public void whenFigurePathNotBusy() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.B2));
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.B2);
    }

    @Test(expected = FigureNotFoundException.class)
    public void whenFigureNotFound() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C2, Cell.C3);
    }

    @Test
    public void whenStepIsPossible() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.F8));
        boolean result = logic.move(Cell.F8, Cell.E7);
        assertThat(result, is(true));
    }
}


