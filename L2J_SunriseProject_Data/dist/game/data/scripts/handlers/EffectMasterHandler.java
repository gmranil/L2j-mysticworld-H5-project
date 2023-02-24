package handlers;

import l2r.gameserver.handler.EffectHandler;
import l2r.gameserver.model.effects.L2Effect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import handlers.effecthandlers.*;

/**
 * Effect Master handler.
 * @author vGodFather
 */
public final class EffectMasterHandler
{
	private static final Logger _log = LoggerFactory.getLogger(EffectMasterHandler.class);
	
	private static final Class<?>[] SCRIPTS =
	{
		AddHate.class,
		RebalanceHP.class,
		Betray.class,
		BigHead.class,
		Blink.class,
		BlockAction.class,
		BlockBuff.class,
		BlockBuffSlot.class,
		BlockChat.class,
		BlockDamage.class,
		BlockDebuff.class,
		BlockParty.class,
		BlockResurrection.class,
		Bluff.class,
		Buff.class,
		CallParty.class,
		CallPc.class,
		Cancel.class,
		CancelDebuff.class,
		ChameleonRest.class,
		ChanceSkillTrigger.class,
		ChangeFace.class,
		ChangeHairColor.class,
		ChangeHairStyle.class,
		ClanGate.class,
		Confusion.class,
		ConsumeBody.class,
		ConvertItem.class,
		CpHeal.class,
		CpHealOverTime.class,
		CpHealPercent.class,
		CrystalGradeModify.class,
		CubicMastery.class,
		CpDamPercent.class,
		DamOverTime.class,
		DamOverTimePercent.class,
		DeathLink.class,
		Debuff.class,
		DeleteHate.class,
		DeleteHateOfMe.class,
		DetectHiddenObjects.class,
		Detection.class,
		Disarm.class,
		DispelAll.class,
		DispelByCategory.class,
		DispelBySlot.class,
		DispelBySlotProbability.class,
		DispelOne.class,
		EnableCloak.class,
		EnemyCharge.class,
		EnergyAttack.class,
		EnlargeAbnormalSlot.class,
		FakeDeath.class,
		Flag.class,
		Fear.class,
		Fishing.class,
		FocusEnergy.class,
		FocusMaxEnergy.class,
		FocusSouls.class,
		Fusion.class,
		GetAgro.class,
		GiveRecommendation.class,
		GiveSp.class,
		Grow.class,
		Harvesting.class,
		HeadquarterCreate.class,
		HealOverTime.class,
		HealPercent.class,
		Heal.class,
		Hide.class,
		HpByLevel.class,
		ImmobileBuff.class,
		ImmobilePetBuff.class,
		ImmobileUntilAttacked.class,
		Invincible.class,
		Lucky.class,
		MagicalAttackMp.class,
		ManaDamOverTime.class,
		ManaHeal.class,
		ManaHealByLevel.class,
		ManaHealOverTime.class,
		ManaHealPercent.class,
		MpConsumePerLevel.class,
		Mute.class,
		MySummonKill.class,
		NevitHourglass.class,
		NoblesseBless.class,
		OpenChest.class,
		OpenCommonRecipeBook.class,
		OpenDwarfRecipeBook.class,
		OutpostCreate.class,
		OutpostDestroy.class,
		Paralyze.class,
		Passive.class,
		PcBangPointUp.class,
		Petrification.class,
		PhysicalAttackHpLink.class,
		PhysicalAttackMute.class,
		PhysicalMute.class,
		ProtectionBlessing.class,
		Pumping.class,
		RandomizeHate.class,
		Recovery.class,
		Reeling.class,
		RefuelAirship.class,
		Relax.class,
		RemoveSouls.class,
		RemoveTarget.class,
		ResistSkill.class,
		Restoration.class,
		RestorationRandom.class,
		Resurrection.class,
		ResurrectionSpecial.class,
		Root.class,
		RunAway.class,
		ServitorShare.class,
		Signet.class,
		SignetAntiSummon.class,
		SignetMDam.class,
		SignetNoise.class,
		SilentMove.class,
		SingleTarget.class,
		SkillTurning.class,
		Sleep.class,
		SoulEating.class,
		Sow.class,
		Spoil.class,
		StealAbnormal.class,
		Stun.class,
		SummonAgathion.class,
		SummonCubic.class,
		SummonNpc.class,
		SummonPet.class,
		SummonTrap.class,
		ResistSkill.class,
		Sweeper.class,
		TakeCastle.class,
		TakeFort.class,
		TakeTerritoryFlag.class,
		TalismanSlot.class,
		TargetMe.class,
		TeleportToTarget.class,
		ThrowUp.class,
		TransferDamage.class,
		TransferHate.class,
		Transformation.class,
		TrapDetect.class,
		TrapRemove.class,
		TriggerSkillByAttack.class,
		TriggerSkillByAvoid.class,
		TriggerSkillByDamage.class,
		TriggerSkillBySkill.class,
		UnsummonAgathion.class,
		VitalityPointUp.class,
	};
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		final long startCache = System.currentTimeMillis();
		for (Class<?> c : SCRIPTS)
		{
			EffectHandler.getInstance().registerHandler((Class<? extends L2Effect>) c);
		}
		_log.info(EffectMasterHandler.class.getSimpleName() + ": Loaded " + EffectHandler.getInstance().size() + " handlers. (GenTime: {} ms) ", (System.currentTimeMillis() - startCache));
	}
}