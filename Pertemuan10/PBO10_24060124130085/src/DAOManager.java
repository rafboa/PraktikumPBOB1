public class DAOManager {
    private PersonDAO personDAO;

    public DAOManager() {
        this.personDAO = new MySQLPersonDAO();
    }

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
