package com.dmh10s.minecraftexpansion.entity;

import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.monster.EntityZombie;

public class EntityAIRunningZombieAttack extends EntityAIAttackMelee
{
    private final EntityRunningZombie zombie;
    private int raiseArmTicks;

    public EntityAIRunningZombieAttack(EntityRunningZombie entityRunningZombie, double speedIn, boolean longMemoryIn)
    {
        super(entityRunningZombie, speedIn, longMemoryIn);
        this.zombie = entityRunningZombie;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        super.startExecuting();
        this.raiseArmTicks = 0;
    }

    /**
     * Reset the task's internal state. Called when this task is interrupted by another one
     */
    public void resetTask()
    {
        super.resetTask();
        this.zombie.setArmsRaised(false);
    }

    /**
     * Keep ticking a continuous task that has already been started
     */
    public void updateTask()
    {
        super.updateTask();
        ++this.raiseArmTicks;

        if (this.raiseArmTicks >= 5 && this.attackTick < 10)
        {
            this.zombie.setArmsRaised(true);
        }
        else
        {
            this.zombie.setArmsRaised(false);
        }
    }
}