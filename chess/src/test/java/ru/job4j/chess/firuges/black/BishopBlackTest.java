package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {
/*
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        CreateAction createAction = new CreateAction();
        createAction.execute(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }
 */
    /*
    1. Проверка метода position. Создайте объект и вызовите у него метод position.
    Проверьте, что он занимает ту же ячейку, что и при создании объекта.

    Обратите внимание, чтобы получить нужный объект из перечисления мы используем статический метод.
     */
    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell created = bishopBlack.position();
        Cell expected = Cell.C1;
        assertThat(created, is(expected));


    }
/*
2. Проверка метода copy. Создайте объект и вызовите у него метод copy.
 Проверьте, что, возвращенный объект имеет правильную позицию.
 */
    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        Figure created = bishopBlack.copy(Cell.A3);
        Cell expected = created.position();
        assertThat(Cell.A3, is(expected));

    }


    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] cellsCreated = bishopBlack.way(Cell.C1, Cell.G5);
        Cell[] cellsExpected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(cellsCreated, is(cellsExpected));
    }

    @Test (expected = IllegalStateException.class)
    public void wayException() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] cellsCreated = bishopBlack.way(Cell.C1, Cell.G6);
    }
}