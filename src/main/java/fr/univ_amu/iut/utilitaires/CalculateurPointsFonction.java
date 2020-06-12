package fr.univ_amu.iut.utilitaires;

import java.io.IOException;
import java.util.ArrayList;

public class CalculateurPointsFonction {

  private static final int nombrePas = 1000;

  private ArrayList<Basic2DPoint> listePoints;
  private double yMin, yMax;

  public CalculateurPointsFonction(Expression f, double xMin, double xMax) {

    listePoints = new ArrayList<>();

    double dx = (xMax - xMin) / nombrePas;
    yMin = f.valeur(xMin);
    yMax = yMin;

    for (double x = xMin; x <= xMax; x += dx) {
      double y = f.valeur(x);
      listePoints.add(new Basic2DPoint(x, y));
      yMin = Math.min(y, yMin);
      yMax = Math.max(y, yMax);
    }
  }

  public double getYMax() {
    return yMax;
  }

  public double getYMin() {
    return yMin;
  }

  public ArrayList<Basic2DPoint> getListePoints() {
    return listePoints;
  }

  public static void main(String[] args) throws IOException, ErreurDeSyntaxe {
    Analyseur analyseur = new Analyseur("exp(-x * 0.2) * sin(x)");
    Expression fonction = analyseur.analyser();
    System.out.println("f(x) = " + fonction);
    CalculateurPointsFonction pointsList = new CalculateurPointsFonction(fonction, -0.5, 20);
    for(int k = 0; k < pointsList.getListePoints().size();++k) {
      System.out.println("f(" + pointsList.getListePoints().get(k).getX() + ") = " + pointsList.getListePoints().get(k).getX());
    }
    System.out.println("Maximum = " + pointsList.getYMax());
    System.out.println("Minimum = " + pointsList.getYMin());
  }
}