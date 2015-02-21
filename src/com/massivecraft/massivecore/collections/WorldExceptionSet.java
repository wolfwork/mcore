package com.massivecraft.massivecore.collections;

import org.bukkit.World;

import com.massivecraft.massivecore.CaseInsensitiveComparator;

public class WorldExceptionSet
{
	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //
	
	public boolean standard = true;
	
	public MassiveTreeSet<String, CaseInsensitiveComparator> exceptions = new MassiveTreeSet<String, CaseInsensitiveComparator>(CaseInsensitiveComparator.get());
	
	// -------------------------------------------- //
	// CONTAINS
	// -------------------------------------------- //
	
	public boolean contains(String world)
	{
		if (this.exceptions.contains(world)) return !this.standard;
		return this.standard;
	}
	
	public boolean contains(World world)
	{
		return this.contains(world.getName());
	}

}
