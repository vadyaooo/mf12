package Controllers;


import Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repo.UserRepo;

@RestController
@RequestMapping
@CrossOrigin
public class EnterCont {

    /*@Autowired
    private UserRepo userRepo;*/

    /*@PostMapping("/alltovarysort")
    public Iterable<Imeiitem> alltovarysort(@RequestBody Imeiitem imeiitem){
        Iterable<Imeiitem> imeiitemIterable = imeiitemRepository.findByMarkaContainingOrSerialnumberContainingOrFullnameContainingAndNalichiye(
                imeiitem.getMarka(), imeiitem.getMarka(), imeiitem.getMarka(), true
        );
        return imeiitemIterable;
    }*/

    @GetMapping("/")
    public String strv() {
        String items = "i am";
        return items;
    }

    /*@GetMapping("/alluser")
    public Iterable<User> alluser() {
        Iterable<User> items = userRepo.findAll();
        return items;
    }*/


}
