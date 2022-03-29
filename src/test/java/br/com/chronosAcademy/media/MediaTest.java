package br.com.chronosAcademy.media;

import org.junit.Test;

import static org.junit.Assert.*;

public class MediaTest {
    @Test
    public void validaAprovado(){
        Media media = new Media();
        String resultado = Media.calculaMedia(10.0,10.0);
        assertEquals("Aprovado",resultado);
    }
    @Test
    public void validaReprovado(){
        Media media = new Media();
        String resultado = Media.calculaMedia(9.9,10);
        assertEquals("Reprovado",resultado);
    }
}