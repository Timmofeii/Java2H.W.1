import java.util.Random;

public class Wall implements Barrier {

    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }


    public void setWallHeight(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public int getWallHeight() {
        return wallHeight;
    }

    @Override
    public void overCome(Olympian olympian) {olympian.jump(this);

    }
}
