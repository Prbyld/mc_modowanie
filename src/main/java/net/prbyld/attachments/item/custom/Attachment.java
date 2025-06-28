package net.prbyld.attachments.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;


public class Attachment extends Item {
    private final int lineCount;


    public Attachment(Properties properties) {
        this(properties, 1);
    }

    public Attachment(Properties properties, int lineCount){
        super(properties);
        this.lineCount = lineCount;
    }


    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        if(lineCount == 1){
            pTooltipComponents.add(Component.translatable("tooltip."+this));
        }else {
            for(int i = 1; i<=lineCount; i++){
                pTooltipComponents.add(Component.translatable("tooltip."+this+i));
            }
        }


        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }
}
