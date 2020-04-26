package controller;

import java.awt.Point;

import model.TabList;
import view.AtTheRate;
import view.CloseBracket;
import view.DoubleBar;
import view.GreaterThan;
import view.Hyphen;
import view.Icons;
import view.LessThan;
import view.OpenBracket;

/**
 * This is the factory class used to create and draw different icons on runtime.
 * 
 * @author Mayank Kataruka
 * @version 1.0
 */

public class IconFactory {

	private TabList tabList;

	public IconFactory() {
		tabList = TabList.getInstance();
	}

	/**
	 * This method creates an instance of the selected icon and draws it.
	 * 
	 * @param point
	 * @param icon
	 * @param graphics
	 * @return
	 */
	public Icons getIconObject(Point point, String icon) {
		if (tabList.getOpenBracket().equals(icon) || tabList.getOpenBracketClassName().equals(icon)) {
			return new OpenBracket(point);
		} else if (tabList.getCloseBracket().equals(icon) || tabList.getCloseBracketClassName().equals(icon)) {
			return new CloseBracket(point);
		} else if (tabList.getLessThan().equals(icon)|| tabList.getLessThanClassName().equals(icon)) {
			return new LessThan(point);
		} else if (tabList.getGreaterThan().equals(icon)|| tabList.getGreaterThanClassName().equals(icon)) {
			return new GreaterThan(point);
		} else if (tabList.getAtTheRate().equals(icon)|| tabList.getAtTheRateClassName().equals(icon)) {
			return new AtTheRate(point);
		} else if (tabList.getHyphen().equals(icon)|| tabList.getHyphenClassName().equals(icon)) {
			return new Hyphen(point);
		} else if (tabList.getBars().equals(icon) || tabList.getBarsClassName().equals(icon)) {
			return new DoubleBar(point);
		}
		return null;
	}
}
