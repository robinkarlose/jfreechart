package org.jfree.chart;


import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.ui.TextAnchor;

/**
 * @see org.jfree.chart.plot.PlotOrientation#HORIZONTAL
 */
public class Horizontal extends Orientation {
	public void createBarChart(BarRenderer renderer) {
		ItemLabelPosition position1 = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE3, TextAnchor.CENTER_LEFT);
		renderer.setDefaultPositiveItemLabelPosition(position1);
		ItemLabelPosition position2 = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE9, TextAnchor.CENTER_RIGHT);
		renderer.setDefaultNegativeItemLabelPosition(position2);
	}
}