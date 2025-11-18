package net.piber.musicrestored.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscChrisItem extends RecordItem {
	public MusicDiscChrisItem() {
		super(3, () -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("c418musicrestored:music_disc_chris")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1740);
	}
}