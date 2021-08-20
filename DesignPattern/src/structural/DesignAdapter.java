package structural;

/*structural design pattern : adapter pattern*/

class Total
{
    float getTotal(float[] marks)
    {
        float sum = 0;
        for (float m: marks)
            sum += m;
        return sum;
    }
}
interface Result{
    float getPercentage(float[] marks);
    String getGrade(float[] marks);
}
class ResultAdapter implements Result
{
    Total t = new Total();
    public float getPercentage(float[] marks)
    {
        float totalMarks = t.getTotal(marks);
        float percentage = totalMarks/marks.length;
        return percentage;
    }
    public String getGrade(float[] marks)
    {
        String grade = "";
        float percentage = getPercentage(marks);
        if(percentage>90) grade = "A";
        else if(percentage>80) grade = "B";
        else grade = "C";
        return grade;
    }
}

public class DesignAdapter {
    public static void main(String[] args) {
        Result result = new ResultAdapter();
        float[] marks = {100,80,90};
        float percentage = result.getPercentage(marks);
        System.out.println(percentage);

    }
}
