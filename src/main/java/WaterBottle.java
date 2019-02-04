public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){

        this.volume = volume;

    }

    public int volumeLevel(){
        return volume;
    }

    public int lessDrink(){
        return volume - 10;
    }

    public int emptyBottle(){
        return volume - 100;
    }

    public int fillBottle(){
        return volume;

    }

}
