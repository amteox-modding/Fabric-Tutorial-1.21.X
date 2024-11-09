package net.amteox.tutorialmod.item;

import net.amteox.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item END_DUST = registerItem("end_dust", new Item(new Item.Settings()));
    public static final Item ENDERIUM_INGOT = registerItem("enderium_ingot", new Item(new Item.Settings()));
    public static final Item ENDERIUM_SHARD = registerItem("enderium_shard", new Item(new Item.Settings()));


    public static final Item ENDERIUM_SWORD = registerItem("enderium_sword",
            new SwordItem(ModToolMaterials.ENDERIUM, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ENDERIUM, 5, -1.9f))));
    public static final Item ENDERIUM_PICKAXE = registerItem("enderium_pickaxe",
            new PickaxeItem(ModToolMaterials.ENDERIUM, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ENDERIUM, 1, -2.8f))));
    public static final Item ENDERIUM_AXE = registerItem("enderium_axe",
            new AxeItem(ModToolMaterials.ENDERIUM, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ENDERIUM, 4, -2.4f))));
    public static final Item ENDERIUM_SHOVEL = registerItem("enderium_shovel",
            new ShovelItem(ModToolMaterials.ENDERIUM, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ENDERIUM, 1, -2.8f))));
    public static final Item ENDERIUM_HOE = registerItem("enderium_hoe",
            new HoeItem(ModToolMaterials.ENDERIUM, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ENDERIUM, 1, -2.8f))));





    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),item);
    }



    public static void registerModItems()
    {
        TutorialMod.LOGGER.info("Registering mod Items for " + TutorialMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(END_DUST);
        });
    }

}
