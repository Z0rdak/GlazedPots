package de.z0rdak.glazedpots.event;

import de.z0rdak.glazedpots.GlazedPots;
import de.z0rdak.glazedpots.register.ModItems;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.item.Item;
import net.minecraftforge.common.BasicTrade;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.stream.Collectors;

@Mod.EventBusSubscriber(modid = GlazedPots.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class WanderingTraderTradeSetup {

    /**
     * Adds trades for all glazed pots to a third trade list of the wandering trader
     * @param event
     */
    @SubscribeEvent()
    public static void onWanderingTraderTradesLoad(WandererTradesEvent event){
        List<VillagerTrades.ITrade> glazedPotTradesList = ModItems.REGISTERED_ITEMS.stream()
                .map(RegistryObject::get)
                .map(Item::getDefaultInstance)
                .map(a -> new BasicTrade(5, a,1 ,50))
                .collect(Collectors.toList());
        VillagerTrades.ITrade[] glazedPotTrades = new VillagerTrades.ITrade[glazedPotTradesList.size()];
        glazedPotTradesList.toArray(glazedPotTrades);

        VillagerTrades.WANDERING_TRADER_TRADES.put(3, glazedPotTrades);
    }
}
