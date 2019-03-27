/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.oops;

/**
 *
 * @author sumit
 */
public class SonyAudioPlayer extends DigitalAudioPlayer implements Recordable{

    @Override
    public void play() {
        System.out.println("Audio Played"+currentTrack);
    }

    @Override
    public void pause() {
        System.out.println("Paused Track"+currentTrack);
    }

    @Override
    public void stop() {
        System.out.println("Audio Stopped");
    }

    @Override
    public void record() {
        System.out.println("Audio recoreded");
    }
    
    public static void main(String[] args) {
        SonyAudioPlayer player= new SonyAudioPlayer();
        player.powerOn();
        player.play();
        player.pause();
        player.forward();
        player.play();
        player.pause();
        player.rewind();
        player.play();
        player.stop();
        player.record();
        player.powerOff();
        
        //changes to recorder only mode
        Recordable  recorder =player;
        recorder.record();
        //recorder.play()
        
    }
}
