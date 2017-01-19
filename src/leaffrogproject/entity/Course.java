
package leaffrogproject.entity;


public class Course {
     int courseId;
    String Coursename, price, Mentor;
    
    public Course(){
        
    }
    public Course(int courseId, String Coursename,  String price,  String Mentor){
        this.courseId = courseId;
        this.Coursename = Coursename;
        this.Mentor=Mentor;
        this.price=price;
        
        
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCoursename() {
        return Coursename;
    }

    public void setCoursename(String Coursename) {
        this.Coursename = Coursename;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMentor() {
        return Mentor;
    }

    public void setMentor(String Mentor) {
        this.Mentor = Mentor;
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", Coursename=" + Coursename + ", price=" + price + ", Mentor=" + Mentor + '}';
    }
    
    
}
