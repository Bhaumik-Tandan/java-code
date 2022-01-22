import java.util.Scanner;

class StudentBase
{
    String name,dob,blood_group,nationality,registerNumber;
}

class Course
{
    int credits,gradePoint;
}

class Academics extends StudentBase
{
    int overAllGrade,numberOfCourses;
    Course[] c;
    int totalCredits;
}

class q4{
    static String getGrade(int gp)
    {
        if(gp>=90)
            return "S";
        else if(gp>=8)
            return "A";
        else if(gp>=7)
            return "B";
        else if(gp>=6)
            return "C";
        else if(gp>=5)
            return "D";
        else if(gp>=4)
            return "E";
        else
            return "F";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Academics[] a = new Academics[n];

        for(int i=0;i<n;i++)
        {
            a[i] = new Academics();
            System.out.print("Enter the details of student "+(i+1)+":-\n");
            System.out.print("Enter the name: ");
            a[i].name = sc.next();
            System.out.print("Enter the date of birth: ");
            a[i].dob = sc.next();
            System.out.print("Enter the blood group: ");
            a[i].blood_group = sc.next();
            System.out.print("Enter the nationality: ");
            a[i].nationality=sc.next();
            System.out.print("Enter the registration number: ");
            a[i].registerNumber=sc.next();
            System.out.print("Enter the number of courses: ");
            a[i].numberOfCourses = sc.nextInt();
            a[i].c = new Course[a[i].numberOfCourses];
            a[i].totalCredits=0;
            for(int j=0;j<a[i].numberOfCourses;j++)
            {
                a[i].c[j] = new Course();
                System.out.print("Enter the credits of course "+(j+1)+":");
                a[i].c[j].credits = sc.nextInt();
                System.out.print("Enter the grade point of course "+(j+1)+":");
                a[i].c[j].gradePoint = sc.nextInt();
                a[i].totalCredits+=a[i].c[j].credits;
            }

            a[i].overAllGrade = 0;
            for(int j=0;j<a[i].numberOfCourses;j++)
                a[i].overAllGrade += a[i].c[j].gradePoint*a[i].c[j].credits;

            a[i].overAllGrade = a[i].overAllGrade/a[i].totalCredits;
        }

        for(int i=0;i<n;i++)
        {
            if(a[i].totalCredits>25)
            {
                System.out.println("The details of student "+(i+1)+":");
                System.out.println("Name: "+a[i].name);
                System.out.println("Date of birth: "+a[i].dob);
                System.out.println("Blood group: "+a[i].blood_group);
                System.out.println("Nationality: "+a[i].nationality);
                System.out.println("Registration number: "+a[i].registerNumber);
                System.out.println("Overall grades: "+getGrade(a[i].overAllGrade));
                System.out.println("Number of courses: "+a[i].numberOfCourses);
                for(int j=0;j<a[i].numberOfCourses;j++)
                {
                    System.out.println("Credits of course "+(j+1)+": "+a[i].c[j].credits);
                    System.out.println("Grade point of course "+(j+1)+": "+a[i].c[j].gradePoint);
                }
                System.out.println("Total credits: "+a[i].totalCredits);
            }
        }
    }
}
