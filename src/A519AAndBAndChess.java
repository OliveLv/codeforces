import java.util.Scanner;

/**
 * A and B are preparing themselves for programming contests.
 * 
 * To train their logical thinking and solve problems better, A and B decided to
 * play chess. During the game A wondered whose position is now stronger.
 * 
 * For each chess piece we know its weight:
 * 
 * the queen's weight is 9, the rook's weight is 5, the bishop's weight is 3,
 * the knight's weight is 3, the pawn's weight is 1, the king's weight isn't
 * considered in evaluating position. The player's weight equals to the sum of
 * weights of all his pieces on the board.
 * 
 * As A doesn't like counting, he asked you to help him determine which player
 * has the larger position weight.
 * 
 * Input 
 * The input contains eight lines, eight characters each ！ the board's
 * description.
 * 
 * The white pieces on the board are marked with uppercase letters, the black
 * pieces are marked with lowercase letters.
 * 
 * The white pieces are denoted as follows: the queen is represented is 'Q', the
 * rook ！ as 'R', the bishop ！ as'B', the knight ！ as 'N', the pawn ！ as 'P',
 * the king ！ as 'K'.
 * 
 * The black pieces are denoted as 'q', 'r', 'b', 'n', 'p', 'k', respectively.
 * 
 * An empty square of the board is marked as '.' (a dot).
 * 
 * It is not guaranteed that the given chess position can be achieved in a real
 * game. Specifically, there can be an arbitrary (possibly zero) number pieces
 * of each type, the king may be under attack and so on.
 * 
 * Output 
 * Print "White" (without quotes) if the weight of the position of the
 * white pieces is more than the weight of the position of the black pieces,
 * print "Black" if the weight of the black pieces is more than the weight of
 * the white pieces and print "Draw" if the weights of the white and black
 * pieces are equal.
 * 
 * Sample test(s) 
 * input 
 * ...QK... 
 * ........ 
 * ........ 
 * ........ 
 * ........ 
 * ........
 * ........ 
 * ...rk... 
 * output 
 * White 
 * input 
 * rnbqkbnr 
 * pppppppp 
 * ........ 
 * ........
 * ........ 
 * ........ 
 * PPPPPPPP 
 * RNBQKBNR 
 * output 
 * Draw 
 * input 
 * rppppppr 
 * ...k....
 * ........ 
 * ........ 
 * ........ 
 * ........ 
 * K...Q... 
 * ........ 
 * output 
 * Black 
 * Note 
 * In the first test sample the weight of the position of the white pieces equals
 * to 9, the weight of the position of the black pieces equals 5.
 * 
 * In the second test sample the weights of the positions of the black and the
 * white pieces are equal to 39.
 * 
 * In the third test sample the weight of the position of the white pieces
 * equals to 9, the weight of the position of the black pieces equals to 16.
 * 
 * @Title: A519AAndBAndChess.java
 * @author lxh
 * @date Sep 6, 2015 5:35:27 PM
 * 
 */

public class A519AAndBAndChess {
	public static int getWeight(char c){
		switch(c){
		case 'Q':return 9;
		case 'R':return 5;
		case 'B':return 3;
		case 'N':return 3;
		case 'P':return 1;
		case 'K':return 0;
		case 'q':return -9;
		case 'r':return -5;
		case 'b':return -3;
		case 'n':return -3;
		case 'p':return -1;
		case 'k':return 0;
		}
		return 0;
	}
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int s=0;
		for(int i=0;i<8;i++){
			String str=cin.next();
			for(int j=0;j<8;j++){
				char val=str.charAt(j);
				s+=getWeight(val);
			}
		}
		if(s<0)System.out.println("Black");
		else if(s==0)System.out.println("Draw");
		else
			System.out.println("White");
	}
}
