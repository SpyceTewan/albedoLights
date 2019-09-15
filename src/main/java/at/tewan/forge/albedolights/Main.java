package at.tewan.forge.albedolights;

import com.hrznstudio.albedo.Albedo;
import com.hrznstudio.albedo.lighting.Light;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.common.Mod;

@Mod("albedolights")
public class Main {

    public Main() {
        Albedo.registerBlockHandler(Blocks.SEA_LANTERN, (blockPos, blockState, gatherLightsEvent) -> {
            Light.Builder builder = new Light.Builder();
            builder.color(0, 100, 100);
            builder.pos(blockPos);
            builder.radius(20);
            gatherLightsEvent.add(builder.build());

            System.out.println("Added sea lanterns");
        });
    }

}
