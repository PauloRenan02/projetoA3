package projetoa3;

public class ProjetoA3 {

    public static void main(String[] args) {
        
        System.out.println("Ola, Mundo");
        
        
        Login login = new Login();
        login.setVisible(true);
        
        /*DB db = new DB("BancoDados.db");
        
        db.query("SELECT * from Animais");
        while(db.next()){
            int codigo = db.getInt("C�digo");
            String animal = db.getString("Nome Popular");
            System.out.println("C�digo: " + codigo);
            System.out.println("Nome Popular: " + animal);
        }
        db.closeConnection();*/
    }
    
}
