package org.jfree.chart;


import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.ui.TextAnchor;

/**
 * @see org.jfree.chart.plot.PlotOrientation#VERTICAL
 */
public class Vertical extends Orientation 
{
	public void createBarChart(BarRenderer renderer) 
	{
		ItemLabelPosition position1 = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.BOTTOM_CENTER);
		renderer.setDefaultPositiveItemLabelPosition(position1);
		ItemLabelPosition position2 = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE6, TextAnchor.TOP_CENTER);
		renderer.setDefaultNegativeItemLabelPosition(position2);
	}
}