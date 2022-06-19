package net.maplenotes.furnacetools.tools.extendcut;

import net.maplenotes.furnacetools.materials.Material;
import net.maplenotes.furnacetools.tools.FurnaceHoe;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ExtendCutHoe extends FurnaceHoe {

	public ExtendCutHoe(Material material) {
		super(material);
	}
	
	@Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos orig, EntityLivingBase entityLiving) {
        return true;
    }

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		return EnumActionResult.SUCCESS;
	}

}
