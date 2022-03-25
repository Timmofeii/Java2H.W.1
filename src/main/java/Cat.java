public class Cat implements Olympian{
    private int totalRun;
    private int bounceUpp;

    public Cat(int totalRun, int bounceUpp) {
        this.totalRun = totalRun;
        this.bounceUpp = bounceUpp;
    }
   

    public boolean jump(Wall wall) {
        if (bounceUpp < wall.getWallHeight()) {
            System.out.println("Стена оказалась слишком высокой"); return false;
        } else {
            System.out.println("Учасник удачно преодолел стену высотой" + wall.getWallHeight() + " метров");
        }return true;
    }

    public boolean run(Treadmill treadmill) {
        if (totalRun >=treadmill.getDistance()) {
            System.out.println("Преодолел препядствие в " + treadmill.getDistance() + " метров");
            return true;


        }
        System.out.println("Препядствие оказалось слишком длинным");
        return false;
    }
    }


