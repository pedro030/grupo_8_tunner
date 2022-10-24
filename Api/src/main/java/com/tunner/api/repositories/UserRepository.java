package com.tunner.api.repositories;

import com.tunner.api.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User,Long> {
}
