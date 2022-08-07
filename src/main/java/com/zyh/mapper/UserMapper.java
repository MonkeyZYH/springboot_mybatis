package com.zyh.mapper;
import com.zyh.entity.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserMapper {

    List<User> findAll();
}
