package dev.upcraft.cobwebs.util;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;

public interface WorldScheduler {

    void cobwebs$markPos(BlockPos pos, ParticleOptions particleType);
}
