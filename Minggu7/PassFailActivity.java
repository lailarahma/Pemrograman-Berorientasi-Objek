public class PassFailActivity extends GradeActivity {
    private double minimumPassingScore;
    public PassFailActivity(double min) {
    minimumPassingScore = min;
    }
    public char getGrade() {
    return super.getGrade();
    }
    }