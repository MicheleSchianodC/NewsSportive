package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Articoli;


@WebServlet("/blog")
public class Blog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Blog() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Articoli art1 = new Articoli("Calendario Serie A calcio oggi in tv: orari partite 4 marzo, chi gioca, programma, streaming DAZN e Sky", "Dopo l'interessante anticipo di ieri sera tra Lazio e Napoli, oggi la 25a giornata della Serie A 2022-2023 ci proporrà altri tre incontri.", "https://www.gelestatic.it/thimg/up3njzhNOTd9BxupkKTj84BtsTs=/fit-in/735x416/https://www.repstatic.it/content/nazionale/img/2023/02/27/093128570-70aa4058-cb81-47c5-a370-776772fb1d8a.jpg");
		Articoli art2 = new Articoli("Kvaratskhelia senza eguali in Serie A: ci sono due statistiche che premiano il georgiano","L'attaccante del Napoli Khvicha Kvaratskhelia è uno dei migliori esterni della Serie A per gol e assist, e viene elogiato dall'edizione...","https://www.spazionapoli.it/wp-content/uploads/2023/02/Kvaratskhelia-Sassuolo-Napoli.jpg-1200x799.jpg");
		Articoli art3 = new Articoli("Atalanta-Udinese: probabili formazioni, statistiche e dove vederla in TV e in streaming","Serie A - L'Atalanta ha sempre trovato il gol nelle ultime 15 sfide di Serie A contro l'Udinese, segnando una media di 2.3 reti a incontro...","https://img-prod.sportmediaset.mediaset.it/images/2023/03/04/183242531-9c96081c-53fc-4ade-9ce8-ce02fec32fcd.jpg");
		Articoli art4 = new Articoli("Formula 1 oggi, orari TV GP Bahrain su TV8 e Sky: dove vederlo in diretta e streaming, Verstappen in pole","Al via oggi la Formula 1 con la gara del GP Bahrain, primo appuntamento del Mondiale F1 2023. Orario della partenza alle 16, diretta TV e...","https://www.oasport.it/wp-content/uploads/2023/03/20715296_small-e1677943230447.jpg.webp");
		Articoli art5 = new Articoli("F1 | Aston Martin, Lance Stroll: Sono soddisfatto dell’ottava posizione","Lance Stroll termina la prima qualifica stagionale in ottava posizione, un risultato più che soddisfacente, considerando le condizioni del...","https://dimages2.gazzettaobjects.it/files/image_458_275/uploads/2023/03/02/64006b96d70bd.jpeg");
		Articoli art6 = new Articoli("Nba: Philadelphia 'stoppa' Milwaukee, ko dopo 16 vittorie di fila","MILWAUKEE (USA) - Si ferma la corsa di Milwaukee, che dopo 16 vittorie consecutive in Nba viene 'stoppata' sul parquet di casa dai...","https://cdn.vox-cdn.com/thumbor/0nlKSqfeNj5hwUh2kbT5HW2wxew=/0x0:4360x3029/1200x800/filters:focal(1851x653:2547x1349)/cdn.vox-cdn.com/uploads/chorus_image/image/71524238/usa_today_19266787.0.jpg");
		
		
		ArrayList<Articoli> listaArticoli = new ArrayList<>();
		
		listaArticoli.add(art1);
		listaArticoli.add(art2);
		listaArticoli.add(art3);
		listaArticoli.add(art4);
		listaArticoli.add(art5);
		listaArticoli.add(art6);
		
		
		request.setAttribute("ArrayLista", listaArticoli);
		
		request.getServletContext().getRequestDispatcher("/jsp/ciclareArticoli.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
