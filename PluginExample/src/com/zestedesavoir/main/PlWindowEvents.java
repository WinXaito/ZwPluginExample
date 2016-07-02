package com.zestedesavoir.main;

import com.zestedesavoir.zestwriter.plugins.events.WindowEvents;

/**
 * @author Kevin Vuilleumier (WinXaito)
 * @since 02.07.2016
 * @version 0.0.0
 */
public class PlWindowEvents implements WindowEvents{
    public void onWindowWidthResizeEvent(int oldValue, int newValue){
        //La largeur de la fenêtre principal à été modifié (oldValue = Ancienne valeur / newValue = Nouvelle valeur)
        //Width of main window has been changed
    }
}
