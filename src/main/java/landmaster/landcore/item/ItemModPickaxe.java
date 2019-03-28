package landmaster.landcore.item;

import landmaster.landcore.*;
import net.minecraft.item.*;

public class ItemModPickaxe extends ItemPickaxe {
	public ItemModPickaxe(ToolMaterial material, String name) {
		super(material);
		setTranslationKey(name).setRegistryName(name);
		setCreativeTab(LandCore.creativeTab);
	}
}
