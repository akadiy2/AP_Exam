import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AP_Exam {

    public static void main (String [] args) {
        Delimeters d = new Delimeters("<sup>", "</sup>");
        List<String> clist = Arrays.asList("<sup>", "<sup>", "</sup>", "</sup>");
        List<String> alist = Collections.singletonList("</sup>");
        List<String> blist = Arrays.asList("<sup>", "<sup>", "</sup>");
        System.out.println(d.isBalanced(alist));
        System.out.println(d.isBalanced(blist));
        System.out.println(d.isBalanced(clist));
        /*
        StepTracker st = new StepTracker(10000);
        System.out.println("Active days so far = " + st.activeDays());
        System.out.println("Average steps so far = " + st.averageSteps());
        st.addDailySteps(9000);
        st.addDailySteps(5000);
        System.out.println("Active days so far = " + st.activeDays());
        System.out.println("Average steps so far = " + st.averageSteps());
        st.addDailySteps(13000);
        System.out.println("Active days so far = " + st.activeDays());
        System.out.println("Average steps so far = " + st.averageSteps());
        st.addDailySteps(23000);
        st.addDailySteps(1111);
        System.out.println("Active days so far = " + st.activeDays());
        System.out.println("Average steps so far = " + st.averageSteps());*/
    }
    private static boolean isLeapYear(int year) {
        // implementation not shown
        return true;
    }
    public static int numberOfLeapYears(int year1, int year2) {
        int count = 0; // + 1
        while (year1 < year2) { // + 1
            if (isLeapYear(year1)) { // +1
                count++; // + 1
            }

            year1++;
        }

        return count; // +1
    }

    // implementation not shown
    private int firstDayOfYear(int year) {
        return 0;
    }

    // implementation not shown
    private int dayOfYear(int month, int day, int year) {
        return 0;
    }

// IDK!!!!!!!
    public static int dayOfWeek(int month, int dat, int year) {
        // not sure yet
        return 0;
    }


}


