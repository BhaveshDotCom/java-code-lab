package Enum;

public class CoordinateMovementImplementation {
    public static void main(String[] args) {

        int x = 3;
        int y = 1;

        Direction direction = Direction.NORTH;

        direction.printDirection();

        int[] newPosition = direction.move(x, y);

        System.out.println(
                "New Position = (" +
                newPosition[0] + ", " +
                newPosition[1] + ")"
        );
    }
}

enum Direction {

    NORTH(0, 1) {

        @Override
        public void printDirection() {
            System.out.println("Moving North");
        }
    },

    EAST(1, 0) {

        @Override
        public void printDirection() {
            System.out.println("Moving East");
        }
    },

    SOUTH(0, -1) {

        @Override
        public void printDirection() {
            System.out.println("Moving South");
        }
    },

    WEST(-1, 0) {

        @Override
        public void printDirection() {
            System.out.println("Moving West");
        }
    };

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public int[] move(int x, int y) {
        return new int[]{x + dx, y + dy};
    }

    public abstract void printDirection();
}