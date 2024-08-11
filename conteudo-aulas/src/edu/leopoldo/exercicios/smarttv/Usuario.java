package edu.leopoldo.exercicios.smarttv;

public class Usuario {
    
    public static void main(String[] args) {
        
        ExercicioSmartTv ExercicioSmartTv = new ExercicioSmartTv();

        ExercicioSmartTv.diminuirVolume();
        ExercicioSmartTv.diminuirVolume();
        ExercicioSmartTv.diminuirVolume();
        ExercicioSmartTv.aumentarVolume();

        System.out.println("Canal atual : " + ExercicioSmartTv.canal);

        ExercicioSmartTv.mudarCanal(13);

        System.out.println("Canal atual : " + ExercicioSmartTv.canal);
        
        System.out.println("Volume atual : " + ExercicioSmartTv.volume);



        System.out.println("TV Ligada ? " + ExercicioSmartTv.ligada);
        System.out.println("Canal atual : " + ExercicioSmartTv.canal);
        System.out.println("Volume atual : " + ExercicioSmartTv.volume);
        
        ExercicioSmartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada ? " + ExercicioSmartTv.ligada);

        ExercicioSmartTv.desligar ();
        System.out.println("Novo Status -> TV Ligada ? " + ExercicioSmartTv.ligada);
    }
}
