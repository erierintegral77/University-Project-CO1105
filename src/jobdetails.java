public class jobdetails {
    public static void main(String[] args) {
        Job job = new Job("Software Engineer", 1800, 3124);
        personjob person = new personjob(job);
        System.out.println("ID of person: " + person.getJob().getId());
        System.out.println("Salary of person: " + person.getJob().getSalary());
        System.out.println("Role of person: " + person.getJob().getRole());
    }
}
