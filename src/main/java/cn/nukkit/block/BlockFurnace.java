package cn.nukkit.block;

import cn.nukkit.utils.BlockColor;

/**
 * author: Angelic47
 * Nukkit Project
 */
public class BlockFurnace extends BlockFurnaceBurning {

    public BlockFurnace() {
        this(0);
    }

    public BlockFurnace(int meta) {
        super(meta);
    }

    @Override
    public String getName() {
        return "Furnace";
    }

    @Override
    public int getId() {
        return FURNACE;
    }

    @Override
    public int getLightLevel() {
        return 0;
    }
    
    @Override
    public BlockColor getColor(){
        return BlockColor.STONE_BLOCK_COLOR;
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
}