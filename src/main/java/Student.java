public class Student
{
    private int StudentID;
    private String firstName;
    private String lastName;
    private int marksSub1;
    private float marksSub2;
    private float marksSub3;
    private float marksSub4;
    private float marksSub5;
    private float total;
    private float percentage;
    private String result;

    public int getStudentID()
    {
        return StudentID;
    }

    public void setStudentID(int studentID)
    {
        StudentID = studentID;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMarksSub1()
    {
        return marksSub1;
    }

    public void setMarksSub1(int marksSub1)
    {
        this.marksSub1 = marksSub1;
    }

    public float getMarksSub2()
    {
        return marksSub2;
    }

    public void setMarksSub2(float marksSub2)
    {
        this.marksSub2 = marksSub2;
    }

    public float getMarksSub3()
    {
        return marksSub3;
    }

    public void setMarksSub3(float marksSub3)
    {
        this.marksSub3 = marksSub3;
    }

    public float getMarksSub4()
    {
        return marksSub4;
    }

    public void setMarksSub4(float marksSub4)
    {
        this.marksSub4 = marksSub4;
    }

    public float getMarksSub5()
    {
        return marksSub5;
    }

    public void setMarksSub5(float marksSub5)
    {
        this.marksSub5 = marksSub5;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total)
    {
        this.total = total;
    }

    public float getPercentage()
    {
        return percentage;
    }

    public void setPercentage(float percentage)
    {
        this.percentage = percentage;
    }
    public void calculateTotal()
    {
        total = marksSub1 + marksSub2 + marksSub3 + marksSub4 + marksSub5;

    }
    public void calculatePercentage()
    {
        percentage = total/5 * 100;
    }
    public String getResult()
    {
        return result;
    }
    public void generateResult()
    {
        if (calculateResult()) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
    private boolean calculateResult()
    {

        int count=0;
        if (marksSub1<50)
        {
            count++;
        }
        if(marksSub2<50)
        {
            count++;
        }
        if(marksSub3<50)
        {
            count++;
        }
        if(marksSub4<50)
        {
            count++;
        }
        if(marksSub5<50)
        {
            count++;
        }
        if(count>=2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String getfullName()

    {
        return firstName + "  " + lastName;
    }

    public void setResult(String result)
    {
        this.result = result;
    }


    public void display() {

    }

}
