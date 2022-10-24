package frj;

import arc.*;
import arc.util.*;
import arc.struct.*;
import mindustry.*;
import mindustry.mod.*;
import mindustry.type.*;
import mindustry.content.*;
import mindustry.type.Weather.*;
import mindustry.game.EventType.*;
import flow.content.*;
import java.lang.*;

public class FRJ extends Mod{

    public FRJ(){}
    
    @Override
    public void loadContent(){
        Runnable[] load = {
            FRJBlocks::load,
            FRJTechTree::load,
        };
        
        for (Runnable r : load) r.run();
    }
}
