package frj.content;

import arc.Core;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.content.StatusEffects;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.MissileBulletType;
import mindustry.entities.pattern.ShootAlternate;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.defense.turrets.TractorBeamTurret;
import mindustry.world.meta.Env;

import static mindustry.type.ItemStack.with;

public class FRJBlocks {
  public static Block trio;
  
  public static void load() {
         trio = new ItemTurret("trio"){{
           requirements(Category.turret, with(Items.copper, 70, Items.lead, 35));
           ammo(
                Items.coal, new BasicBulletType(3f, 12f) {{
                            width = 8f;
                            height =  8f;
                            hitSize = 8f;
                            lifetime = 50f;
                            length = 8f;
                            ammoMultiplier = 3f;
            }}
          );
        size = 2;
        reload = 12f;
        range = 120f;
        health = 300;
        shoot = new ShootAlternate(3f);
           
        limitRange();
        }};
    }
}
