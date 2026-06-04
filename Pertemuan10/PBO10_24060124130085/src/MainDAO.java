public class MainDAO {
    public static void main(String[] args) throws Exception {
        DAOManager daoManager = new DAOManager();
        PersonDAO personDAO = daoManager.getPersonDAO();

        Person person1 = new Person("John Doe");
        personDAO.savePerson(person1);
        System.out.println("Inserted: " + person1.getNama());

        Person person2 = new Person("Jane Smith");
        personDAO.savePerson(person2);
        System.out.println("Inserted: " + person2.getNama());
        
        System.out.println("All data inserted successfully!");
    }
}
