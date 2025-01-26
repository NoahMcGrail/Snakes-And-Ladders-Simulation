public class Tester {
    public static void main(String[] args) {
        
        Player test1 = new Player("Player 1");
        Player test2 = new Player("Player 2");
        Player test3 = new Player("Player 3");
        Player test4 = new Player("Player 4");
        Player test5 = new Player("Player 5");
        Player test6 = new Player("Player 6");
        
        Game game1 = new Game(test1, test2, test3, test4, test5, test6);
        
        for(int i = 0; i < 1000000; i ++){
            game1.startGame();
        }
        
        game1.printAverage();
       
    }
}
