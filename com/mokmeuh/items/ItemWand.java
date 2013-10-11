package mokmeuh.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemWand extends Item
{
	public ItemWand(int id)
	{
		super(id);

		setCreativeTab(CreativeTabs.tabCombat);
		setMaxStackSize(1);
	}

	@Override
	public boolean itemInteractionForEntity(ItemStack itemStack, EntityPlayer player, EntityLivingBase target)
	{
		if (!target.worldObj.isRemote)
		{
			target.motionY = 3;
		}

		return false;
	}

}
