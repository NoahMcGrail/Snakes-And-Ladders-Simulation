public class Game 
{
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    private Player player5;
    private Player player6;
    private int games;
    
    public Game(Player player1, Player player2, Player player3, Player player4, Player player5, Player player6){
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.player4 = player4;
        this.player5 = player5;
        this.player6 = player6;
        games = 0;
    }
    
    public void startGame(){
        String name = "";
        int space;
        int turns = 1;
        
        Player currentPlayer = player1;
        player1.resetSpace();
        player2.resetSpace();
        player3.resetSpace();
        player4.resetSpace();
        player5.resetSpace();
        player6.resetSpace();
        
        System.out.println("Game: " + (games + 1));
        
        while(true){
            /*if(currentPlayer == player1){
                System.out.println("\nTurn: " + turns + "\n");
            }*/
            currentPlayer.startTurn();
            if(currentPlayer.winThisTurn() == true){
                player1.addGamePlayed();
                player2.addGamePlayed();
                player3.addGamePlayed();
                player4.addGamePlayed();
                player5.addGamePlayed();
                player6.addGamePlayed();
                games ++;
                currentPlayer.addWin();
                /*System.out.println("\nGame " + games + " has ended! Here are the current stats: \n");
                System.out.println(player1);
                System.out.println("");
                System.out.println(player2);
                System.out.println("");
                System.out.println(player3);
                System.out.println("");
                System.out.println(player4);
                System.out.println("");
                System.out.println(player5);
                System.out.println("");
                System.out.println(player6);
                System.out.println("");*/
                break;
            }
            name = currentPlayer.getName();
            space = currentPlayer.getSpace();
            //System.out.println(name + " - Space: " + space);
            currentPlayer = rotatePlayer(currentPlayer);
            if(currentPlayer == player6){
                turns ++;
            }
        }
    }
    
    public void printAverage(){
        System.out.println("\n" + player1.getName() + " - Wins / Games Played: " + player1.getWins() + "/" + player1.getGamesPlayed() + " - Win Rate: " + ((double) 100 * player1.getWins() / player1.getGamesPlayed()) + "%");
        System.out.println(player2.getName() + " - Wins / Games Played: " + player2.getWins() + "/" + player2.getGamesPlayed() + " - Win Rate: " + ((double) 100 * player2.getWins() / player2.getGamesPlayed())+ "%");
        System.out.println(player3.getName() + " - Wins / Games Played: " + player3.getWins() + "/" + player3.getGamesPlayed() + " - Win Rate: " + ((double) 100 * player3.getWins() / player3.getGamesPlayed())+ "%");
        System.out.println(player4.getName() + " - Wins / Games Played: " + player4.getWins() + "/" + player4.getGamesPlayed() + " - Win Rate: " + ((double) 100 * player4.getWins() / player4.getGamesPlayed())+ "%");
        System.out.println(player5.getName() + " - Wins / Games Played: " + player5.getWins() + "/" + player5.getGamesPlayed() + " - Win Rate: " + ((double) 100 * player5.getWins() / player5.getGamesPlayed())+ "%");
        System.out.println(player6.getName() + " - Wins / Games Played: " + player6.getWins() + "/" + player6.getGamesPlayed() + " - Win Rate: " + ((double) 100 * player6.getWins() / player6.getGamesPlayed()) + "%" + "\n");
    }
    
    public Player rotatePlayer(Player currentPlayer){
        if(currentPlayer == player1){
            return player2;
        } else if(currentPlayer == player2){
            return player3;
        } else if(currentPlayer == player3){
            return player4;
        } else if(currentPlayer == player4){
            return player5;
        } else if(currentPlayer == player5){
            return player6;
        } else if(currentPlayer == player6){
            return player1;
        }
        else return player1;
    }
    
    public static void main(String[] args) {
    }
}
