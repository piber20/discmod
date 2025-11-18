package net.piber.musicrestored.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscElevenItem extends RecordItem {
	public MusicDiscElevenItem() {
		super(11, () -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("c418musicrestored:music_disc_eleven")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1400);
	}
}