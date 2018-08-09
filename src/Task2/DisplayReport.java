package Task2;

import java.util.List;

public class DisplayReport implements IReport {
    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to dipslay");
        for(ReportItem item : items){
            System.out.format("Display: %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
