package de.z0rdak.glazedpots.data.server;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.storage.WorldSavedData;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class GlazedPotsWorldData extends WorldSavedData {

    private static final Map<UUID, Set<String>> PlayerCollectedPots = new HashMap<>();

    private GlazedPotsWorldData(String p_i2141_1_) {
        super(p_i2141_1_);
    }

    public boolean hasAllCollected(PlayerEntity player){
        return false;
    }

    @Override
    public void load(CompoundNBT p_76184_1_) {

    }

    @Override
    public CompoundNBT save(CompoundNBT p_189551_1_) {
        return null;
    }

    static class PlayerPotCollection{


        private final UUID playerUUID;
        private boolean firstCollected;
        private boolean hasAllCollected;
        private int amountCollected;
        private Set<String> collectedPots;

        public PlayerPotCollection(PlayerEntity player) {
            this.playerUUID = player.getUUID();
        }
    }
}
