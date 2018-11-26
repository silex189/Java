package amazonviewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

import amazonviewer.model.Book;
import amazonviewer.model.Chapter;
import amazonviewer.model.Magazine;
import amazonviewer.model.Movie;
import amazonviewer.model.Serie;
import makereport.Report;
import util.AmazonUtil;



/**
 * <h1>AmazonViewer</h1>
 * AmazonViewer is a program that allows you to watch movies, series with their respective chapters,
 * Books and magazines. It allows you to generate general reports and date of the day.
 * <p>
 * There are some rules like that all the elements can be visualized or read with the exception
 * of Magazines, you can only see them as an exposition without being read.
 * 
 * @author silex189
 * @version 1.2
 * @since 2018
 * 
 * */
public class Main {

	public static void main(String[] args) {
		showMenu();

	}
	
	public static void showMenu() {
		int exit = 0;
		do {
			
			System.out.println("Welcome to AMAZON VIEWER");
			System.out.println("");
			System.out.println("Select number of desired option");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
			
			//Reading user response
			int response = AmazonUtil.validateUserResponseMenu(0, 6);

			switch (response) {
				case 0:
					exit = 0;
					break;
				case 1:
					showMovies();
					break;
				case 2:
					showSeries();
					break;
				case 3:
					showBooks();
					break;
				case 4:
					showMagazines();
					break;
				case 5:
					makeReport();
					exit = 1;
					break;
				case 6:
					//Date date = new Date();
					makeReport(new Date());
					exit = 1;
					break;
	
				default:
					System.out.println();
					System.out.println("....¡¡Selecciona una opción!!....");
					System.out.println();
					exit = 1;
					break;
			}
			
			
		}while(exit != 0);
	}
	
	static ArrayList<Movie> movies = new ArrayList();
	public static void showMovies() {
		movies = Movie.makeMoviesList();
		int exit = 1;
		
		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
			
			AtomicInteger atomicInteger = new AtomicInteger(1);
			movies.forEach(m -> System.out.println(atomicInteger.getAndIncrement() + ". " + m.getTitle() + " Watched: " + m.isViewed()));
			
			/*for (int i = 0; i < movies.size(); i++) { //1. Movie 1
				System.out.println(i+1 + ". " + movies.get(i).getTitle() + " Visto: " + movies.get(i).isViewed());
			}*/
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			// Reading user respond
			int response = AmazonUtil.validateUserResponseMenu(0, movies.size());
			
			if(response == 0) {
				exit = 0;
				showMenu();
				break;
			}
			if (response > 0) {
				Movie movieSelected = movies.get(response-1);
				movieSelected.view();
			}
			
			
		}while(exit !=0);
		
	}
	static ArrayList<Serie> series = Serie.makeSeriesList();
	public static void showSeries() {
		int exit = 1;
		
		do {
			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();
			
			AtomicInteger atomicInteger = new AtomicInteger(1);
			series.forEach(s -> System.out.println(atomicInteger.getAndIncrement() + ". " + s.getTitle() + " Visto: " + s.isViewed()));
			
			/*for (int i = 0; i < series.size(); i++) { //1. Serie 1
				System.out.println(i+1 + ". " + series.get(i).getTitle() + " Visto: " + series.get(i).isViewed());
			}*/
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			// Reading user respond
			int response = AmazonUtil.validateUserResponseMenu(0, series.size());
			
			if(response == 0) {
				exit = 0;
				showMenu();
			}
			
			if(response > 0) {
				showChapters(series.get(response-1).getChapters());
			}
			
			
		}while(exit !=0);
	}
	
	public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) {
		int exit = 1;
		
		do {
			System.out.println();
			System.out.println(":: CHAPTERS ::");
			System.out.println();
			
			AtomicInteger atomicInteger = new AtomicInteger(1);
			chaptersOfSerieSelected.forEach(c -> System.out.println(atomicInteger.getAndIncrement() + ". " + c.getTitle() + " Visto: " + c.isViewed()));
			
			/*for (int i = 0; i < chaptersOfSerieSelected.size(); i++) { //1. Chapter 1
				System.out.println(i+1 + ". " + chaptersOfSerieSelected.get(i).getTitle() + " Visto: " + chaptersOfSerieSelected.get(i).isViewed());
			}*/
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			// Reading user respond
			int response = AmazonUtil.validateUserResponseMenu(0, chaptersOfSerieSelected.size());
			
			if(response == 0) {
				exit = 0;
			}
			
			
			if(response > 0) {
				Chapter chapterSelected = chaptersOfSerieSelected.get(response-1);
				chapterSelected.view();
			}
		}while(exit !=0);
	}
	
	static ArrayList<Book> books= Book.makeBookList();
	public static void showBooks() {
		int exit = 1;
		
		do {
			System.out.println();
			System.out.println(":: BOOKS ::");
			System.out.println();
			
			AtomicInteger atomicInteger = new AtomicInteger(1);
			books.forEach(b -> System.out.println(atomicInteger.getAndIncrement() + ". " + b.getTitle() + " Visto: " + b.isReaded()));
			
			/*for (int i = 0; i < books.size(); i++) { //1. Book 1
				System.out.println(i+1 + ". " + books.get(i).getTitle() + " Leído: " + books.get(i).isReaded());
			}*/
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			int response = AmazonUtil.validateUserResponseMenu(0, books.size());
			
			if(response == 0) {
				exit = 0;
				showMenu();
			}
			
			if(response > 0) {
				Book bookSelected = books.get(response-1);
				bookSelected.view();
			}
			
		}while(exit !=0);
	}
	
	public static void showMagazines() {
		 ArrayList<Magazine> magazines = Magazine.makeMagazineList();
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: MAGAZINES ::");
			System.out.println();
			AtomicInteger atomicInteger = new AtomicInteger(1);
			magazines.forEach(mg -> System.out.println(atomicInteger.getAndIncrement() + ". " + mg.getTitle()));
			
			/*for (int i = 0; i < magazines.size(); i++) { //1. Book 1
				System.out.println(i+1 + ". " + magazines.get(i).getTitle());
			}*/
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			int response = AmazonUtil.validateUserResponseMenu(0, 0);
			
			if(response == 0) {
				exit = 0;
				showMenu();
			}
			
			
		}while(exit !=0);
	}
	
	public static void makeReport() {
		
		Report report = new Report();
		report.setNameFile("reporte");
		report.setExtension("txt");
		report.setTitle(":: VISTOS ::");
		StringBuilder contentReport = new StringBuilder();
		
		movies.stream().filter(m -> m.getIsViewed()).forEach(m -> contentReport.append(m.toString() + "\n"));
		
		Consumer<Serie> seriesEach =s -> {
			ArrayList<Chapter> chapters = s.getChapters();
			chapters.stream().filter(c->c.getIsViewed()).forEach(c-> contentReport.append(c.toString() + "\n"));
		};
		series.stream().forEach(seriesEach);
		
		books.stream().filter(b -> b.getIsReaded()).forEach(b -> contentReport.append(b.toString() + "\n"));
		

		report.setContent(contentReport.toString());
		report.makeReport();
		System.out.println("Report done");
		System.out.println();
	}
	
	public static void makeReport(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-h-m-s-S");
		String dateString = df.format(date);
		Report report = new Report();
		
		report.setNameFile("reporte" + dateString);
		report.setExtension("txt");
		report.setTitle(":: VISTOS ::");
		
		
		SimpleDateFormat dfNameDays = new SimpleDateFormat("E, W MMM Y");
		dateString = dfNameDays.format(date);
		StringBuilder contentReport = new StringBuilder();
		contentReport.append("Date: " + dateString + "\n\n\n");
		
		movies.stream().filter(m -> m.getIsViewed()).forEach(m -> contentReport.append(m.toString() + "\n"));
		Consumer<Serie> seriesEach =s -> {
			ArrayList<Chapter> chapters = s.getChapters();
			chapters.stream().filter(c->c.getIsViewed()).forEach(c-> contentReport.append(c.toString() + "\n"));
		};
		series.stream().forEach(seriesEach);
		books.stream().filter(b -> b.getIsReaded()).forEach(b -> contentReport.append(b.toString() + "\n"));
		
		report.setContent(contentReport.toString());
		report.makeReport();
		
		System.out.println("Reporte Generado");
		System.out.println();
	}
	
}















