package thebetweenlands.world.biomes.base;

import thebetweenlands.utils.confighandler.ConfigHandler;
import thebetweenlands.world.biomes.BiomeCoarseIslands;
import thebetweenlands.world.biomes.BiomeDeepWater;
import thebetweenlands.world.biomes.BiomePatchyIslands;
import thebetweenlands.world.biomes.BiomeSwampLands;
import thebetweenlands.world.genlayer.GenLayerBetweenlandsBiome;

public class BLBiomeRegistry
{
	public static void init() {
		addBiome(new BiomeSwampLands(ConfigHandler.BIOME_ID_SWAMPLANDS));
		addBiome(new BiomeCoarseIslands(ConfigHandler.BIOME_ID_COARSE_ISLANDS));
		addBiome(new BiomeDeepWater(ConfigHandler.BIOME_ID_DEEP_WATER));
		addBiome(new BiomePatchyIslands(ConfigHandler.BIOME_ID_PATCHY_ISLANDS));
	}

	private static void addBiome(BiomeGenBaseBetweenlands biome) {
		biome.createMutation();
		GenLayerBetweenlandsBiome.biomesToGenerate.add(biome);
	}
}