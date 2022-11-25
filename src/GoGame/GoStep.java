package GoGame;

import java.io.Serializable;

public class GoStep implements Serializable {
    int x, y, player;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getPlayer() {
        return player;
    }

    public GoStep() {
    }

    public GoStep(int x, int y, int player) {
        this.x = x;
        this.y = y;
        this.player = player;
    }
}
