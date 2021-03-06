package thebetweenlands.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import thebetweenlands.TheBetweenlands;
import thebetweenlands.entities.mobs.EntityAngler;
import thebetweenlands.entities.mobs.EntityBloodSnail;
import thebetweenlands.entities.mobs.EntityDarkDruid;
import thebetweenlands.entities.mobs.EntityDragonFly;
import thebetweenlands.entities.mobs.EntityFirefly;
import thebetweenlands.entities.mobs.EntityLeech;
import thebetweenlands.entities.mobs.EntityMireSnail;
import thebetweenlands.entities.mobs.EntityMireSnailEgg;
import thebetweenlands.entities.mobs.EntitySludge;
import thebetweenlands.entities.mobs.EntitySporeling;
import thebetweenlands.entities.mobs.EntitySwampHag;
import thebetweenlands.entities.mobs.EntityTarBeast;
import thebetweenlands.entities.mobs.EntityWight;
import thebetweenlands.items.SpawnEggs;
import cpw.mods.fml.common.registry.EntityRegistry;

public class BLEntityRegistry
{
	public static void init() {
		// Entity registrations can be with or without spawn egg for non mob entites eg. projectiles etc.
		registerEntity(0, EntityDarkDruid.class, "darkDruid", 0x000000, 0xFF0000);
		registerEntity(1, EntityAngler.class, "angler", 0x243B0B, 0x00FFFF);
		registerEntity(2, EntitySludge.class, "sludge", 0x3A2F0B, 0x5F4C0B);
		registerEntity(3, EntitySwampHag.class, "swampHag", 0x0B3B0B, 0xDBA901);
		registerEntity(4, EntityTarBeast.class, "tarBeast", 0x000000, 0x2E2E2E);
		registerEntity(5, EntityWight.class, "wight", 0xECF8E0, 0x243B0B);
		registerEntity(6, EntityFirefly.class, "firefly", 0x243B0B, 0x808000);
		registerEntity(7, EntitySporeling.class, "sporeling", 0xFFFFFF, 0xFF0000);
		registerEntity(8, EntityLeech.class, "leech", 0x804E3D, 0x3D6F80);
		registerEntity(9, EntityDragonFly.class, "dragonfly", 0x804E3D, 0x3D6F80);
		registerEntity(10, EntityBloodSnail.class, "bloodSnail", 0x804E3D, 0x3D6F80);
		registerEntity(11, EntityMireSnail.class, "mireSnail", 0x804E3D, 0x3D6F80);
		registerEntity(12, EntityMireSnailEgg.class, "mireSnailEgg");
		registerEntity(13, EntityAngryPebble.class, "angryPebble");
	}

	private static final void registerEntity(int id, Class<? extends Entity> entityClass, String name) {
		EntityRegistry.registerModEntity(entityClass, name, id, TheBetweenlands.instance, 256, 1, true);
	}

	private static final void registerEntity(int id, Class<? extends EntityLiving> entityClass, String name, int eggBackgroundColor, int eggForegroundColor) {
		registerEntity(id, entityClass, name);
		SpawnEggs.registerSpawnEgg(entityClass, name, id, eggBackgroundColor, eggForegroundColor);
	}
}
