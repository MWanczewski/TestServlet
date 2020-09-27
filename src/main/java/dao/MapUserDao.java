package dao;

import model.AppUser;

import java.util.ArrayList;
import java.util.HashMap;

public class MapUserDao {

    private HashMap<Long, AppUser> userRepo = new HashMap<>();
    private Long currentFreeId = 0L;
    private static MapUserDao  instance;

    private MapUserDao() {

    }

    public static MapUserDao getInstance() {
        if(instance == null) {
            instance = new MapUserDao();
        }
        return instance;
    }

    public void addUser (AppUser user) {
        user.setId(++currentFreeId);
        userRepo.put(currentFreeId, user);
    }

    public ArrayList<AppUser> getAll() {
        return new ArrayList<>(userRepo.values());
    }

    public void remove(Long id) {
        userRepo.remove(id);
    }

    public void update(AppUser user) {
        userRepo.replace(user.getId(), user);
    }
}
