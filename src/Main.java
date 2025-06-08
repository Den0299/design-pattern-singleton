public class Main {
    public static void main(String[] args) {
        // Primo "oggetto" User: ottieni istanza singleton e stampa info di default
        User user1 = User.getInstance();
        user1.stampaInfo();  // Nome: Default Nome, Età: 0

        // Secondo "oggetto" User: stessa istanza, modifico dati
        User user2 = User.getInstance();
        user2.setNome("Mario");
        user2.setEta(30);

        // Stampa: user1 e user2 sono la stessa istanza!
        user1.stampaInfo();  // Nome: Mario, Età: 30
        user2.stampaInfo();  // Nome: Mario, Età: 30
    }
}
