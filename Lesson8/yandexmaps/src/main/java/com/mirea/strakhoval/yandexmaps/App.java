package com.mirea.strakhoval.yandexmaps;

import com.yandex.mapkit.MapKitFactory;

import android.app.Application;

public class App extends Application {
    private final String MAPKIT_API_KEY = "e29fde0d-92b7-4014-b7be-167d653f5adc";
    @Override
    public void onCreate() {
        super.onCreate();
        // Set the api key before calling initialize on MapKitFactory.
        MapKitFactory.setApiKey(MAPKIT_API_KEY);
    }
}
