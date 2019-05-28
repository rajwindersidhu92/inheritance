package com.lambton.college;

public class Student extends Person {
    private String course;
    private int marks[] = new int[6];
    private float total;
    private float percentage;
    private String results;

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getTotal() {
        calculateTotal();
        return total;
    }

    public float getPercentage() {
        calculatePercentage();
        return percentage;
    }

    public String getResults() {
        calculateResult();
        return results;
    }

    public void calculateTotal() {
        this.total = 0.0f;
        for (int i = 0; i < marks.length; i++) {
            this.total = total + marks[i];
        }
    }

    public void calculatePercentage() {
        this.percentage = this.total / this.marks.length;
    }

    public String calculateResult() {
        int passSubjects = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 50) {
                passSubjects++;
            }
        }
        if (passSubjects >= 4) {
            return calcuateAggregration();
        }
        return "Fail";

    }

    private String calcuateAggregration() {

        if (getPercentage() >= 94) {
            return "A+";
        } else if (getPercentage() >= 87) {
            return "A";
        } else if (getPercentage() >= 80) {
            return "A-";
        } else if (getPercentage() >= 77) {
            return "B+";
        } else if (getPercentage() >= 73) {
            return "B";
        } else if (getPercentage() >= 70) {
            return "B-";
        } else if (getPercentage() >= 67) {
            return "C+";
        } else if (getPercentage() >= 63) {
            return "C";
        } else if (getPercentage() > 60) {
            return "C-";
        } else {
            return "D";
        }


    }
}
