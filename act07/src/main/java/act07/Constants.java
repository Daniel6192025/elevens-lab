package act07;

/**
 * @author Roger Jaffe
 * @version 1.0
 */
public class Constants {
  // TO BE COMPLETED IN ACTIVITY 07
    public static final String[] RANKS = {"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
    public static final String[] SUITS = {"clubs","spades","diamonds","hearts"};
    public static final int[] POINT_VALUES = {1,2,3,4,5,6,7,8,9,10,0,0,0};
    public static final int BOARD_SIZE = 9;
    public static final int YOU_WIN = 1;
    public static final int YOU_LOSE = 2;
    public static final int IN_PLAY = 0;

private int gameStatus;
private Deck deck;
private Card[] board;
private boolean[] cardSelected;
private boolean validSelection;
private boolean gameWon;
private int gamesWon;
private int gamesPlayed;

 public void init() {
      deck= new Deck(Constants.RANKS, Constants.SUITS, Constants.POINT_VALUES);
   
   board= new Card[9];
   cardSelected= new boolean[9];
   for(int i=0;i<Constants.BOARD_SIZE;i++){
       // set all cards to non-selected
       cardSelected[i]=false;
       
   }
   gamesWon=0;
   gamesPlayed=0;        
  }

}
