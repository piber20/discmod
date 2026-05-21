/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.piber.musicrestored.init;

import net.piber.musicrestored.C418musicrestoredMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class C418musicrestoredModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, C418musicrestoredMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_DISC_DEATH = REGISTRY.register("music_disc_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("c418musicrestored", "music_disc_death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_DISC_CHRIS = REGISTRY.register("music_disc_chris", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("c418musicrestored", "music_disc_chris")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_DISC_DOG = REGISTRY.register("music_disc_dog", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("c418musicrestored", "music_disc_dog")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_DISC_DROOPY_LIKES_RICOCHET = REGISTRY.register("music_disc_droopy_likes_ricochet",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("c418musicrestored", "music_disc_droopy_likes_ricochet")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_DISC_DROOPY_LIKES_YOUR_FACE = REGISTRY.register("music_disc_droopy_likes_your_face",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("c418musicrestored", "music_disc_droopy_likes_your_face")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_DISC_ELEVEN = REGISTRY.register("music_disc_eleven", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("c418musicrestored", "music_disc_eleven")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_DISC_INTRO = REGISTRY.register("music_disc_intro", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("c418musicrestored", "music_disc_intro")));
}