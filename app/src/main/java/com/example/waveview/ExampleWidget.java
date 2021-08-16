package com.example.waveview;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class ExampleWidget extends AppWidgetProvider {
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for (int id : appWidgetIds){
            Intent i=new Intent(context,MainActivity.class);
            PendingIntent pendingIntent=PendingIntent.getActivity(context,0,i,0);
            RemoteViews views=new RemoteViews(context.getPackageName(),R.layout.exampe_widget);
            views.setOnClickPendingIntent(R.id.button,pendingIntent);
            appWidgetManager.updateAppWidget(id,views);
        }
    }
}
