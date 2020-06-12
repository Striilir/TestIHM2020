package fr.univ_amu.iut.ihm;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import java.lang.module.Configuration;
import java.util.concurrent.ScheduledExecutorService;

public class TraceurDeFonction extends Application {

  void calculCoeffTransformationsAffines() {
  }

  GridPane root = new GridPane();

  int transformationAffineY(double y) {
    return 0;
  }

  int transformationAffineX(double x) {
    return 0;
  }

  private void setIds() {
/*      pane.setId("resultatAnalyse");
      pane.setId("demandeAnalyser");
      pane.setId("demandeTracer");
      pane.setId("demandeEffacer");
      pane.setId("zoneTraceCourbe");
      pane.setId("choixXMin");
      pane.setId("choixXMax");
      pane.setId("choixEspacementX_v1");
      pane.setId("choixEspacementX_v2");
      pane.setId("choixEspacementY_v1");
      pane.setId("choixEspacementY_v2");
      pane.setId("choixCouleur");
      pane.setId("choixEpaisseur");
      pane.setId("segmentsATracer");
      pane.setId("quadrillage");
      pane.setId("axeX");
      pane.setId("axeY");*/
  }

  public void start(Stage stage) {
      stage.setTitle("Traceur de fonction");
      Pane root = new Pane();
      Scene scene = new Scene(root);
      stage.setWidth(600);
      stage.setHeight(650);
      stage.setResizable(false);
      TextField textField = new TextField("exp(-x * 0.2) * sin(x)");
      textField.setMinWidth(120);
      root.setPadding(new Insets(10));
      root.getChildren().add(textField);
      stage.setScene(scene);
      stage.show();
  }

}