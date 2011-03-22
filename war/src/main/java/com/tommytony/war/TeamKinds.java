package com.tommytony.war;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;

/**
 * 
 * @author tommytony
 *
 */
public class TeamKinds {
	private static final List<TeamKind> teamKinds = new ArrayList<TeamKind>();  

	static {

		getTeamkinds().add(new TeamKind("Water", Material.LAPIS_BLOCK, (byte) 3, ChatColor.BLUE));
		getTeamkinds().add(new TeamKind("Air", Material.GLASS, (byte) 4, ChatColor.YELLOW)); // yellow = gold
		getTeamkinds().add(new TeamKind("Earth", Material.SOUL_SAND, (byte) 5, ChatColor.GREEN));
		getTeamkinds().add(new TeamKind("Fire", Material.NETHERRACK, (byte) 14, ChatColor.RED));
		getTeamkinds().add(new TeamKind("Admins", Material.SPONGE, (byte) 15, ChatColor.BLACK));
	}
	
	public static TeamKind teamKindFromString(String str) {
		String lowered = str.toLowerCase();
		for(TeamKind kind : getTeamkinds()) {
			if(kind.getDefaultName().startsWith(str)) {
				return kind;
			}
		}
		return null;
	}

	public static List<TeamKind> getTeamkinds() {
		return teamKinds;
	}
}

