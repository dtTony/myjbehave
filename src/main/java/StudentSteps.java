import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentSteps { // look, Ma, I'm a POJO!!

    private ClassRoom classRoom;
    private Student student;

    @Given("There is a student")
    public void initStudent() {
        student = new Student();
    }

    @Given("his name is '$name'")
    public void setName(@Named("name")String name) {
        student.setName(name);
    }

    @Given("his age is '$age'")
    public void setAge(@Named("age")Integer age) {
        student.setAge(age);
    }

    @Given("his hobby is '$hobby'")
    public void setHobby(@Named("hobbu")String hobby) {
        student.setHobby(hobby);
    }

    @Given("his father's name is '$fatherName'")
    public void setFatherName(@Named("fatherName")String fatherName) {
        student.setFatherName(fatherName);
    }

    @Given("his mother's name is '$motherName'")
    public void setMotherName(@Named("motherName")String motherName) {
        student.setMotherName(motherName);
    }

    @Given("his brother's name is '$brotherName'")
    public void setBrotherName(@Named("brotherName")String brotherName) {
        student.setBrotherName(brotherName);
    }

    @When("system add the student into class")
    public void addStudentIntoClass(){
        classRoom = new ClassRoom();
        classRoom.addStudent(student);
    }

    @Then("we can get student '$studentName' from class")
    public void checkGetStudent(@Named("studentName")String studentName){
        assertThat(student, is(classRoom.getStudent(studentName)));
    }

}
