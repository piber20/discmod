/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.piber.musicrestored.init;

import net.piber.musicrestored.item.MusicDiscIntroItem;
import net.piber.musicrestored.item.MusicDiscElevenItem;
import net.piber.musicrestored.item.MusicDiscDroopyLikesYourFaceItem;
import net.piber.musicrestored.item.MusicDiscDroopyLikesRicochetItem;
import net.piber.musicrestored.item.MusicDiscDogItem;
import net.piber.musicrestored.item.MusicDiscDeathItem;
import net.piber.musicrestored.item.MusicDiscChrisItem;
import net.piber.musicrestored.C418musicrestoredMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class C418musicrestoredModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, C418musicrestoredMod.MODID);
	public static final RegistryObject<Item> MUSIC_DISC_DEATH = REGISTRY.register("music_disc_death", () -> new MusicDiscDeathItem());
	public static final RegistryObject<Item> MUSIC_DISC_CHRIS = REGISTRY.register("music_disc_chris", () -> new MusicDiscChrisItem());
	public static final RegistryObject<Item> MUSIC_DISC_DOG = REGISTRY.register("music_disc_dog", () -> new MusicDiscDogItem());
	public static final RegistryObject<Item> MUSIC_DISC_DROOPY_LIKES_RICOCHET = REGISTRY.register("music_disc_droopy_likes_ricochet", () -> new MusicDiscDroopyLikesRicochetItem());
	public static final RegistryObject<Item> MUSIC_DISC_DROOPY_LIKES_YOUR_FACE = REGISTRY.register("music_disc_droopy_likes_your_face", () -> new MusicDiscDroopyLikesYourFaceItem());
	public static final RegistryObject<Item> MUSIC_DISC_ELEVEN = REGISTRY.register("music_disc_eleven", () -> new MusicDiscElevenItem());
	public static final RegistryObject<Item> MUSIC_DISC_INTRO = REGISTRY.register("music_disc_intro", () -> new MusicDiscIntroItem());
	// Start of user code block custom items
	// End of user code block custom items
}