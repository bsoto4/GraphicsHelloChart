package com.doapps.luis.a14versiontest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.view.LineChartView;

public class MainActivity extends AppCompatActivity {

    private LineChartView lineChartView;
    private LineChartData lineChartData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lineChartView = (LineChartView) findViewById(R.id.chart);

        List<Line> lines = new ArrayList<>();

        List<PointValue> pointValueList;
        pointValueList = new ArrayList<>();
        PointValue pointValue;
        pointValue = new PointValue(1, (float) 65.43);
        pointValueList.add(pointValue);
        pointValue = new PointValue(2, (float) 65.51);
        pointValueList.add(pointValue);
        pointValue = new PointValue(3, (float) 65.77);
        pointValueList.add(pointValue);
        pointValue = new PointValue(4, (float) 65.89);
        pointValueList.add(pointValue);
        pointValue = new PointValue(5, (float) 66.11);
        pointValueList.add(pointValue);
        pointValue = new PointValue(6, (float) 66.19);
        pointValueList.add(pointValue);
        pointValue = new PointValue(7, (float) 66.35);
        pointValueList.add(pointValue);
        pointValue = new PointValue(8, (float) 66.17);
        pointValueList.add(pointValue);
        pointValue = new PointValue(9, (float) 66.37);
        pointValueList.add(pointValue);
        pointValue = new PointValue(10, (float) 66.43);
        pointValueList.add(pointValue);
        pointValue = new PointValue(11, (float) 65.43);
        pointValueList.add(pointValue);
        pointValue = new PointValue(12, (float) 65.51);
        pointValueList.add(pointValue);
        pointValue = new PointValue(13, (float) 65.77);
        pointValueList.add(pointValue);
        pointValue = new PointValue(14, (float) 65.89);
        pointValueList.add(pointValue);
        pointValue = new PointValue(15, (float) 66.11);
        pointValueList.add(pointValue);
        pointValue = new PointValue(16, (float) 66.19);
        pointValueList.add(pointValue);
        pointValue = new PointValue(17, (float) 66.35);
        pointValueList.add(pointValue);
        pointValue = new PointValue(18, (float) 66.17);
        pointValueList.add(pointValue);
        pointValue = new PointValue(19, (float) 66.37);
        pointValueList.add(pointValue);
        pointValue = new PointValue(20, (float) 66.43);
        pointValueList.add(pointValue);


        Line line;
        line = new Line(pointValueList);
        //line.setCubic(true);
        lines.add(line);

        pointValueList = new ArrayList<>();
        pointValue = new PointValue(1, (float) 66.13);
        pointValueList.add(pointValue);
        pointValue = new PointValue(2, (float) 66.11);
        pointValueList.add(pointValue);
        pointValue = new PointValue(3, (float) 65.91);
        pointValueList.add(pointValue);
        pointValue = new PointValue(4, (float) 65.95);
        pointValueList.add(pointValue);
        pointValue = new PointValue(5, (float) 65.95);
        pointValueList.add(pointValue);
        pointValue = new PointValue(6, (float) 65.93);
        pointValueList.add(pointValue);
        pointValue = new PointValue(7, (float) 65.97);
        pointValueList.add(pointValue);
        pointValue = new PointValue(8, (float) 65.83);
        pointValueList.add(pointValue);
        pointValue = new PointValue(9, (float) 66.09);
        pointValueList.add(pointValue);
        pointValue = new PointValue(10, (float) 66.15);
        pointValueList.add(pointValue);
        pointValue = new PointValue(11, (float) 66.13);
        pointValueList.add(pointValue);
        pointValue = new PointValue(12, (float) 66.11);
        pointValueList.add(pointValue);
        pointValue = new PointValue(13, (float) 65.91);
        pointValueList.add(pointValue);
        pointValue = new PointValue(14, (float) 65.95);
        pointValueList.add(pointValue);
        pointValue = new PointValue(15, (float) 65.95);
        pointValueList.add(pointValue);
        pointValue = new PointValue(16, (float) 65.93);
        pointValueList.add(pointValue);
        pointValue = new PointValue(17, (float) 65.97);
        pointValueList.add(pointValue);
        pointValue = new PointValue(18, (float) 65.83);
        pointValueList.add(pointValue);
        pointValue = new PointValue(19, (float) 66.09);
        pointValueList.add(pointValue);
        pointValue = new PointValue(20, (float) 66.15);
        pointValueList.add(pointValue);

        line = new Line(pointValueList);
        //line.setCubic(true);
        lines.add(line);

        pointValueList = new ArrayList<>();
        pointValue = new PointValue(1, (float) 67.22);
        pointValueList.add(pointValue);
        pointValue = new PointValue(2, (float) 67.30);
        pointValueList.add(pointValue);
        pointValue = new PointValue(3, (float) 67.36);
        pointValueList.add(pointValue);
        pointValue = new PointValue(4, (float) 67.41);
        pointValueList.add(pointValue);
        pointValue = new PointValue(5, (float) 67.51);
        pointValueList.add(pointValue);
        pointValue = new PointValue(6, (float) 67.56);
        pointValueList.add(pointValue);
        pointValue = new PointValue(7, (float) 67.61);
        pointValueList.add(pointValue);
        pointValue = new PointValue(8, (float) 67.77);
        pointValueList.add(pointValue);
        pointValue = new PointValue(9, (float) 67.87);
        pointValueList.add(pointValue);
        pointValue = new PointValue(10, (float) 67.96);
        pointValueList.add(pointValue);
        pointValue = new PointValue(11, (float) 67.22);
        pointValueList.add(pointValue);
        pointValue = new PointValue(12, (float) 67.30);
        pointValueList.add(pointValue);
        pointValue = new PointValue(13, (float) 67.36);
        pointValueList.add(pointValue);
        pointValue = new PointValue(14, (float) 67.41);
        pointValueList.add(pointValue);
        pointValue = new PointValue(15, (float) 67.51);
        pointValueList.add(pointValue);
        pointValue = new PointValue(16, (float) 67.56);
        pointValueList.add(pointValue);
        pointValue = new PointValue(17, (float) 67.61);
        pointValueList.add(pointValue);
        pointValue = new PointValue(18, (float) 67.77);
        pointValueList.add(pointValue);
        pointValue = new PointValue(19, (float) 67.87);
        pointValueList.add(pointValue);
        pointValue = new PointValue(20, (float) 67.96);
        pointValueList.add(pointValue);

        line = new Line(pointValueList);
        //line.setCubic(true);
        lines.add(line);

        pointValueList = new ArrayList<>();
        pointValue = new PointValue(1, (float) 65.15);
        pointValueList.add(pointValue);
        pointValue = new PointValue(2, (float) 64.97);
        pointValueList.add(pointValue);
        pointValue = new PointValue(3, (float) 65.08);
        pointValueList.add(pointValue);
        pointValue = new PointValue(4, (float) 65.07);
        pointValueList.add(pointValue);
        pointValue = new PointValue(5, (float) 65.09);
        pointValueList.add(pointValue);
        pointValue = new PointValue(6, (float) 64.98);
        pointValueList.add(pointValue);
        pointValue = new PointValue(7, (float) 65.00);
        pointValueList.add(pointValue);
        pointValue = new PointValue(8, (float) 64.99);
        pointValueList.add(pointValue);
        pointValue = new PointValue(9, (float) 65.07);
        pointValueList.add(pointValue);
        pointValue = new PointValue(10, (float) 65.15);
        pointValueList.add(pointValue);
        pointValue = new PointValue(11, (float) 65.15);
        pointValueList.add(pointValue);
        pointValue = new PointValue(12, (float) 64.97);
        pointValueList.add(pointValue);
        pointValue = new PointValue(13, (float) 65.08);
        pointValueList.add(pointValue);
        pointValue = new PointValue(14, (float) 65.07);
        pointValueList.add(pointValue);
        pointValue = new PointValue(15, (float) 65.09);
        pointValueList.add(pointValue);
        pointValue = new PointValue(16, (float) 64.98);
        pointValueList.add(pointValue);
        pointValue = new PointValue(17, (float) 65.00);
        pointValueList.add(pointValue);
        pointValue = new PointValue(18, (float) 64.99);
        pointValueList.add(pointValue);
        pointValue = new PointValue(19, (float) 65.07);
        pointValueList.add(pointValue);
        pointValue = new PointValue(20, (float) 65.15);
        pointValueList.add(pointValue);

        line = new Line(pointValueList);
        //line.setCubic(true);
        lines.add(line);

        pointValueList = new ArrayList<>();
        pointValue = new PointValue(1, (float) 63.26);
        pointValueList.add(pointValue);
        pointValue = new PointValue(2, (float) 63.09);
        pointValueList.add(pointValue);
        pointValue = new PointValue(3, (float) 63.09);
        pointValueList.add(pointValue);
        pointValue = new PointValue(4, (float) 63.09);
        pointValueList.add(pointValue);
        pointValue = new PointValue(5, (float) 63.09);
        pointValueList.add(pointValue);
        pointValue = new PointValue(6, (float) 63.09);
        pointValueList.add(pointValue);
        pointValue = new PointValue(7, (float) 63.09);
        pointValueList.add(pointValue);
        pointValue = new PointValue(8, (float) 63.42);
        pointValueList.add(pointValue);
        pointValue = new PointValue(9, (float) 63.20);
        pointValueList.add(pointValue);
        pointValue = new PointValue(10, (float) 63.00);
        pointValueList.add(pointValue);
        pointValue = new PointValue(11, (float) 63.26);
        pointValueList.add(pointValue);
        pointValue = new PointValue(12, (float) 63.09);
        pointValueList.add(pointValue);
        pointValue = new PointValue(13, (float) 63.09);
        pointValueList.add(pointValue);
        pointValue = new PointValue(14, (float) 63.09);
        pointValueList.add(pointValue);
        pointValue = new PointValue(15, (float) 63.09);
        pointValueList.add(pointValue);
        pointValue = new PointValue(16, (float) 63.09);
        pointValueList.add(pointValue);
        pointValue = new PointValue(17, (float) 63.09);
        pointValueList.add(pointValue);
        pointValue = new PointValue(18, (float) 63.42);
        pointValueList.add(pointValue);
        pointValue = new PointValue(19, (float) 63.20);
        pointValueList.add(pointValue);
        pointValue = new PointValue(20, (float) 63.00);
        pointValueList.add(pointValue);


        line = new Line(pointValueList);
        //line.setCubic(true);
        lines.add(line);

        //--- add datas list 5 lines ---//
        addArrayLines(lines);

        lineChartView.setLineChartData(lineChartData);

        Viewport viewport = initViewPort();

        lineChartView.startDataAnimation(300);
        lineChartView.setMaximumViewport(viewport);
        lineChartView.setCurrentViewport(viewport);
    }


    private void addArrayLines(List<Line> Lines) {

        try {
            if (Lines.size() > 0 && !Lines.isEmpty()) {
                for (int i = 0; i < Lines.size(); i++) {
                    Line line = Lines.get(i);
                    //line1.setShape(ValueShape.CIRCLE);
                    line.setHasPoints(false);
                    line.setFilled(false);
                    line.setStrokeWidth(2);

                    if (i == 0) {
                        line.setColor(getResources().getColor(R.color.cyan_1));
                    } else if (i == 1) {
                        line.setColor(getResources().getColor(R.color.green_1));
                    } else if (i == 2) {
                        line.setColor(getResources().getColor(R.color.red_1));
                    } else if (i == 3) {
                        line.setColor(getResources().getColor(R.color.brown_1));
                    } else if (i == 4) {
                        line.setColor(getResources().getColor(R.color.orange_1));
                    } else {
                        line.setColor(getResources().getColor(R.color.lime_1));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lineChartData = initData(Lines);
        }

    }

    private Viewport initViewPort() {
        Viewport viewport = new Viewport();
        viewport.top = 100;
        viewport.bottom = 0;
        viewport.left = 0;
        viewport.right = 80;

        return viewport;
    }

    private LineChartData initData(List<Line> lines) {

        LineChartData data = new LineChartData(lines);
        Axis axisX = new Axis();
        Axis axisY = new Axis();

        axisX.setTextColor(Color.BLACK);
        axisX.setLineColor(Color.BLACK);
        axisX.setHasLines(true);

        axisY.setTextColor(Color.BLACK);
        axisY.setLineColor(Color.BLACK);
        axisY.setHasLines(true);

        axisX.setName("Días");
        axisY.setName("Alturas Geoidales");

        data.setAxisYLeft(axisY);
        data.setAxisXBottom(axisX);

        return data;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
