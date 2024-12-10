package com.sd.app;

public class Main {

    
    public static void main(String[] args)
    {
        try
        {
            // Conecta ao serviço de áudio via RMI
            AudioStreamClient audioStreamClient = new AudioStreamClient();
            audioStreamClient.init();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
