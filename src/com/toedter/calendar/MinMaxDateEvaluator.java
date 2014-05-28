package com.toedter.calendar;

import java.awt.Color;
import java.util.Date;

public class MinMaxDateEvaluator implements IDateEvaluator {

	private DateUtil dateUtil = new DateUtil();
	
	@Override
	public boolean isSpecial(Date date) {
		return false;
	}

	@Override
	public Color getSpecialForegroundColor() {
		return null;
	}

	@Override
	public Color getSpecialBackroundColor() {
		return null;
	}

	@Override
	public String getSpecialTooltip() {
		return null;
	}

	@Override
	public boolean isInvalid(Date date) {
		return !dateUtil.checkDate(date);
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

	/**
	 * Sets the maximum selectable date. If null, the date 01\01\9999 will be
	 * set instead.
	 * 
	 * @param max
	 *            the maximum selectable date
	 * 
	 * @return the maximum selectable date
	 */
	public Date setMaxSelectableDate(Date max) {
		return dateUtil.setMaxSelectableDate(max);
	}

	/**
	 * Sets the minimum selectable date. If null, the date 01\01\0001 will be
	 * set instead.
	 * 
	 * @param min
	 *            the minimum selectable date
	 * 
	 * @return the minimum selectable date
	 */
	public Date setMinSelectableDate(Date min) {
		return dateUtil.setMinSelectableDate(min);
	}

	/**
	 * Gets the maximum selectable date.
	 * 
	 * @return the maximum selectable date
	 */
	public Date getMaxSelectableDate() {
		return dateUtil.getMaxSelectableDate();
	}

	/**
	 * Gets the minimum selectable date.
	 * 
	 * @return the minimum selectable date
	 */
	public Date getMinSelectableDate() {
		return dateUtil.getMinSelectableDate();
	}

}
