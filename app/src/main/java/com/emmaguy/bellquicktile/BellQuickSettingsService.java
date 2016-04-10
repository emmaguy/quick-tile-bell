package com.emmaguy.bellquicktile;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.service.quicksettings.TileService;

public class BellQuickSettingsService extends TileService {
    @Override public void onClick() {
        super.onClick();

        final Drawable drawable = getQsTile().getIcon().loadDrawable(this);
        ((Animatable) drawable).start();
    }
}
