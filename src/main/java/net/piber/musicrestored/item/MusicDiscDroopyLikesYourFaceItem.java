package net.piber.musicrestored.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscDroopyLikesYourFaceItem extends RecordItem {
	public MusicDiscDroopyLikesYourFaceItem() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("c418musicrestored:music_disc_droopy_likes_your_face")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2310);
	}
}