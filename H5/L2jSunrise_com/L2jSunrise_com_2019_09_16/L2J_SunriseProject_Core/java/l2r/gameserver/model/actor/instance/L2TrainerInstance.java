/*
 * Copyright (C) 2004-2015 L2J Server
 * 
 * This file is part of L2J Server.
 * 
 * L2J Server is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * L2J Server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package l2r.gameserver.model.actor.instance;

import l2r.gameserver.enums.InstanceType;
import l2r.gameserver.model.actor.templates.L2NpcTemplate;

public class L2TrainerInstance extends L2NpcInstance
{
	/**
	 * Creates a trainer.
	 * @param template the trainer NPC template
	 */
	public L2TrainerInstance(L2NpcTemplate template)
	{
		super(template);
		setInstanceType(InstanceType.L2TrainerInstance);
	}
	
	@Override
	public String getHtmlPath(int npcId, int val)
	{
		final String pom = val == 0 ? "" + npcId : npcId + "-" + val;
		return "data/html/trainer/" + pom + ".htm";
	}
}