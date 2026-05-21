/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.piber.musicrestored.init;

import net.piber.musicrestored.item.*;
import net.piber.musicrestored.C418musicrestoredMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

public class C418musicrestoredModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(C418musicrestoredMod.MODID);
	public static final DeferredItem<Item> MUSIC_DISC_DEATH;
	public static final DeferredItem<Item> MUSIC_DISC_CHRIS;
	public static final DeferredItem<Item> MUSIC_DISC_DOG;
	public static final DeferredItem<Item> MUSIC_DISC_DROOPY_LIKES_RICOCHET;
	public static final DeferredItem<Item> MUSIC_DISC_DROOPY_LIKES_YOUR_FACE;
	public static final DeferredItem<Item> MUSIC_DISC_ELEVEN;
	public static final DeferredItem<Item> MUSIC_DISC_INTRO;
	static {
		MUSIC_DISC_DEATH = REGISTRY.register("music_disc_death", MusicDiscDeathItem::new);
		MUSIC_DISC_CHRIS = REGISTRY.register("music_disc_chris", MusicDiscChrisItem::new);
		MUSIC_DISC_DOG = REGISTRY.register("music_disc_dog", MusicDiscDogItem::new);
		MUSIC_DISC_DROOPY_LIKES_RICOCHET = REGISTRY.register("music_disc_droopy_likes_ricochet", MusicDiscDroopyLikesRicochetItem::new);
		MUSIC_DISC_DROOPY_LIKES_YOUR_FACE = REGISTRY.register("music_disc_droopy_likes_your_face", MusicDiscDroopyLikesYourFaceItem::new);
		MUSIC_DISC_ELEVEN = REGISTRY.register("music_disc_eleven", MusicDiscElevenItem::new);
		MUSIC_DISC_INTRO = REGISTRY.register("music_disc_intro", MusicDiscIntroItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}