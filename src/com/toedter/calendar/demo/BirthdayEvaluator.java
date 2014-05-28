package com.toedter.calendar.demo;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;

import com.toedter.calendar.IDateEvaluator;

public class BirthdayEvaluator implements IDateEvaluator {

	private Calendar calendar = Calendar.getInstance();
	private Color darkGreen = new Color(0x007F00);
	private Color lightGreen = new Color(0xbbebc8);

	@Override
	public boolean isSpecial(Date date) {
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) == Calendar.SEPTEMBER
		&& calendar.get(Calendar.DAY_OF_MONTH) == 21;
	}
	
	@Override
	public Color getSpecialForegroundColor() {
		return darkGreen;
	}

	@Override
	public Color getSpecialBackroundColor() {
		return lightGreen;
	}

	@Override
	public String getSpecialTooltip() {
		return "Kai's Birthday";
	}

	@Override
	public boolean isInvalid(Date date) {
		return false;
	}
	
	@Override
	public Color getInvalidForegroundColor() {
		return null;
	}

	@Override
	public Color getInvalidBackroundColor() {
		return null;
	}

	@Override
	public String getInvalidTooltip() {
		return null;
	}

}
