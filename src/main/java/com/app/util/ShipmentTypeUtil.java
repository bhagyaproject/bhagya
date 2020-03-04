package com.app.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class ShipmentTypeUtil {

	public void generatePie(String path, List<Object[]> data) {

		// 1.create dataset
		DefaultPieDataset dataset = new DefaultPieDataset();
		for (Object[] arr : data) {
			// key-shipMode, val-count
			dataset.setValue(arr[0].toString(), Double.valueOf(arr[1].toString()));

			// 2. Create JFreeChart using ChartFactory
			JFreeChart chart = ChartFactory.createPieChart3D("ShipmentTypeModes", dataset, true, true, false);

			// 3. save as Image using ChartUtils
			try {
				ChartUtils.saveChartAsJPEG(new File(path + "/resources/images/shipmentA.png"), chart, 400, 400);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void generateBar(String pathBar, List<Object[]> dataBar) {
		// 1. Create DataSet
		DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
		for (Object[] arr : dataBar) {
			// val-index-1(y-axis), key-index-0(x-axis)
			dataset1.setValue(Double.valueOf(arr[1].toString()), arr[0].toString(), "");
		}
		// 2. Create JFreeChart using ChartFactory
		JFreeChart chart = ChartFactory.createBarChart("ShipmentType Mode", "Modes", "COUNT", dataset1);

		// 3. Save as Image using ChartUtil
		try {
			ChartUtils.saveChartAsJPEG(new File(pathBar + "/resources/images/shipmentB.png"), chart, 400, 400);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
