package com.netheriteqf.your_ideas.common.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Rarity;

public class EnchantedGoldenCarrotItem extends Item {

    public EnchantedGoldenCarrotItem() {
        super(new Settings().group(ItemGroup.FOOD).rarity(Rarity.EPIC).food(
                new FoodComponent.Builder().hunger(3).saturationModifier(1.1F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 360, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 5900, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 5800, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2200, 3), 1.0F).alwaysEdible().build()));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
