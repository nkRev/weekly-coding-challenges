import java.util.ArrayList;
import java.util.List;

public class Runnable {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		RPS play = new RPS();
		String p = "paper";
		String s = "scissors";
		String r = "rock";

		List playlist = new ArrayList<>();

		playlist.add(play.rps(r, p));
		playlist.add(play.rps(r, s));
		playlist.add(play.rps(r, r));
		playlist.add(play.rps(p, r));
		playlist.add(play.rps(p, s));
		playlist.add(play.rps(p, p));
		playlist.add(play.rps(s, s));
		playlist.add(play.rps(s, p));
		playlist.add(play.rps(s, r));
		
		playlist.forEach(obj ->{
			System.out.println(obj);
		});

	}
}
