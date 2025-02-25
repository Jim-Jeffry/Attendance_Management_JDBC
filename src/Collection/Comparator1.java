package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class player{
	String player;
	int score;
	player(String player, int score){
		this.player=player;
		this.score=score;
	}
	@Override
	public String toString() {
		return "player=" + player + ", score=" + score ;
	}
	
}
public class Comparator1 implements Comparator<player>{
		public static void main(String[] args) {
			List<player> play=new ArrayList<>();
			play.add(new player("a",10));
			play.add(new player("b",20));
			play.add(new player("e",30));
			play.add(new player("d",40));
			play.add(new player("c",30));
			Collections.sort(play,new Comparator1());
			System.out.println(play);
			
	}
		public int compare(player r1,player t2){
			if(r1.score<t2.score) {
				return -1;
			}
			else if(r1.score>t2.score) {
				return 1;
			}
			else {
				return r1.player.compareTo(t2.player);
			}
			
		}

}
