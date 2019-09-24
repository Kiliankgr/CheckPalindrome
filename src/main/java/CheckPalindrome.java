

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckPalindrome extends Application {
	private TextField SentenciaText;
	private Button comprobarButton;
	private Label resultadoLabel;
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		SentenciaText = new TextField();
		SentenciaText.setPromptText("Escribe una sentencia" );
		SentenciaText.setMaxWidth(150);
		
		resultadoLabel=new Label("Aquí se mostrará el resultado");
		comprobarButton =new Button("comprobar");
		comprobarButton.setDefaultButton(true);
		comprobarButton.setOnAction(e -> onSaludarButtonAction(e));
		
		VBox root =new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(SentenciaText,comprobarButton,resultadoLabel);
		
		Scene scene=new Scene(root,320,200);
		primaryStage.setTitle("Check palindromo");
		primaryStage.setScene(scene);
		primaryStage.show();
			
	}
	private void onSaludarButtonAction(ActionEvent e) {
		String sentencia= SentenciaText.getText(),resultado="";
		 int i= sentencia.length() -1;
		    String ayuda="";
		    while(i>=0){
		        ayuda += sentencia.charAt(i);
		        i--;
		    }
		        if(ayuda.equals(sentencia)) {
		        	resultado="es palindromo";
		        }else {
		        	resultado="no es palindromo";
		        }
		
		
		resultadoLabel.setText(resultado);
		resultadoLabel.setStyle("-fx-text-fill; green; -fx-font: italic bold 30 consolas;");
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
