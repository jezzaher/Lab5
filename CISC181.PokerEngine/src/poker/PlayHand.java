package poker;

import java.util.ArrayList;
import java.util.Collections;
import org.hibernate.*;
import Util.HibernateUtil;

public class PlayHand {

	public static void main(String[] args) {



		for (int gCount = 0; gCount <= 2000000; gCount++) {
			ArrayList<Hand> Hands = new ArrayList<Hand>();
			Deck d = new Deck();

			Hand h = new Hand(d);
			h.EvalHand();
			
			Collections.sort(Hands, Hand.HandRank);


			Session session = HibernateUtil.getSessionFactory().openSession();
			 
			session.beginTransaction();
			
			Pokerresults rresults = new Pokerresults();
			rresults.setHandstrength(h.getHandStrength());
			rresults.setHihand(h.getHighPairStrength());
			rresults.setLohand(h.getLowPairStrength());
			rresults.setKicker(h.getKicker());
			
			
			int resultid = (Integer) session.save(rresults);
			
			System.out.println(resultid);
			
			session.getTransaction().commit();

		}

	}

}
