/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.piber.musicrestored.init;

import net.piber.musicrestored.C418musicrestoredMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
public class C418musicrestoredModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, C418musicrestoredMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(C418musicrestoredModItems.MUSIC_DISC_CHRIS.get());
			tabData.accept(C418musicrestoredModItems.MUSIC_DISC_DOG.get());
			tabData.accept(C418musicrestoredModItems.MUSIC_DISC_DROOPY_LIKES_RICOCHET.get());
			tabData.accept(C418musicrestoredModItems.MUSIC_DISC_DROOPY_LIKES_YOUR_FACE.get());
			tabData.accept(C418musicrestoredModItems.MUSIC_DISC_DEATH.get());
			tabData.accept(C418musicrestoredModItems.MUSIC_DISC_ELEVEN.get());
			tabData.accept(C418musicrestoredModItems.MUSIC_DISC_INTRO.get());
		}
	}
}