package lion.friend.service;

import lion.friend.dao.FriendDAO;
import lion.friend.dto.FriendDTO;

import java.util.List;

public class FriendService {
    private final FriendDAO friendDAO = new FriendDAO();

    public boolean addFriend(String name, String phone, String email) {
        if (name == null || name.isBlank()) {
            return false;
        }

        if (phone == null || phone.isBlank()) {
            return false;
        }

        FriendDTO friendDTO = new FriendDTO(name, phone, email);
        return friendDAO.insert(friendDTO) > 0;
    }

    public FriendDTO getFriend(long id) {
        return friendDAO.selectOne(id);
    }

    public List<FriendDTO> getAllFriends() {
        return friendDAO.selectAll();
    }

    public boolean modifyFriend(long id, String name, String phone, String email) {
        if (name == null || name.isBlank()) {
            return false;
        }

        if (phone == null || phone.isBlank()) {
            return false;
        }

        FriendDTO friendDTO = new FriendDTO(id, name, phone, email);
        return friendDAO.update(friendDTO) > 0;
    }

    public boolean removeFriend(long id) {
        return friendDAO.delete(id) > 0;
    }
}
