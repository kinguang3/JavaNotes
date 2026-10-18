public class AreaCalculator {
    public static void main(String[] args) {
        // 四个城市坐标 (纬度x, 经度y)
        // 亚特兰大
        double x1 = 33.7489954;
        double y1 = -84.3879824;
        // 夏洛特
        double x2 = 35.2270869;
        double y2 = -80.8431267;
        // 萨凡纳
        double x3 = 32.0835407;
        double y3 = -81.0998342;
        // 奥兰多
        double x4 = 28.5383355;
        double y4 = -81.3792365;

        // 鞋带公式
        double sum1 = x1*y2 + x2*y3 + x3*y4 + x4*y1;
        double sum2 = y1*x2 + y2*x3 + y3*x4 + y4*x1;
        double areaDegree = 0.5 * Math.abs(sum1 - sum2);

        System.out.println("经纬度平面面积(度²) = " + areaDegree);

        // =====换算成真实地表平方公里=====
        double avgLat = (x1+x2+x3+x4)/4.0;
        double kmPerLon = 111 * Math.cos(Math.toRadians(avgLat));
        double kmPerLat = 111;
        double areaKM2 = areaDegree * kmPerLat * kmPerLon;

        System.out.println("实际地表面积(km²) = " + areaKM2);
    }
}
