package repo;

import Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    List<User> getAllByFirstname(String a);
    /*List<User> findDistinctByItem_IdAndNalichiye(int id, boolean e);
    List<User> findDistinctByItem_Id(int id);
    List<User> findByNalichiye(boolean e);

    List<User> findDistinctByMarkaStartingWithAndFullnameStartingWithAndSerialnumberStartingWithAndIdStartingWith(String a, String b, String c, int d);
    List<User> findByMarkaContainingOrSerialnumberContainingOrFullnameContainingAndNalichiye(String c, String a, String b, boolean r);
    //List<Imeiitem> findAllByMarkaContainingOrFullnameContainingOrSerialnumberContainingOrId(String a);
    List<User> findAllByItem_Typetech(String a);*/

}

