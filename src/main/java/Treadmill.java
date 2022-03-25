public class Treadmill implements Barrier{

    private Integer length ;


    public  Treadmill( Integer length) {

        this.length = length;
    }
    public int getDistance() {
        return length;
    }
    @Override
    public void overCome(Olympian olympian) {
        olympian.run(this);
    }
}




