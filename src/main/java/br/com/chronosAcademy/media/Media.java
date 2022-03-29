package br.com.chronosAcademy.media;

public class Media {
    public static String calculaMedia(double v, double v1) {
        double media = (v + v1) / 2;
        if (media < 10.0) {
            return "Reprovado";
        }
        return "Aprovado";
    }
}