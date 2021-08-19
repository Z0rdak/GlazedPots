package de.z0rdak.glazedpots.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.WanderingTraderEntity;
import net.minecraft.item.MerchantOffer;
import net.minecraft.item.MerchantOffers;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(WanderingTraderEntity.class)
public abstract class MixinWanderingTraderEntity extends AbstractVillagerEntity {

    public MixinWanderingTraderEntity(EntityType<? extends AbstractVillagerEntity> p_i50185_1_, World p_i50185_2_) {
        super(p_i50185_1_, p_i50185_2_);
    }

    /**
     * @author Z0rdak
     * Add third type of trade to the wandering trader offers
     * 1. 5 generic
     * 2. 1 rare
     * 3. 1 glazed pot
     */
    @Overwrite
    protected void updateTrades() {
        VillagerTrades.ITrade[] avillagertrades$itrade = VillagerTrades.WANDERING_TRADER_TRADES.get(1);
        VillagerTrades.ITrade[] avillagertrades$itrade1 = VillagerTrades.WANDERING_TRADER_TRADES.get(2);
        VillagerTrades.ITrade[] glazedPotTrades = VillagerTrades.WANDERING_TRADER_TRADES.get(3);
        if (avillagertrades$itrade != null && avillagertrades$itrade1 != null && glazedPotTrades != null) {
            MerchantOffers merchantoffers = this.getOffers();
            this.addOffersFromItemListings(merchantoffers, avillagertrades$itrade, 5);
            int i = this.random.nextInt(avillagertrades$itrade1.length);
            int glazedPotIndex = this.random.nextInt(glazedPotTrades.length);
            VillagerTrades.ITrade glazedPotTrade = glazedPotTrades[glazedPotIndex];
            VillagerTrades.ITrade villagertrades$itrade = avillagertrades$itrade1[i];
            MerchantOffer glazedPotOffer = glazedPotTrade.getOffer(this, this.random);
            MerchantOffer merchantoffer = villagertrades$itrade.getOffer(this, this.random);
            if (merchantoffer != null) {
                merchantoffers.add(merchantoffer);
            }
            if (glazedPotOffer != null) {
                merchantoffers.add(glazedPotOffer);
            }
        }
    }
}
