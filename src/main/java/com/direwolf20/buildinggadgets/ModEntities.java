package com.direwolf20.buildinggadgets;

import com.direwolf20.buildinggadgets.entities.BlockBuildEntity;
import com.direwolf20.buildinggadgets.entities.BlockBuildEntityRender;
import com.direwolf20.buildinggadgets.entities.ConstructionBlockEntity;
import com.direwolf20.buildinggadgets.entities.ConstructionBlockEntityRender;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
    public static void init() {
        int id = 1;
        EntityRegistry.registerModEntity(new ResourceLocation("buildinggadgets:BlockBuildEntity"), BlockBuildEntity.class, "LaserGunEntity", id++, BuildingGadgets.instance, 64, 1, true);
        EntityRegistry.registerModEntity(new ResourceLocation("buildinggadgets:ConstructionBlockEntity"), ConstructionBlockEntity.class, "ConstructionBlockEntity", id++, BuildingGadgets.instance, 64, 1, true);

    }

    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(BlockBuildEntity.class, new BlockBuildEntityRender.Factory());
        RenderingRegistry.registerEntityRenderingHandler(ConstructionBlockEntity.class, new ConstructionBlockEntityRender.Factory());
    }
}
