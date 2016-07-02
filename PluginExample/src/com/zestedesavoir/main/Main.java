package com.zestedesavoir.main;


import com.zestedesavoir.zestwriter.MainApp;
import com.zestedesavoir.zestwriter.plugins.ZwPlugin;
import com.zestedesavoir.zestwriter.plugins.ZwPluginVersion;

import java.util.ArrayList;

/**
 * @author Kevin Vuilleumier (WinXaito)
 * @since 02.07.2016
 * @version 0.0.0
 */
public class Main implements ZwPlugin{
    @Override
    public void onEnable(MainApp mainApp){
        //Démarrage du plugin
        //Enabling plugin
    }

    @Override
    public void onDisable(){
        //Arrêt du plugin
        //Disabling plugin
    }

    @Override
    public ZwPluginVersion getVersion(){
        //Retourne la version du plugin
        //Return the version of this plugin

        return new ZwPluginVersion(0,0,0);
    }

    @Override
    public ArrayList<Class> getListener(){
        //Retourne la liste des classes à écouté
        //Return the list of listen class

        ArrayList<Class> listener = new ArrayList<>();
        listener.add(Main.class);
        listener.add(PlWindowEvents.class);

        return listener;
    }
}
