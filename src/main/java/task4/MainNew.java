/**
 * Використовуючи MySQL Workbench, переписати базу даних так, щоб одну книгу могли б написати кілька авторів,
 * також один автор може написати кілька книг. Реалізувати зв'язок багато-до-багатьох.
 */

package task4;
import jakarta.persistence.*;

public class MainNew {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("authorhelper");
        EntityManager em = factory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
    }
}

