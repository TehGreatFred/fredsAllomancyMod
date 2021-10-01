package net.allomancybyfred.fredsallomancy.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class AllomanticDust extends Item {
    private String allomaticMetalType; //type of allomatic metal, empty is nothing
    public AllomanticDust(Settings settings){
        super(settings);
    }
    public String getType(){
        return allomaticMetalType;
    }
    public void setType(String type){
        allomaticMetalType = type;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        switch (allomaticMetalType){
            case "":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_none"));
            case "steel":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_steel"));
            case "iron":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_iron"));
            case "pewter":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_pewter"));
            case "tin":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_tin"));
            case "zinc":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_zinc"));
            case "brass":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_brass"));
            case "copper":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_copper"));
            case "bronze":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_bronze"));
            case "duralium":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_duralium"));
            case "aluminium":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_aluminium"));
            case "nicrosil":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_nicrosil"));
            case "chromium":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_chromium"));
            case "gold":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_gold"));
            case "electrum":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_electrum"));
            case "cadmium":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_cadmium"));
            case "bendalloy":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_bendalloy"));
            case "atium":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_atium"));
            case "lerasium":
                tooltip.add(new TranslatableText("fredsallomancy.allomantic_dust_lerasium"));
        }


        super.appendTooltip(stack, world, tooltip, context);
    }
}
