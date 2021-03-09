package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;
	List<String> parole;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextArea txtTempo;
    
    @FXML
    private Button btnCancella;

    @FXML
    private Button btnReset;
    
    @FXML
    void doCancella(ActionEvent event) {
    	double start = System.nanoTime();
    	String p = txtResult.getSelectedText();
    	elenco.cancella(p);
    	String risultato = "";
    	for (String pa : elenco.getElenco()) {
    		risultato = risultato + pa +"\n";
    	}
    	txtResult.setText(risultato);
    	double end = System.nanoTime() - start;
    	txtTempo.appendText("Il tempo di doCancella è: " + end + "\n");
    }


    @FXML
    void doInsert(ActionEvent event) {
    	double start = System.nanoTime();
    	String parola = txtParola.getText();
    	elenco.addParola(parola);
    	
    	txtParola.setText("");
    	String risultato = "";
    	for (String p : elenco.getElenco()) {
    		risultato = risultato + p +"\n";
    	}
    	txtResult.setText(risultato);
    	double end = System.nanoTime() - start;
    	txtTempo.appendText("Il tempo di doInsert è: " + end + "\n");
    	
    }

    @FXML
    void doReset(ActionEvent event) {
    	double start = System.nanoTime();
    	elenco.reset();
    	txtResult.setText("");
    	double end = System.nanoTime() - start;
    	txtTempo.appendText("Il tempo di doReset è: " + end + "\n");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTempo != null : "fx:id=\"txtTempo\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
