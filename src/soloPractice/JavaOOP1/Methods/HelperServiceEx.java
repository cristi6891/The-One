package soloPractice.JavaOOP1.Methods;

public class HelperServiceEx {

    private String formatNumber(int value) {
        return String.format("%d", value);
    }

    private String formatNumber(double value) {
        return String.format("%.3f", value);
    }

    private String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }


    public static void main(String[] args) {
        HelperServiceEx hsx = new HelperServiceEx();
        System.out.println(hsx.formatNumber(500));
        System.out.println(hsx.formatNumber(89.995));
        System.out.println(hsx.formatNumber("557"));
    }
}
