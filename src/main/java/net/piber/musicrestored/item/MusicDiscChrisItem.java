package net.piber.musicrestored.item;

import net.piber.musicrestored.C418musicrestoredMod;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class MusicDiscChrisItem extends Item {
	public MusicDiscChrisItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(C418musicrestoredMod.MODID, "music_disc_chris"))));
	}
}