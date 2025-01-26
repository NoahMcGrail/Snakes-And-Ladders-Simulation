public class Player
{
    private String name;
    private int space;
    private int wins;
    private int gamesPlayed;

    public Player(String name){
        this.name = name;
        space = 0;
        wins = 0;
        gamesPlayed = 0;
    }
    
    public void resetSpace(){
        space = 0;
    }
    
    public void startTurn(){
        int rolledNum = 6;
        int tempNum = 0;
        while(rolledNum == 6){
            if(space == 100){
            break;
            }
            rolledNum = (int)(Math.random() * 6) + 1;
            if(space + rolledNum > 100){
                tempNum = 100 - space;
                space = rolledNum - tempNum;
            } else {
                space += rolledNum;
            }
            // System.out.println(name + " is moving " + rolledNum + " space(s)");
            checkSpace(space);
        }
    }
    
    public boolean winThisTurn(){
        return space == 100;
    }
    
    public void addWin(){
        wins ++;
    }
    
    public void addGamePlayed(){
        gamesPlayed ++;
    }
    
    public String getName(){
        return name;
    }
    
    public int getSpace(){
        return space;
    }
    
    public int getWins(){
        return wins;
    }
    
    public int getGamesPlayed(){
        return gamesPlayed;
    }
    
    public void checkSpace(int currentSpace){
        if(currentSpace == 1){
            //System.out.println(name + " is taking a ladder from 1 to 38!");
            space = 38;
        }
        if(currentSpace == 4){
            //System.out.println(name + " is taking a ladder from 4 to 14!");
            space = 14;
        }
        if(currentSpace == 9){
            //System.out.println(name + " is taking a ladder from 9 to 31!");
            space = 31;
        }
        if(currentSpace == 16){
            //System.out.println(name + " is taking a snake from 16 to 6!");
            space = 6;
        }
        if(currentSpace == 21){
            //System.out.println(name + " is taking a ladder from 21 to 42!");
            space = 42;
        }
        if(currentSpace == 28){
            //System.out.println(name + " is taking a ladder from 28 to 84!");
            space = 84;
        }
        if(currentSpace == 36){
            //System.out.println(name + " is taking a ladder from 36 to 44!");
            space = 44;
        }
        if(currentSpace == 47){
           // System.out.println(name + " is taking a snake from 47 to 26!");
            space = 26;
        }
        if(currentSpace == 49){
           // System.out.println(name + " is taking a snake from 49 to 11!");
            space = 11;
        }
        if(currentSpace == 51){
           // System.out.println(name + " is taking a ladder from 51 to 67!");
            space = 67;
        }
        if(currentSpace == 56){
           // System.out.println(name + " is taking a snake from 56 to 53!");
            space = 53;
        }
        if(currentSpace == 62){
           // System.out.println(name + " is taking a snake from 62 to 19!");
            space = 19;
        }
        if(currentSpace == 64){
            //System.out.println(name + " is taking a snake from 64 to 60!");
            space = 60;
        }
        if(currentSpace == 71){
            //System.out.println(name + " is taking a ladder from 71 to 91!");
            space = 91;
        }
        if(currentSpace == 80){
            //System.out.println(name + " is taking a ladder from 80 to 100!");
            space = 100;
        }
        if(currentSpace == 87){
            //System.out.println(name + " is taking a snake from 87 to 24!");
            space = 24;
        }
        if(currentSpace == 93){
            //System.out.println(name + " is taking a snake from 93 to 73!");
            space = 73;
        }
        if(currentSpace == 95){
            //System.out.println(name + " is taking a snake from 95 to 75!");
            space = 75;
        }
        if(currentSpace == 98){
            //System.out.println(name + " is taking a snake from 98 to 78!");
            space = 78;
        }
    }
     
    public String toString(){
        return ("Name: " + name + "\nWins: " + wins + "\nGames Played: " + gamesPlayed);
    }
    
        public static void main(String[] args){
        
    }
    
}
