package lion.friend.dao;

import lion.friend.common.DBUtil;
import lion.friend.dto.FriendDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FriendDAO {
    public int insert(FriendDTO friendDTO) {
        String sql = "INSERT INTO friend(name, phone, email) VALUES(?, ?, ?)";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, friendDTO.getName());
            ps.setString(2, friendDTO.getPhone());
            ps.setString(3, friendDTO.getEmail());

            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("등록 중 오류가 발생했습니다. " + e.getMessage());
            return 0;
        }
    }

    public FriendDTO selectOne(long id) {
        String sql = "SELECT id, name, phone, email FROM friend WHERE id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setLong(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    FriendDTO friendDTO = new FriendDTO();
                    friendDTO.setId(rs.getLong("id"));
                    friendDTO.setName(rs.getString("name"));
                    friendDTO.setPhone(rs.getString("phone"));
                    friendDTO.setEmail(rs.getString("email"));
                    return friendDTO;
                }
            }
        } catch (Exception e) {
            System.out.println("조회 중 오류가 발생했습니다. " + e.getMessage());
        }

        return null;
    }

    public List<FriendDTO> selectAll() {
        String sql = "SELECT id, name, phone, email FROM friend ORDER BY id";
        List<FriendDTO> list = new ArrayList<>();

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                FriendDTO friendDTO = new FriendDTO();
                friendDTO.setId(rs.getLong("id"));
                friendDTO.setName(rs.getString("name"));
                friendDTO.setPhone(rs.getString("phone"));
                friendDTO.setEmail(rs.getString("email"));
                list.add(friendDTO);
            }
        } catch (Exception e) {
            System.out.println("전체 조회 중 오류가 발생했습니다. " + e.getMessage());
        }

        return list;
    }

    public int update(FriendDTO friendDTO) {
        String sql = "UPDATE friend SET name = ?, phone = ?, email = ? WHERE id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, friendDTO.getName());
            ps.setString(2, friendDTO.getPhone());
            ps.setString(3, friendDTO.getEmail());
            ps.setLong(4, friendDTO.getId());

            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("수정 중 오류가 발생했습니다. " + e.getMessage());
            return 0;
        }
    }

    public int delete(long id) {
        String sql = "DELETE FROM friend WHERE id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setLong(1, id);
            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("삭제 중 오류가 발생했습니다. " + e.getMessage());
            return 0;
        }
    }
}
