package CardGameJavaTutorial;
public class Card {
	
	/*Java’da final denince ilk akla deðiþtirilemez 
	 * (this cannot be changed) anlamý gelmektedir.
 
 
final anahtar kelimesinin nasýl kullanýlacaðýný inceleyelim:
1. Final Sýnýflar :  Final sýnýflarý extend edilemez.
2. Final Methodlar : Final methodlarýn final parametrelerinin deðerleri deðiþtirilemez. 
                     Kullaným amacý : Performans ve tasarým
3. Final Deðiþkenler : Sadece bir kere ve oluþturma sýrasýnda deðer atamasý yapýlýr.
*/
	
	private final int rank;
	private final int suit;
	
	// kart adlari ve degerleri - suit
	public final static int DIAMONDS = 1; //karo
    public final static int CLUBS    = 2; //sinek
    public final static int HEARTS   = 3; //kalp
    public final static int SPADES   = 4; //maca
	
    
    // kart degerleri - rank
    public final static int ACE   = 1;
    public final static int DEUCE = 2;
    public final static int THREE = 3;
    public final static int FOUR  = 4;
    public final static int FIVE  = 5;
    public final static int SIX   = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE  = 9;
    public final static int TEN   = 10;
    public final static int JACK  = 11;
    public final static int QUEEN = 12;
    public final static int KING  = 13;
    
    //constructor
    
    public Card(int rank,int suit)
    {
    	assert isValidRank(rank);
    	assert isValidSuit(suit);
    	this.rank = rank;
    	this.suit = suit;
    }
    
    public static boolean isValidRank(int rank)
    {
    	return ACE<=rank && rank<=KING;
    }
    
    public static boolean isValidSuit(int suit)
    {
    	return DIAMONDS <= suit && suit <= SPADES;
    }
    
    public int getRank()
    {
    	return rank;
    }
    
    public int getSuit()
    {
    	return suit;
    }

    public static String rankToString(int rank) {
        switch (rank) {
        case ACE:
            return "Ace";
        case DEUCE:
            return "Deuce";
        case THREE:
            return "Three";
        case FOUR:
            return "Four";
        case FIVE:
            return "Five";
        case SIX:
            return "Six";
        case SEVEN:
            return "Seven";
        case EIGHT:
            return "Eight";
        case NINE:
            return "Nine";
        case TEN:
            return "Ten";
        case JACK:
            return "Jack";
        case QUEEN:
            return "Queen";
        case KING:
            return "King";
        default:
            return null;
        }    
    }
    
    public static String suitToString(int suit) {
        switch (suit) {
        case DIAMONDS:
            return "Diamonds";
        case CLUBS:
            return "Clubs";
        case HEARTS:
            return "Hearts";
        case SPADES:
            return "Spades";
        default:
            return null;
        }    
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		assert rankToString(ACE) == "Ace";
        assert rankToString(DEUCE) == "Deuce";
        assert rankToString(THREE) == "Three";
        assert rankToString(FOUR) == "Four";
        assert rankToString(FIVE) == "Five";
        assert rankToString(SIX) == "Six";
        assert rankToString(SEVEN) == "Seven";
        assert rankToString(EIGHT) == "Eight";
        assert rankToString(NINE) == "Nine";
        assert rankToString(TEN) == "Ten";
        assert rankToString(JACK) == "Jack";
        assert rankToString(QUEEN) == "Queen";
        assert rankToString(KING) == "King";

        assert suitToString(DIAMONDS) == "Diamonds";
        assert suitToString(CLUBS) == "Clubs";
        assert suitToString(HEARTS) == "Hearts";
        assert suitToString(SPADES) == "Spades";
        
        Deck deck = new Deck();
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                Card card = deck.getCard(suit, rank);
                System.out.format("%s of %s%n",
                    Card.rankToString(card.getRank()),
                    Card.suitToString(card.getSuit()));
            }
        }
	}

}


