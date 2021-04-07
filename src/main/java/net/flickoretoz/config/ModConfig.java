package net.flickoretoz.config;

import me.shedaniel.autoconfig.*;
import me.shedaniel.autoconfig.annotation.*;

@Config(name = "testmod")
public class ModConfig implements ConfigData {
    boolean toggleA = true;
    boolean toggleB = false;
    
    @ConfigEntry.Gui.CollapsibleObject
    InnerStuff stuff = new InnerStuff();
    
    @ConfigEntry.Gui.Excluded
    InnerStuff invisibleStuff = new InnerStuff();
    
    static class InnerStuff {
        int a = 0;
        int b = 1;
    }
}