
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poseidonsgatemainmod.init;

import net.mcreator.poseidonsgatemainmod.procedures.PoesidensTridentToolInInventoryTickProcedure;
import net.mcreator.poseidonsgatemainmod.procedures.CoreOfTheSeaRightclickedProcedure;
import net.mcreator.poseidonsgatemainmod.procedures.CoreOfTheSeaLivingEntityIsHitWithItemProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class PoseidonsGateMainModModProcedures {
	public static void load() {
		new PoesidensTridentToolInInventoryTickProcedure();
		new CoreOfTheSeaRightclickedProcedure();
		new CoreOfTheSeaLivingEntityIsHitWithItemProcedure();
	}
}
