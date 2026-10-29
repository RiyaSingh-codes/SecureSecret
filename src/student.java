public class student implements Comparable<student> {
    public int age;
    public int weight;
    public String name;


    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", weight=" + weight +
                ", name=" + name +
                '}';
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public student(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;

    }
    @Override
    public int compareTo(student that){
        //this method is called for currnet object
        // we will define our sorting logic here
        //sort basis on age
        if(this.age == that.age){//if ages are same then compare the alphabet and print in apphabetic order
            return this.name.compareTo(that.name);
        }
        return this.age - that. age; // this sort in accending order
       // return that.age - this. age;// for decending order
    }
}
