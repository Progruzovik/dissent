package net.progruzovik.dissent.model.util;

public final class Cell extends Point<Integer> {

    public Cell(Integer x, Integer y) {
        super(x, y);
    }

    public Cell(Cell cell) {
        super(cell);
    }

    public Cell() { super(); }

    public boolean isInBorders(Cell borders) {
        return getX() > -1 && getX() < borders.getX() && getY() > -1 && getY() < borders.getY();
    }

    public Point<Float> findCenter(Cell destination) {
        return new Point<>(getX().floatValue() + (destination.getX().floatValue() - getX().floatValue()) / 2,
                getY().floatValue() + (destination.getY().floatValue() - getY().floatValue()) / 2);
    }

    public int findDistanceToCell(Cell cell) {
        return Math.abs(cell.getX() - getX()) + Math.abs(cell.getY() - getY());
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() == obj.getClass()) {
            Cell cell = (Cell) obj;
            return getX().equals(cell.getX()) && getY().equals(cell.getY());
        }
        return false;
    }
}
