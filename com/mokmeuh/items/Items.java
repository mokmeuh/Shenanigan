package mokmeuh.items;

import mokmeuh.lib.ItemInfo;
import net.minecraft.item.Item;

public class Items
{
	public static Item wand;

	public static void init()
	{
		wand = new ItemWand(ItemInfo.WAND_ID);
	}
}
