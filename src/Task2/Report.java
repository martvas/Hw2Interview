package Task2;

import java.util.*;

class Report {
    private List<ReportItem> items;    // Отчетные данные

    // расчет отчетных данных
    public void calculate() {
        items = new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float) 5));
        items.add(new ReportItem("Second", (float) 6));
    }

    public void output(OutputType outputType) {
        IReport iReport;
        if (outputType == OutputType.Printer) {
            iReport = new PrintReport();
        } else iReport = new DisplayReport();
        iReport.output(items);
    }
}