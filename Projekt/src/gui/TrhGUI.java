package gui;
       
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import trh.Trh;

public class TrhGUI extends Application{				//Cela grafika
	private Button vytvorUcastnikov = new Button("Vytvor ucastnikov");
	private Button spustTrh = new Button("Spust trh");		//definovanie prvok, ktore
	private TextField kupujuci = new TextField();			//pouzijem v okne
	private TextField kupujuciEuropan = new TextField();
	private TextField kupujuciAmerican = new TextField();
	private Label kupujuciOzn = new Label("Kupujuci");
	private Label kupujuciEuropanOzn = new Label("Kupujuci Europan");
	private Label kupujuciAmericanOzn = new Label("Kupujuci American");
	private TextArea vypis = new TextArea();	
	
	private PeniazeUcastnikov peniazeUcastnikov; 	//definovanie sledovatela
	
	@Override
	public void start(Stage hlavneOkno) {					//vytvorenie hlavneho okna
		hlavneOkno.setTitle("Trh");							//Nastavenie nadpisu hlavneho okna
		
		FlowPane pane = new FlowPane();					//definovanie druhu panela v okne
		
		pane.getChildren().add(vytvorUcastnikov);
		pane.getChildren().add(spustTrh);				//Usadzanie prvkov na panel
		pane.getChildren().add(kupujuci);
		pane.getChildren().add(kupujuciOzn);
		pane.getChildren().add(kupujuciEuropan);
		pane.getChildren().add(kupujuciEuropanOzn);
		pane.getChildren().add(kupujuciAmerican);
		pane.getChildren().add(kupujuciAmericanOzn);
		pane.getChildren().add(vypis);
		
		Trh trh = new Trh();
		
		vytvorUcastnikov.setOnAction(e -> {
			trh.vytvorUcastnikov(Integer.parseInt(kupujuci.getText()), 
					 Integer.parseInt(kupujuciEuropan.getText()), 
					 Integer.parseInt(kupujuciAmerican.getText()));
			
			vypis.appendText("Ucastnici trhu vytvoreni");
		});
		
		spustTrh.setOnAction(e -> vypis.appendText(trh.trh()));			//prepojenie tlacidla s kodom, vytvaram objekt class-y, ktora ma v sebe funkciu, ktora vypisuje do TestArea - vypis
		
		peniazeUcastnikov = new PeniazeUcastnikov(trh);					//Vytvorenie noveho sledovatela
		trh.pridajSledovatela(peniazeUcastnikov);						//pridanie sledovatela do zoznamu sledovatelov v predmete, ktory sledujeme - aby vedel koho ma vsetkeho ma upovedomovat o zmenach
		pane.getChildren().add(peniazeUcastnikov);						//Zaradenie sledovatela na panel okna (GUI)
		
		hlavneOkno.setScene(new Scene(pane, 500, 300));
		hlavneOkno.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
