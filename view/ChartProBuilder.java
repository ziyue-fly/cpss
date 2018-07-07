/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.view;

import com.ouc.cpss.vo.ViewPro;
import java.awt.Font;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Administrator
 */
public class ChartProBuilder extends  JFrame {
    String title;
    static int choice = -1;
    static List<ViewPro> list;//数据集合
    public ChartProBuilder(String title,List list,int choice1) {
        super(title);
        choice = choice1;
        this.title = title;
        this.list = list;
        //设置关闭方式为销毁当前窗体
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        // 生成一个图表面板放到一个Frame里面
        this.setContentPane(createPanel());
    }

    private static CategoryDataset createDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // 核心
        int i = 0;
        if(choice == 1){
             for(ViewPro v : list){
                // 图表的数据，名称，横坐标
                //  一个商品的所有数据给dateset赋值 
                dataset.addValue(v.getTotalselcount(), v.getProname(),"第"+(i+1)+"名");
                i++;
            }
        }else if (choice == 2){
             for(ViewPro v : list){
                dataset.addValue(v.getTotalselmoney(), v.getProname(),"第"+(i+1)+"名");
                i++;
             }
        }else{
            return null;
        }
        return dataset;
    }

    private static JFreeChart createJFreeChart(CategoryDataset dataset) {
        /**
         * 构建JFreeChart
         */
        //创建主题样式     
        StandardChartTheme standardChartTheme = new StandardChartTheme("CN");
        //设置标题字体     
        standardChartTheme.setExtraLargeFont(new Font("隶书", Font.BOLD, 20));
        //设置图例的字体    
        standardChartTheme.setRegularFont(new Font("宋书", Font.PLAIN, 15));
        //设置轴向的字体     
        standardChartTheme.setLargeFont(new Font("宋书", Font.PLAIN, 15));
        //应用主题样式   
        ChartFactory.setChartTheme(standardChartTheme);
        //生成柱状图表
        // 去查怎么生成饼状图，折线图
        JFreeChart jfreeChart = null;
        if(choice == 1){
             jfreeChart = ChartFactory.createBarChart3D("商品销售统计 -- 销售总数量TOP10",
                "图例", "销售总数量", dataset, PlotOrientation.VERTICAL, true, false,false);
             /**
               * 设置JFreeChart的属性
               */
            jfreeChart.setTitle(new TextTitle("商品销售统计 -- 销售总数量TOP10", new Font("宋体", Font.BOLD
                    + Font.ITALIC, 20)));
            CategoryPlot plot = (CategoryPlot) jfreeChart.getPlot();
            CategoryAxis categoryAxis = plot.getDomainAxis();
            categoryAxis.setLabelFont(new Font("仿宋", Font.ROMAN_BASELINE, 12));
        }else{
             jfreeChart = ChartFactory.createBarChart3D("商品销售统计 -- 销售总金额TOP10",
                "图例", "销售总金额", dataset, PlotOrientation.VERTICAL, true, false,false);
             jfreeChart.setTitle(new TextTitle("商品销售统计 -- 销售总金额TOP10", new Font("宋体", Font.BOLD
                    + Font.ITALIC, 20)));
            CategoryPlot plot = (CategoryPlot) jfreeChart.getPlot();
            CategoryAxis categoryAxis = plot.getDomainAxis();
            categoryAxis.setLabelFont(new Font("仿宋", Font.ROMAN_BASELINE, 12));
        }
        return jfreeChart;
    }

    public static JPanel createPanel() { // 返回一个面板
        // 生成JFreeChart对象（依据数据生成图表）
        JFreeChart chart = createJFreeChart(createDataSet());
        return new ChartPanel(chart);
    }

}
