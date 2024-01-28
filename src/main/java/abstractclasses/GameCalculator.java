package abstractclasses;

public abstract class GameCalculator {
    public  abstract void hesapla(); //Olmak zorunda degil
    public  final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
