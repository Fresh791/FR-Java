package frj;

import arc.*;
import arc.util.*;
import frj.content.FRJBlocks;
import frj.content.FRJTechTree;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class FRJ extends Mod{

    public FRJ(){}

    @Override
    public void loadContent(){
        FRJBlocks.load();
        FRJTechTree.load();
    }

}
