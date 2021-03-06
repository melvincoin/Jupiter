package cn.nukkit.entity.item;

import cn.nukkit.Player;
import cn.nukkit.entity.Entity;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.network.protocol.AddEntityPacket;

public class EntityEnderCrystal extends Entity {

    public static final int NETWORK_ID = 71;

    @Override
    public float getWidth() {
        return 1.6f;
    }

    @Override
    public float getLength() {
        return 0.98f;
    }

    @Override
    public float getHeight() {
        return 0.7f;
    }

    @Override
    protected float getGravity() {
        return 0.5f;
    }

    @Override
    protected float getDrag() {
        return 0.1f;
    }

    @Override
    public boolean canCollide() {
        return false;
    }

    public EntityEnderCrystal(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    public boolean onUpdate(int currentTick) {
		return true;
    }

    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }

    @Override
    protected void initEntity() {
        super.initEntity();
    }

    @Override
    public void spawnTo(Player player) {
        AddEntityPacket packet = new AddEntityPacket();
        packet.type = EntityEnderCrystal.NETWORK_ID;
        packet.entityUniqueId = this.getId();
        packet.entityRuntimeId = getId();
        packet.x = (float) x;
        packet.y = (float) y;
        packet.z = (float) z;
        packet.speedX = (float) motionX;
        packet.speedY = (float) motionY;
        packet.speedZ = (float) motionZ;
        packet.yaw = (float) yaw;
        packet.pitch = (float) pitch;
        packet.metadata = dataProperties;
        player.dataPacket(packet);
        super.spawnTo(player);
    }

}
